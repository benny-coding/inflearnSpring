package chap9.word.service;

import chap9.word.WordSet;
import chap9.word.dao.WordDao;

public class WordSearchService {

    public WordSearchService(WordDao wordDao){

    }

    public WordSet searchWord(String keyWord){

        WordSet wordSet = new WordSet("0","a");

        return wordSet ;
    }

}
