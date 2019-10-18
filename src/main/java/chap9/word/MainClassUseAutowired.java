package chap9.word;

import chap9.word.service.*;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClassUseAutowired {
    public static void main(String[] args) {

        String[] keyWords = {"c", "c++"};
        String[] values = {"C는 C다","C++은 C++이다"};

        GenericXmlApplicationContext ctxAw =
                new GenericXmlApplicationContext("classpath:appCtxUseAutowired.xml");

        WordRegisterServiceUseAutowired registerService =
                ctxAw.getBean("registerServiceUseAutowired", WordRegisterServiceUseAutowired.class);
        for(int i = 0; i < values.length; i++){
            WordSet wordSet = new WordSet(keyWords[i], values[i]);
            registerService.register(wordSet);
        }

        WordSearchServiceUseAutowired searchService =
                ctxAw.getBean("searchServiceUseAutowired", WordSearchServiceUseAutowired.class);

        System.out.println("\n\n---------------------------------");
        for (int i = 0; i < keyWords.length; i++) {
            WordSet wordSet = searchService.searchWord(keyWords[i]);
            System.out.print(wordSet.getWordKey() + "\t: ");
            System.out.println(wordSet.getWordValue());
            System.out.println("[출처:위키피디아(https://www.wikipedia.org/)]");
            System.out.println("---------------------------------");

        }
        System.out.println("\n\n");

        ctxAw.close();
    }
}
