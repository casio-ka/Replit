package Methods;

import java.util.Scanner;

public class FindError {
    public static boolean isError(String line) {



        if (line.startsWith("error")) {
            return true;
        }

        return false;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));

    }

}

/*
The **isError** method checks if the given String begins with `error`

- The method will return `true` if the String starts with `error` otherwise it will return `false`

Example:

```
isError("foo bar")

returns : false
```

```
isError("error foo bar")

returns : true
```

```
isError("error one two")

returns : true
```

```
isError("three four error")

returns : false
```
 */