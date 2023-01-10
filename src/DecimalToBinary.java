public class DecimalToBinary {

    public static void DecimalToBinary(int n){
        int binaryNum =0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binaryNum = binaryNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n /=2;
        }
        System.out.println("Binary is: "+ binaryNum);
    }
    public static void main(String[] args) {
        DecimalToBinary(121);
    }
}
