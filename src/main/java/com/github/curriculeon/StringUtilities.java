package com.github.curriculeon;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public String getHelloWorld() {

        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public String concatenation(String firstSegment, String secondSegment) {

        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public String concatenation(int firstSegment, String secondSegment) {

        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public String getPrefix(String input) {
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public String getSuffix(String input) {
        if(input.length() > 3) {
            return input.substring(input.length() - 3);
        } else
            return input;
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public Boolean compareTwoStrings(String inputValue, String comparableValue) {
        if(inputValue == comparableValue){
        return true;
        } else{}
        return false;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public Character getMiddleCharacter(String inputValue) {
        int length = inputValue.length();
        int middle = length / 2;
        if(length % 2 == 1) {
            return inputValue.charAt(middle);
        } else {
            return ' ';
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public String getFirstWord(String spaceDelimitedString) {
        String[] firstWord = spaceDelimitedString.split(" ");

        if(firstWord.length > 0) {
            return firstWord[0];
        } else {
            return "";
        }
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public String getSecondWord(String spaceDelimitedString) {
        String[] secondWord = spaceDelimitedString.split(" ");

        if(secondWord.length > 0) {
            return secondWord[1];
        } else {
            return "";
        }
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public String reverse(String stringToReverse) {
        StringBuilder reverseString = new StringBuilder();

        reverseString.append(stringToReverse);

        reverseString.reverse();

        return reverseString.toString();
    }
}
