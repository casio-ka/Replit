package Strings;

import java.util.Scanner;

public class MiddleOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int charCount =word.length();
        int middleChar = charCount/2;

        if (charCount==1) {
            System.out.println(word + word + word);
        }else if (charCount==2){
            System.out.println(word+word);
        }else if (charCount>=3 && charCount%2 != 0){
            System.out.println(word.charAt(middleChar));
        }else if (charCount>=4 && charCount%2 ==0){
            System.out.println(word.charAt(middleChar-1) +""+ word.charAt(middleChar));
        }




    }
}
    /*
    You have a word, do the following:

    1. When word has **odd number of characters and:**

     - **3 or more characters, print middle letter**

    ```
          oak ==> a
    ```

    ```
          javav ==> v
    ```

    - **Single character, print that character 3 times**

    ```
          # ==> ###
    ```

    ```
          q ==> qqq
    ```

    2. When word has **even number of characters and**:

     - **4 or more characters**, print the middle 2 characters

    ```
         java ==> av
    ```

    ```
         apples ==> pl
    ```

    ```
         #$%^&* ==> %^
    ```

     - **2 characters,** print those 2 characters twice

    ```
          @@ ==>@@@@
    ```

    ```
          $$ ==>$$$$
    ```

    ```
          hi ==> hihi
    ```


     */