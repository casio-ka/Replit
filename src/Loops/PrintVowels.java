package Loops;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowels = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a'|| ch == 'A' || ch == 'e'||ch == 'E'||ch == 'i' || ch == 'I' || ch == 'i' ||
                    ch == 'o' || ch == 'O'|| ch == 'u' || ch == 'U') {

                vowels += ch;

            }

        }

        System.out.println(vowels);


    }


}
/*
Create a program that will take the given String **In** and print out all the vowels from the String.


Example:

```
Input: howdyho

Output: oo
```

```
Input: huehuehuehue

Output: ueueueue
```


 */