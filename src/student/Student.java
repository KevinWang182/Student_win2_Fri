/*
 * Author: Kevin Wang
 * Date: Jan 28 2022
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Kaida
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for(int i = 0; i < myWord.length; i++) {
            System.out.print(myWord[i]);
        }
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        char[] myLetters = new char[word.length()];
        for(int i = 0; i < myLetters.length; i++) {
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
    }

}
