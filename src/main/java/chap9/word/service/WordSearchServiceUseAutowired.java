package chap9.word.service;

import chap9.word.WordSet;
import chap9.word.dao.WordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class WordSearchServiceUseAutowired {

    @Autowired
    @Qualifier("usedDao")
    private WordDao wordDao;

    public WordSearchServiceUseAutowired(){

    }


    public WordSearchServiceUseAutowired(WordDao wordDao){
        this.wordDao = wordDao;
    }

    public WordSet searchWord(String wordKey){
        if(verify(wordKey)){
            return wordDao.select(wordKey);
        } else {
            System.out.println("WordKey information is available.");
        }

        return null;
    }

    public boolean verify(String wordKey){
        WordSet wordSet = wordDao.select(wordKey);
        return wordSet != null ? true : false;
    }

    public void setWordDao(WordDao wordDao){
        this.wordDao = wordDao;
    }

}
