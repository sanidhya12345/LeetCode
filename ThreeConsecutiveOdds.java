/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int [] arr={1,2,34,3,4,5,7,23,12};
        boolean found=false;
        for(int i=0;i<arr.length-2;i++){
            int val1=arr[i];
            int val2=arr[i+1];
            int val3=arr[i+2];
            if(val1%2!=0 && val2%2!=0 && val3%2!=0){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(true);
        }
        else{
            System.out.println("false");
        }
    }
}
