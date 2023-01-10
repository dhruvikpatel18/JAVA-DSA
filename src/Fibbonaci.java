public class Fibbonaci {
    public static int fibbonaci(int n){
        if(n==1 || n==0){
            return n;
        }
        int fib1 = fibbonaci(n-1);
        int fib2 = fibbonaci(n-2);
        int ans = fib1+fib2;
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibbonaci(n));
    }
}
