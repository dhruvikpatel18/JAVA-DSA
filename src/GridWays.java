public class GridWays {
    //TC:O(2^n+m)//exponential

    public static int totalWays(int i, int j, int n, int m){
        if(i==n-1 || j ==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        int w1 = totalWays(i+1,j,n,m);//down side
        int w2 = totalWays(i,j+1,n,m);//right side
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int c = totalWays(0,0,n,m);
        System.out.println(c);
    }

    //to solve in linear tc:O(n+m)
    //we can use permutation trick
    //eq is:
    //              (((n-1 + m-1)!)/((n-1)!*(m-1)!))
}
