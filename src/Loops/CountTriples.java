package Loops;

import java.util.Scanner;

public class CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

        for (int i = 0; i <= str.length()-3; i++) {

            if (str.substring(i,i+1).equals(str.substring(i+1,i+2)) && str.substring(i+1,i+2).equals(str.substring(i+2,i+3))){
                count++;
            }

        }
        System.out.println(count);


    }
}
/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Print out the number of triples in the given string. The triples may overlap.


Example:

222abyyycdXXX
abcXXXabc222k
```
input: abcXXXabc

output: 1
```


Example:


```
input: xxxabyyyycd

output: 3
```


Example:


```
input: java

output: 0
```
 */
