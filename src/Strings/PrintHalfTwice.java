package Strings;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int halfWrd = word.length()/2;

        System.out.println(word.substring(0,halfWrd)+word.substring(0,halfWrd));


    }
}
    /*
    Write a program that will print out first half of the word twice.


    Example:

    ```
    input: java

    output: jaja
    ```
    ```
    input: unity

    output: unun
    ```
     */