/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.pkg2;

import javax.swing.*;
import java.util.*;

/**
 * Kyle Lukaszek
 * February 21st 2019
 * Palindrome 2 Program
 */
public class Palindrome2 {

    public static class palCheck {
        //create boolean that requires a String input

        boolean palFound(String words) {
            int pos;
            String backwardsWords;
            //Reverse the word
            backwardsWords = "";
            //check for palindromes, if there is a palindrome boolean is set to true state
            for (pos = words.length() - 1; pos >= 0; pos--) {
                backwardsWords += words.charAt(pos);
            }
            return backwardsWords.equals(words);
        }
    }

    public static void main(String[] args) {
        //initialize palCheck() to call boolean palFound method
        palCheck cl = new palCheck();
        
        //initialize variables
        int x, wrdCount;
        String words;

        //get the word from the user
        words = JOptionPane.showInputDialog(
                "Words that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a words is a palindrome.\n\n"
                + "Enter a word:");
        
        //turn input phrase into lowercase characters
        words = words.toLowerCase();
        
        //Separate words in input string and count the amount of words
        StringTokenizer wrd = new StringTokenizer(words);
        x = wrd.countTokens();
        
        //Create new String array with words from input
        String word[] = new String[x];
        for (int i = 0; i < x; i++) {
            word[i] = wrd.nextToken();
        }
        
        //check if a palindrome is found in palCheck class, if one is found, the palindrome count is increased
        wrdCount = 0;
        for (int i = 0; i < x; i++) {
            if (cl.palFound(word[i]) == true) {
                wrdCount++;
            } else {
            }
        }
        
        //Display output windows
        if (wrdCount == 0) {
            JOptionPane.showMessageDialog(null, "No Palindromes are present.");
        } else {
            JOptionPane.showMessageDialog(null, "There are " + wrdCount + " palindromes present.");
        }
    }
}
