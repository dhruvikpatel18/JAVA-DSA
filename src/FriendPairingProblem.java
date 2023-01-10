public class FriendPairingProblem {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return /* for single*/friendPairing(n-1) + /* for pair*/(n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
