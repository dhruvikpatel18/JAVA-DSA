public class TowerOfHanoi {
    public static void toh(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n +" from "+ src +" to "+ dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as helper
        toh(n-1,src,dest,helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n +" from "+ src+ " to "+ dest);
        //transfer n-1 from helper to dest using src
        toh(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        int n = 4;
        toh(n-1,"A","B","C");
    }
}
