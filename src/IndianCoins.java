import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    //coin change
    public static void main(String[] args) {
        Integer coin[] = {1,2,5,10,20,50,100,500,1000,2000};
        //arrange coins in decreasing order
        Arrays.sort(coin, Comparator.reverseOrder());

        int countOfCoins =0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coin.length; i++){
            if(coin[i] <= amount){
                while(coin[i] <= amount){
                    countOfCoins++;
                    ans.add(coin[i]);
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total min numbers of used coins = " + countOfCoins);
        //print all used coins
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}
