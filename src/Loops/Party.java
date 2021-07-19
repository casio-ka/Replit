package Loops;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestNames = input.next();

        while (true) {
            System.out.println("Please enter guest name:");
            String name = input.next();
            System.out.println("Do you want to enter new guest name:");
            String prompt = input.next();
            guestNames = guestNames + name + ", ";

            if (prompt.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " + guestNames.substring(0, guestNames.length() - 2));
                break;
            }

        }

    }
}
/*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)

    Ask for the first guest name.

    Then ask does user want to enter one more guests.

     If yes - take the next guest input

    If not - finish the program and print list of the guests.

    Example:

    ```
    Please enter guest name:
    Nick
    Do you want to enter new guest name:
    yes
    Please enter guest name:
    Linda
    Do you want to enter new guest name:
    no
    Guest's list: Nick, Linda
```
 */