/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */
import java.util.*;
public class LargestPositiveThatExistsWithNegative {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:nums){
            map.put(i, -i);
        }
        List<Integer> list=new ArrayList<>();
        for(Integer i:nums){
            if(map.containsKey(map.get(i)) && !list.contains(0-i)){
                list.add(-i);
            }
        }
        if(list.size()==0){
            return -1;
        }
        return Collections.max(list);
    }
}
