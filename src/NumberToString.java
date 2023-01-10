public class NumberToString {
    static String words[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void numberToString(int n){
        if(n==0){
            return;
        }
        int lastNum = n%10;
        numberToString(n/10);
        System.out.println(words[lastNum] +" ");

    }
    public static void main(String[] args) {
        numberToString(2345);

    }
}
