package Strings;

import java.util.Locale;
import java.util.Scanner;

public class Without_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean first = word.charAt(0) == 'X' || word.charAt(0) == 'x';
        boolean last = word.charAt(word.length()-1)== 'x' || word.charAt(word.length()-1)== 'X';
        boolean both = first && last;

        if (both){
            System.out.println(word.substring(1, word.length()-1));
        }else if (first){
            System.out.println(word.substring(1));

        }else if (last) {
            System.out.println(word.substring(0, word.length() - 1));
        }else {
            System.out.println(word);
        }

    }
}

/*
    Given a string word, if the first or last chars are 'x' or 'X',
    print the string without those 'x' or 'X' chars,
    otherwise print the string unchanged.


    Example:

    ```
    input: xHiX

    output: Hi
    ```

    ```
    input: apple

    output: apple
    ```

    ```
    input: xUxL

    output: UxL
    ```

    ```
    input: JavaX

    output: Java
    ```
 */