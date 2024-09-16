/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

import java.util.Scanner;

/**
 *
 * @author ST10231655
 */
// Vowel count class
public class VowelCount {

    // Main method
    public static void main(String[] args) {
        // Declare scanner object
        Scanner scannerObj = new Scanner(System.in);

        // Prompt user to enter a sentence
        System.out.print("Enter a sentence: ");
        // User enters a sentence
        String sentence = scannerObj.nextLine(); // Sentence string

        int vowelsNum = countVowels(sentence); // Vowels number integer

        System.out.println("Number of vowels in sentence: " + vowelsNum); // Display vowels number
    }

    // Count vowels method
    public static int countVowels(String sentence) {
        int vowelCount = 0; // Vowel count integer
        String vowels = "aeiou"; // Vowels string

        sentence = sentence.toLowerCase(); // Convert sentence to lowercase

        // Loop characters in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char senChar = sentence.charAt(i); // Sentence character
            // Check if character is a vowel
            if (vowels.indexOf(senChar) != -1) {
                vowelCount++; // Increment vowel count
            }
        }

        return vowelCount; // Return vowel count
    }
}


