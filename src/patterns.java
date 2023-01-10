public class patterns {
    public static void main(String[] args) {
        //star pattern
//        for(int i=1; i<=4; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //inverted star pattern
//        for(int i=4; i>=0; i--){
//            for(int j =0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//                //half pyramid
//        for(int i=1; i<=4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

            //character pattern
        char ch = 'A';
        for(int i=1; i<=4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }


    }
}
