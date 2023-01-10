public class powerOf2 {
    public static boolean po2(int n){
        return (n&(n-1))==0;

        //logic
//        8 -> 1000
//           &
//        7 -> 0111
    }
    public static void main(String[] args) {
        System.out.println(po2(17));
    }
}
