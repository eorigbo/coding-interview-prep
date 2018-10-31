package com.problems.interviewcake.code.misc;

import java.util.HashMap;
import java.util.Map;

public class Trie_Attempt{
    //var nodeChildren, end_marker
    private Map<Character, Trie_Attempt> nodeChildren;
    private final char end_marker = '\0';

    //constructor
    public Trie_Attempt(){
        nodeChildren = new HashMap<>();
    }

    public boolean addWord(String word){
        Trie_Attempt currentNode = this;
        boolean isNewWord = false;

        for(char currChar: word.toCharArray()){
            if(!currentNode.nodeChildren.containsKey(currChar)){
                isNewWord = true;
                currentNode.nodeChildren.put(currChar, new Trie_Attempt());
            }

            currentNode = currentNode.nodeChildren.get(currChar);
        }

        if(!currentNode.nodeChildren.containsKey(end_marker)){
            isNewWord = true;
            currentNode.nodeChildren.put(end_marker, new Trie_Attempt());
        }
        return isNewWord;
    }
}