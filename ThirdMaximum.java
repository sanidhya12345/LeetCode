/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.util.Arrays;

public class ThirdMaximum {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int countRepeat=0;
        int distinct=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==nums[i-1]){
                countRepeat++;
            }
            else{
                distinct++;
            }
            if(distinct==3){
                return nums[nums.length-distinct-countRepeat];
            }
        }
        return nums[nums.length-1];
    }
}
