/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {
        String [] words={"leetcode","et","code"};
        List<String>l=new ArrayList<>();
        for (String s : words) {
            for (String word : words) {
                if (!word.equals(s) && word.contains(s)) {
                    l.add(s);
                    break;
                }
            }
        }
        System.out.println(l);
    }
}
