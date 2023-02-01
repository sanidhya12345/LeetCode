/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */
import java.util.*;
public class CandyDistribution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i:candyType){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i,map.get(i)+1);
            }
        }

        int permit=candyType.length/2;
        if(map.size()<permit){
            return map.size();
        }
        return permit;
    }
}
