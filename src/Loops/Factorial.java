package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int o = 1;

        for (int i = 1; i <=n ; i++) {
            o *= i;
        }
        System.out.println(o);

        scan.close();
    }
}
/*
    In mathematics a **factorial** of a positive integer _n_, denoted by _n_!,
    is the product of all positive integers less than or equal to _n_.
    Calculate factorial and output result to the console.


    Example:

    ```
    input: 5
    output: 120

    5 * 4 * 3 * 2 * 1
    ```

 */