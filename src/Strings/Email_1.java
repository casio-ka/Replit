package Strings;

import java.util.Scanner;

public class Email_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (!email.contains("_")) {
            System.out.println(email);
        }else if (email.contains("_")){
            int ind = email.indexOf("_");
            int ext = email.indexOf("@");
            String firstName = email.substring(0, ind);
            String lastName = email.substring(ind + 1, ext);
            String domain = email.substring(ext);

            System.out.println(lastName+"_"+firstName+domain);
        }
    }
}
/*

    Swap first name with last name in the email (Seperated by an underscore).
    If the email doesn't contain an underscore print the given input email.

    Examples:


    ```
    input: mike_tyson@gmail.com

    output: tyson_mike@gmail.com
    ```

    ```
    input: barakobama@gmail.com

    output: barakobama@gmail.com
    ```


 */