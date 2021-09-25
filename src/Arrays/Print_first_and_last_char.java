package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Print_first_and_last_char {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String[] newWords = new String[words.length];

        for (int i = 0, j=0; i < words.length; i++,j++) {
            newWords[j]=""+words[i].charAt(0) + words[i].charAt(words[i].length()-1);
        }
        System.out.println(Arrays.toString(newWords));


    }
}
/*
Given a String array words, iterate through each word and print first and last
letter of each element in separate lines.

Example:

```
words → ["hello", "why", "by", "apple" , "note"]

print:
ho
wy
by
ae
ne
```
 */