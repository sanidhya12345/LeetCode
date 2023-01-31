/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

public class SignOfProduct {
    public int arraySign(int[] nums) {
        int countPos=0;
        int countNeg=0;
        int countZero=0;
        for(Integer i:nums){
            if(i<0){
                countNeg++;
            }
            if(i>0){
                countPos++;
            }
            if(i==0){
                countZero++;
            }
        }
        if(countZero>=1){
            return 0;
        }
        else if(countNeg%2==0){
            return 1;
        }
        return -1;
    }
}
