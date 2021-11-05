package com.said;

public abstract class SpamAnalyzer {
    private String[] keywords;

    //SpamAnalyzer должен конструироваться от массива строк с ключевыми словами.
    public  SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }
}
