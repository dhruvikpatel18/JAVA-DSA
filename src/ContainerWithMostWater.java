import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int mostWater(ArrayList<Integer> height){
//        //brute force  TC:O(N^2)
//        int maxWater = 0;
//        for(int i=0; i< height.size(); i++){
//            for(int j=i+1; j< height.size(); j++){
//                int ht = Math.min(height.get(i), height.get(j) );
//                int width = j-i;
//                int currWater = ht*width;
//                maxWater = Math.max(currWater,maxWater);
//            }
//        }
//        return maxWater;

        //optimal  TC:O(N)
        int maxWater = 0;
        int left = 0;
        int right = height.size()-1;
        while(left < right){
            int ht = Math.min(height.get(left), height.get(right) );
            int width = right-left;
            int currWater = ht*width;
            maxWater = Math.max(currWater,maxWater);
            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(mostWater(height));
    }
}
