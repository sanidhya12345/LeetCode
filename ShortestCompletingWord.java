/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.ArrayList;


public class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[0-9\s]", "").toLowerCase();
        int[] chars = new int[26];
        ArrayList<String> list = new ArrayList<>();

        for (char c: licensePlate.toCharArray()) {
            chars[c - 'a']++;
        }

        for (String word: words) {
            int[] dummy = new int[26];
            boolean found = true;
            for (char c: word.toCharArray()) {
                dummy[c - 'a']++;
            }
            for (int i = 0; i < chars.length; i++) {
                if (dummy[i] < chars[i]) {
                    found = false;
                    break;
                }
            }


            if (found) {
                list.add(word);
            }
        }

        int min = Integer.MAX_VALUE; int pos = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min) {
                pos = i;
                min = list.get(i).length();
            }
        }
        return list.get(pos);
    }
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String [] words= {"step","steps","stripe","stepple"};
        System.out.println(shortestCompletingWord(licensePlate,words));
    }
}
