package Strings;

import java.util.Scanner;

public class MergeThem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        if (word1.length() !=3 || word2.length() !=3){
            System.out.println("Cannot merge");
        }else {
            System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1)+""+word2.charAt(1)+""+word1.charAt(2)+""+word2.charAt(2));

        }


    }
}
    /*
    You have 2 words, both of them have 3 characters.

    If either of them does not have exactly 3 characters, print "cannot merge"

    Merge their characters one by one and print together like below:

    ```
    Input:
    aok
    lol

    Output:
    alookl
    ```

    ```
    Input:
    ear
    pie

    Output:
    epaire
    ```

    ```
    Input:
    java
    wow

    Output:
    cannot merge
    ```
     */