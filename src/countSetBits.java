public class countSetBits {
    public static int countSetBits(int n){
        //TC: O(logN)      //bcz n = log2n+1 -> *number of bits*
        int count = 0;
        while(n>0){
            if((n&1) != 0){//check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(10));
    }
}
