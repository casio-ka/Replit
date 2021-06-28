import java.util.Scanner;

public class PrintFirstAndLastLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));

    }
}

    /*
    Write a program that will print out first and last letters together.

    ```
    Input: adobe
    ```

    ```
    Output: ae
    ```
     */