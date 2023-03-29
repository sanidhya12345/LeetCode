import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Servers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] requests=new int[m];
        for(int i=0;i<m;i++){
            requests[i]=sc.nextInt();
        }
        int [] servers=new int[n];
        int [] ans=new int[m];
        ans[0]=1;
        servers[0] = requests[0];

        // int[] 

        for(int i=1;i<m;i++){
            int load=requests[i];
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j = 0; j < servers.length; j++){
                if (servers[j] < min) {
                    min = servers[j];
                    index = j;
                }
            }

            servers[index] += load;
            ans[i] = index + 1;

        }
        System.out.println(Arrays.toString(ans));
    }
}
