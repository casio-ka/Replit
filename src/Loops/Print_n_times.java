package Loops;

import java.util.Scanner;

public class Print_n_times {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.print("*");
        }

    }


}
/*
Given an int variable **n** print out **n** asterisks. So if n=5, five asterisks will be printed.

Example:

```
input: 1

output: *
```

Example:

```
input: 3

output: ***
```
 */