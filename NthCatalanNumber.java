/*
 * Copyright (c)  2023 by Sanidhya Varshney
 */

import java.math.BigInteger;

public class NthCatalanNumber {
    public static BigInteger findCatalan(int n){
        BigInteger b=new BigInteger("1");
        for(int i=1;i<=n;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        BigInteger d=new BigInteger("1");
        for (int i=1;i<=2*n;i++){
            d=d.multiply(BigInteger.valueOf(i));
        }
        BigInteger ans=d.divide(b);
        ans=ans.divide(BigInteger.valueOf(n+1));
        return ans;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(findCatalan(n));
    }
}
