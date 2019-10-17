package chap9.word;

import chap9.word.service.*;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        String[] keyWords = {"c", "c++", "java"};
        String[] values = {"C는 C다","C++은 C++이다","java는 java다"};

        GenericXmlApplicationContext ctx =
        new GenericXmlApplicationContext("classpath:appCtx.xml");

        WordRegisterService registerService =
                ctx.getBean("registerService", WordRegisterService.class);
        for(int i = 0; i < values.length; i++){
            WordSet wordSet = new WordSet(keyWords[i], values[i]);
            registerService.register(wordSet);
        }

        WordSearchService searchService =
                ctx.getBean("searchService", WordSearchService.class);

        System.out.println("\n\n---------------------------------");
        for (int i = 0; i < keyWords.length; i++) {
            WordSet wordSet = searchService.searchWord(keyWords[i]);
            System.out.print(wordSet.getWordKey() + "\t: ");
            System.out.println(wordSet.getWordValue());
            System.out.println("[출처:위키피디아(https://www.wikipedia.org/)]");
            System.out.println("---------------------------------");

        }
        System.out.println("\n\n");

        ctx.close();
    }
}
