import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEvenOddIndependently {
    public static void main(String[] args) {
        int [] nums={4,1,2,3};
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int [] ans=new int[nums.length];
        int optr=1;
        int eptr=0;
        for(int i=0;i<even.size();i++){
            ans[eptr]=even.get(i);
            eptr+=2;
        }
        for(int i=odd.size()-1;i>=0;i--){
            ans[optr]=odd.get(i);
            optr+=2;
        }
        System.out.println(Arrays.toString(ans));
    }
}
