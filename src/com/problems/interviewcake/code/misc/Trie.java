package com.problems.interviewcake.code.misc;

import java.util.HashMap;

public class Trie {
    private HashMap<Character, Trie> nodeChildren;
    private static final char END_OF_WORD_MARKER = '\0';

    public Trie(){
        nodeChildren = new HashMap<>();
    }

    public boolean addWord(String word){
        Trie currentNode = this;
        boolean isNewWord = false;
        //working downwards adding nodes as needed, and keeping track
        //of whether we add any nodes.
        for(char character : word.toCharArray()){
            if(!currentNode.nodeChildren.containsKey(character)){
                isNewWord = true;
                currentNode.nodeChildren.put(character, new Trie());
            }
            currentNode = currentNode.nodeChildren.get(character);
        }

        //Explicitly mark the end of a word. Otherwise we might say a word is
        //present if it is a prefix of a different longer word that was added earlier.
        if(!currentNode.nodeChildren.containsKey(END_OF_WORD_MARKER)){
            isNewWord = true;
            currentNode.nodeChildren.put(END_OF_WORD_MARKER, new Trie());
        }
        return isNewWord;
    }
}

