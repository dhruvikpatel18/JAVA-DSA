public class TilingProblem {
    public static int tilingProblem(int n){ //(2*n-floor size)
        if (n ==0 || n==1){
            return 1;
        }
        //vertical ways
        int vertical = tilingProblem(n-1);
        //horizontal ways
        int horizontal = tilingProblem(n-2);
        int totalways = vertical+horizontal;
        return totalways;

    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
