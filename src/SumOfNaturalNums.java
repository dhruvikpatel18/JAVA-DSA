public class SumOfNaturalNums {
    public static int sumOfNums(int n){
        if(n == 1){
            return 1;
        }
        int nm1 = sumOfNums(n-1);
        int ans =  n+nm1;
        return ans;
    }
    public static void main(String[] args) {
        int n = 50;
        System.out.println(sumOfNums(n));
    }
}
