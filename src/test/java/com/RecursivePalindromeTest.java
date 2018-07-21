package com;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RecursivePalindromeTest {

    @Test
    public void emptyStringIsPalindrome() {

        String testString = "";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }

    @Test
    public void stringWithOneCharacterIsPalindrome() {

        String testString = "a";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }

    @Test
    public void stringWithTwoRepeatedCharactersIsPalindrome() {

        String testString = "aa";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }

    @Test
    public void stringWithTwoDifferentCharactersIsNotPalindrome() {

        String testString = "ab";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isFalse();
    }

    @Test
    public void stringWithThreeDifferentCharactersIsNotPalindrome() {

        String testString = "abc";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isFalse();
    }

    @Test
    public void ABBA_isPalindrome() {

        String testString = "ABBA";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }

    @Test
    public void radar_isPalindrome() {

        String testString = "ABBA";

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }


    @Test
    public void stackOverflow() {

        int n = 11000;
        String testString = new String( new char[n] ).replace( "\0", "S" );

        assertThat( RecursivePalindrome.isPalindrome( testString ) ).isTrue();
    }


}