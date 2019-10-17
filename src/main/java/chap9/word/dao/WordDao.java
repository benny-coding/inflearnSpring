package chap9.word.dao;

import chap9.word.WordSet;

import java.util.HashMap;

public class WordDao {

    private HashMap<String, WordSet> wordDB =
            new HashMap<String, WordSet>();

    public void insert(WordSet wordSet){
        wordDB.put(wordSet.getWordKey(), wordSet);
    }

    public WordSet select(String wordKey){
        return wordDB.get(wordKey);
    }

    public void update(WordSet wordKey){
        wordDB.put(wordKey.getWordKey(), wordKey);
    }

    public void delete(String sNum){
        wordDB.remove(sNum);
    }

    public HashMap<String, WordSet> getWordDB() {
        return wordDB;
    }
}
