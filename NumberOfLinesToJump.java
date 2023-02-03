/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.*;

public class NumberOfLinesToJump {
    public static void main(String[] args) {
        int [] widths={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int countLines=0;
        String s="bbbcccdddaaa";
        HashMap<Integer,Integer> map=new HashMap<>();
        int val=0;
        for(int i=0;i<s.length();i++){
            val+=widths[s.charAt(i)-'a'];
            if(val>100){
                countLines++;
                val=0;
                val+=widths[s.charAt(i)-'a'];
            }
            map.put(countLines,val);
        }
        int [] ans=new int[2];
        ans[0]=map.size();
        ans[1]= map.get(Collections.max(map.keySet()));
        System.out.println(Arrays.toString(ans));
    }
}
