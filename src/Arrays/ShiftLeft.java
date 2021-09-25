package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftLeft {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int[] newNums = new int[nums.length];
        int firstNum=nums[0];


        for (int i = 0,j=1; j < nums.length; i++, j++) {
            newNums[i]=nums[j];
        }
        newNums[newNums.length-1]=firstNum;

        System.out.println(Arrays.toString(newNums));
    }
}

/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}.
You may modify and print the given array, or print a new array.`

Example:
```
input: 6, 2, 5, 3

output: [2, 5, 3, 6]
```
 */
