package Loops;

import java.util.Scanner;

public class Print_Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (i=0; i<=n-1; i++) {
            for (j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }

}
/*
Write a program that will create a triangle of asterisks based on size **n**.

Example:

```
input: 5

output:
*
**
***
****
*****
```

Example:

```
input: 3

output:
*
**
***
```



 */