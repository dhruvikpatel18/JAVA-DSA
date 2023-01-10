import java.util.ArrayList;
import java.util.Arrays;

public class Greedy_Practice_ques {

//    //Maximum Balanced String Partitions
        //TC:O(n)
//    public static int maxBalStrPart(String str, int n){
//        if(n==0) return 0;
//        int l=0, r=0;
//        int ans = 0;
//        for(int i=0; i<n; i++){
//            if(str.charAt(i) == 'R'){
//                r++;
//            }else if(str.charAt(i) == 'L'){
//                l++;
//            }
//            if(l==r){
//                ans++;
//            }
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        String str = "LRRRRLLRLLRL";
//        int n = str.length();
//        System.out.println(maxBalStrPart( str, n));
//    }
////////////////////////////////////////////////////////////////////////////////////////////////////
//    //Kth largest odd number in a given range
//    //TC: O(1)
//    public static int kthLarg(int[] range, int k){
//        if(k<=0) return 0;
//        int L = range[0];
//        int R = range[1];
//
//        //if R is odd
//        if((R&1) >0){
//            //calculate count of odd numbers within the range
//            int count = (int)Math.ceil((R-L+1)/2);
//
//            if(count < k){
//                return 0;
//            }else{
//                return (R-2 * k+2);
//            }
//        }else{ // if R is even
//            //calculate count of odd numbers within the range
//            int count = (R-L+1)/2;
//            if(count < k){
//                return 0;
//            }else{
//                return (R-2 * k+1);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] range = {-10,10};
//        int k = 8;
//        System.out.println(kthLarg(range,k));
//    }
 ////////////////////////////////////////////////////////////////////////////////////////////////////

//    //Lexicographically smallest string of length N and sum K
//    public static char[] lexo_small(int n, int k){
//        char[] arr = new char[n];
//        Arrays.fill(arr,'a');
//        for(int i=n-1; i>=0; i--){
//            k -= i;
//            if(k>=0){
//                if(k >=26){
//                    arr[i] = 'z';
//                    k -= 26;
//                }else{
//                    arr[i] = (char)(k+97-1);
//                    k-=arr[i]-'a'+1;
//                }
//            }else{
//                break;
//            }
//            k +=i;
//        }
//        return arr;
//    }
//    public static void main(String[] args) {
//        int n = 5, k = 42;
//        char[] arr = lexo_small(n,k);
//        System.out.println(new String(arr));
//    }

    //////////////////////////////////////////////////////////////////////////////////////////////

    //Best Time to Buy and Sell Stock
    public static int maxProfit(int[] prices){
        int n = prices.length;

        int buy = prices[0];
        int max_profit =0;

        for(int i=1; i<n; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }else if(prices[i]-buy > max_profit){
                max_profit = prices[i]-buy;
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }



}
