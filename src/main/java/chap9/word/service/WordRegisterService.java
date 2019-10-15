package chap9.word.service;

import chap9.word.dao.WordDao;
import chap9.word.WordSet;

public class WordRegisterService {

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
        WordSet wordSet = WordDao.select(wordKey);
        return wordSet == null ? true : false;
    }

    public void setWordDao(WordDao wordDao){
        this.wordDao = wordDao;
    }

}
