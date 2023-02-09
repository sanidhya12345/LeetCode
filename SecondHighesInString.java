import java.util.HashSet;

public class SecondHighesInString{
    public int secondHighest(String s) {
        HashSet<Integer> set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(Character.getNumericValue(ch)>=0 && Character.getNumericValue(ch)<=9){
                set.add(Character.getNumericValue(ch));
            }
        }
        if(set.size()<=1){
            return -1;
        }
        return (int)set.toArray()[set.size()-2];
    }
}