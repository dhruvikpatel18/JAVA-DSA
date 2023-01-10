public class BinaryToDecimal {

    public static void BinaryToDecimal(int binaryNum){
        int decNum = 0;
        int pow = 0;
        while(binaryNum >0){
            int lastDigit = binaryNum%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binaryNum/=10;
        }
        System.out.println("decimal is: "+ decNum);
    }

    public static void main(String[] args) {
        BinaryToDecimal(1001);
    }
}
