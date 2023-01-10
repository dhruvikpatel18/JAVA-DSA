import java.security.PublicKey;

public class XPowerN {
    public static int optimalPower(int x, int n){
        //Tc:O(logn)
        if(n==0){
            return 1;
        }
//        int halfPowSq = optimalPower(x,n/2)*optimalPower(x,n/2);//its give again O(n)TC.
        int halfPow = optimalPower(x,n/2);
        int halfPowSq = halfPow*halfPow;
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static int power(int x, int n){
        //TC:O(N)
        if(n == 0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
        System.out.println(optimalPower(2,5));
    }
}
