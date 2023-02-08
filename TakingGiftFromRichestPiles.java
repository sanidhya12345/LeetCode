import java.util.Arrays;

public class TakingGiftFromRichestPiles {
    public static void main(String[] args) {
        int [] gifts={1,1,1,1};
        int k=4;
        Arrays.sort(gifts);
        while(k--!=0){
            int maxele=gifts[gifts.length-1];
            gifts[gifts.length-1]=(int)Math.sqrt(maxele);
            Arrays.sort(gifts);
        }
        long sum=0;
        for(Integer i:gifts){
            sum+=i;
        }
        System.out.println(sum);
    }
}
