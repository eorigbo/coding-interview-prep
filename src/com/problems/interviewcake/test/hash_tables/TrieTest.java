package com.problems.interviewcake.test.hash_tables;

import com.problems.interviewcake.code.hash_tables.Trie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrieTest {

    @Test
    public void newWordTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("catch");
        assertTrue(result);
    }

    @Test
    public void newPrefixOfPreviousWordTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("cakes");
        assertTrue(result);

        result = trie.addWord("cake");
        assertTrue(result);
    }

    @Test
    public void previousWordTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("cake");
        assertTrue(result);

        result = trie.addWord("cake");
        assertFalse(result);
    }

    @Test
    public void emptyStringTest() {
        final Trie trie = new Trie();

        boolean result = trie.addWord("");
        assertTrue(result);

        result = trie.addWord("");
        assertFalse(result);
    }

}
