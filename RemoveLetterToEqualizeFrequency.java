import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveLetterToEqualizeFrequency {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(Character ch:word.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char key=entry.getKey();
            int value=entry.getValue();
            map.put(key,value-1);
            Set<Integer> set = new HashSet<>(map.values());
            set.remove(0);
            if(set.size()==1) return true;
            map.put(key,value);
            
        }
        return false;
    }
}
