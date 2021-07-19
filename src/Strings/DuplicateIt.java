package Strings;

import java.util.Scanner;

public class DuplicateIt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();
        String w2 = sc.next();

        System.out.println(w1+w2+w2+w1);
    }

}

/*
You have 2 words

Print the first word, second word, second word, first word

```
Input:

one

two
```

```
Output:

onetwotwoone
```
 */
