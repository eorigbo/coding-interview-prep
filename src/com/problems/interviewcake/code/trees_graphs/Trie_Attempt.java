package com.problems.interviewcake.code.trees_graphs;

import java.util.HashMap;
import java.util.Map;

public class Trie_Attempt{
    private Map<Character, Trie_Attempt> nodeChildren;
    private final char END_OF_WORD_MARKER = '\0';

    public Trie_Attempt(){
        nodeChildren = new HashMap<>();
    }

    public boolean addWord(String word){
        boolean isNewWord = false;

        Trie_Attempt currentNode = this;

        for(char currChar: word.toCharArray()){
            if(!currentNode.nodeChildren.containsKey(currChar)){
                isNewWord = true;
                currentNode.nodeChildren.put(currChar, new Trie_Attempt());
            }

            currentNode = currentNode.nodeChildren.get(currChar);
        }

        if(!currentNode.nodeChildren.containsKey(END_OF_WORD_MARKER)){
            isNewWord = true;
            currentNode.nodeChildren.put(END_OF_WORD_MARKER, new Trie_Attempt());
        }
        return isNewWord;

    }
}