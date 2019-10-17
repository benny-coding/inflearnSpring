package chap9.word.service;

import chap9.word.dao.WordDao;
import chap9.word.WordSet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class WordRegisterService {

    @Resource
    private WordDao wordDao;


    public WordRegisterService(WordDao wordDao){
        this.wordDao = wordDao;
    }

    public void register(WordSet wordSet){
        String wordKey = wordSet.getWordKey();
        if(verify(wordKey)){
            wordDao.insert(wordSet);
        } else {
            System.out.println("The word has alreay registered.");
        }
    }

    public boolean verify(String wordKey){
        WordSet wordSet = wordDao.select(wordKey);
        return wordSet == null ? true : false;
    }

    public void setWordDao(WordDao wordDao){
        this.wordDao = wordDao;
    }

}
