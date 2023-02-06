import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllElementMorethanndividektimes {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        int [] arr={3, 1, 2, 2, 1, 2, 3, 3};
        int k=4;
        int count=arr.length/k;
        for(Integer item:arr){
            if(!map.containsKey(item)){
                map.put(item,1);
            }
            else{
                map.put(item,map.get(item)+1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)>count){
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
