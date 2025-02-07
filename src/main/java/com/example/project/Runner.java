package com.example.project;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("hi"); 
        words.add("hello"); 
        words.add("world"); 
        System.out.println(Main.insertAfterI(words, "new"));

        ArrayList<String> newWords = new ArrayList<String>();
        newWords.add("cat"); 
        newWords.add("dog"); 
        newWords.add("elephant"); 
        newWords.add("fox"); 
        System.out.println(Main.removeThree(newWords));

        ArrayList<Integer> BWords = new ArrayList<Integer>();
        BWords.add(1);
        BWords.add(3);
        BWords.add(1);
        BWords.add(4);
        BWords.add(4);
        BWords.add(3);
        BWords.add(1);
        System.out.println(Main.removeDuplicates(BWords));

    }
}