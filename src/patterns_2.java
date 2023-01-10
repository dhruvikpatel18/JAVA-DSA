public class patterns_2 {
    public static void main(String[] args) {
//        //hollow rectangle
//        int row=5;
//        int col=8;
//
//        for(int i=1; i<=row; i++){ //rows
//            for(int j=1; j<=col; j++){
//                if(i==1 || i==row || j==1 || j==col){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        //inverted and rotated half pyramid
//        int n = 5;
//        for(int i=1; i<=n; i++){ //rows
//            // for space
//            for(int j =1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            //for star
//            for(int k = 1; k<=i; k++){
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

//        //inverted half pyramid with numbers
//        int n = 5;
//        for(int i=1; i<=n; i++){//rows
//            //inner
//            for(int j=1; j<=n-i+1; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    //Floyd's triangle
//        int n=5;
//        int count = 1;
//        for(int i=1; i<=n; i++){
//            //inner loop
//            for(int j=1; j<=i; j++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }

//        //0-1 triangle pattern
//        int n =5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                if((i+j) %2 == 0){
//                    System.out.print("1 ");
//                }else{
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//        }

//        //butterfly pattern
//        int n = 4;
//        //first half
//        for(int i=1; i<=n; i++){
//            //stars == i
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            //spaces == 2*(n-i)
//            for(int j=1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            //stars == i
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //second half
//        for(int i=n; i>=1; i--){
//            //stars == i
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            //spaces == 2*(n-i)
//            for(int j=1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            //stars == i
//            for(int j=1; j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //star rhombus pattern
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            //space
//            for(int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            //stars
//            for(int j=1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //hollow rhombus pattern
//        int n = 5;
//        for (int i=1; i<=n; i++){
//            //space
//            for(int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            //hollow rectangle-stars
//            for(int j=1; j<=n; j++){
//                if(i==1 || i==n || j==1 || j==n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//
//        }

//        //diamond pattern
//        int n=5;
//        for(int i =1; i<=n; i++){
//            //spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print("  ");
//            }
//            //stars
//            for(int j=1; j<=(2*i)-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        //number pyramid
//        int n=5;
//        for(int i=1; i<=n; i++){
//            //spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            //numbers
//            for(int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
        //palindromic pattern with numbers
        int n = 5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<n-i; j++){
                System.out.print("  ");
            }
            //descending numbers
            for(int j=i; j>1; j--){
                System.out.print(j+" ");
            }
            //acsending number
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}
