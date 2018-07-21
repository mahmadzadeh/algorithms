package com;

public class RecursivePalindrome {


    public static boolean isPalindrome( String string ) {
        if ( string.length() == 0 || string.length() == 1 ) {
            return true;
        }

        if ( !firstAnLastCharactersSame( string ) ) {
            return false;
        }

        return isPalindrome( string.substring( 1, string.length() - 1 ) );
    }

    private static boolean firstAnLastCharactersSame( String string ) {
        return string.charAt( 0 ) == string.charAt( string.length() - 1 );
    }
}
