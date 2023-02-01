/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedFromArray
{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] map=new int[nums.length];// frequency of elements
        for(int i=0;i<nums.length;i++){
            map[nums[i]-1]++;
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<map.length;i++){
            if(map[i]==0){  //check whether the count of any element is 0 or not.
                ls.add(i+1);
            }
        }
        return ls;
    }
}
