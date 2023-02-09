public class SumOfDigits{
    public int getLucky(String s, int k) {
        int sum=0;
 StringBuilder ss=new StringBuilder();
 for(int i=0;i<=s.length()-1;i++)
     ss.append(s.codePointAt(i)-96);
 while(k>0){
     sum=0;
     for (int i=0;i<=ss.length()-1;i++)
         sum+=ss.charAt(i)-'0';
     ss=new StringBuilder(String.valueOf(sum));
     k--;
 }
 return sum;
     }
    public static void main(String[] args) {
        String s="leetcode";
        String number="";
        for(char ch:s.toCharArray()){
            number+=(int)ch-97+1;
        }
        System.out.println(number);
        long ans=0;
        int k=2;
        while(k--!=0){
            long n=Long.valueOf(number);
            long sum=0;
            while(n!=0){
                long nm=n%10;
                sum+=nm;
                n=n/10;
            }
            ans=sum;
            number=Long.toString(sum);
        }
        System.out.println((int)ans);
    }
}