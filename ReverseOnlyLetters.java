/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.Arrays;
import java.util.HashMap;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s="a-bC-dEf-ghIj";
        char[] in=s.toCharArray();
        int i=0,j=in.length-1;
        char t;

        while(i<j){
            while(i<in.length-1 && !((in[i]>='A') && (in[i]<='Z') ||(in[i]>='a') && (in[i]<='z')))
                i++;
            while(j>0 && !((in[j]>='A') && (in[j]<='Z') ||(in[j]>='a') && (in[j]<='z')))
                j--;
            if(i>=j)break;
            t=in[i];
            in[i++]=in[j];
            in[j--]=t;

        }
        System.out.println(Arrays.toString(in));
    }
}
