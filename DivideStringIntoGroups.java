import java.util.ArrayList;
import java.util.Arrays;

public class DivideStringIntoGroups {
    public static void main(String[] args) {
        String s="abcdefghij";
        int k=3;
        char fill='x';
        while(s.length()%k!=0){
            s+=fill;
        }
        String [] array=new String[s.length()/k];
        int ptr=0;
        for(int i=0;i<s.length();i+=k){
            array[ptr]=s.substring(i,i+k);
            ptr++;
        }
        System.out.println(Arrays.toString(array));
    }
}
