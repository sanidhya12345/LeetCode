/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */
import java.util.*;
public class NumberOfDistinctAverages {
        public int distinctAverages(int[] nums) {
            Arrays.sort(nums);
            Set<Double> s=new TreeSet<>();
            for(int i=0,j=nums.length-1;i<j;i++,j--) {
                double avg=(double)(nums[i]+nums[j])/2;
                s.add(avg);
            }
            return s.size();
        }
}
