/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.*;

public class SortByNumberOf1bits {
    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++) {
            arr[i] %= 10001;
        }

        return arr;
    }
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2))))
                == (int)(Math.floor(
                ((Math.log(n) / Math.log(2)))));
    }
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6,7,8};

    }
}
