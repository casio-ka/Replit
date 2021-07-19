package Strings;

import java.util.Scanner;

public class Email_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        int ind = email.indexOf("_");
        int ext = email.indexOf("@");

        String firstName = email.substring(0,1).toUpperCase() + email.substring(1, ind);
        String lastName = email.substring(ind+1 ,ind+2).toUpperCase() + email.substring(ind + 2, ext);
        String domain = email.substring(ext+1, email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);

    }
}

/*
    Write a program that will print out information about user based on email.
    Print first name, last name, and domain. First and Last name should be printed
    with proper format - uppercase first letter and remaining lowercase.

    Example:

    ```
    Input: craig_federighi@apple.com

    ```
    ```
    Output:
    First name: Craig
    Last name: Federighi
    Domain: apple
    ```
 */
