public class ZeroOneKnapsack {
    public static void main(String[] args) {
        int [] weights={1,1,1};
        int [] profit={10,20,30};
        int n=3;
        int W=2;
        int [][] dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(j>=weights[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weights[i-1]]+profit[i-1]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println("Max Profit:- "+dp[n][W]);        
    }
}
