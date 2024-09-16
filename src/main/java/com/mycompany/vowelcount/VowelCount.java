/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;

import java.util.Scanner;

/**
 *
 * @author ST10231655
 */
public class VowelCount {

    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scannerObj.nextLine();

        int vowelsNum = countVowels(sentence);

        System.out.println("Number of vowels in sentence: " + vowelsNum);
    }

    public static int countVowels(String sentence) {
        int vowelCount = 0;
        String vowels = "aeiou";

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char senChar = sentence.charAt(i);
            if (vowels.indexOf(senChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}


