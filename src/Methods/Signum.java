package Methods;

import java.util.Scanner;

public class Signum {

    public static void sign(int n) {
        //your code here:

        if (n > 0){
            System.out.println("positive");
        }else if (n < 0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

    }


    // DO not change:
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }

}
/*
Given a method **sign** write the code so that its takes a number argument and tells you if its positive, negative or zero.

for example :

```
sign(5)  => positive
```

```
sign(-30) => negative
```

```
sign(0)  => zero
```
 */