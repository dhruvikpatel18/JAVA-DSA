public class FirstOccurence {
    public static int firstOccurence(int[] arr, int key, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr,key,i-1);
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,2,3,5,7};
        int key = 3;
        int len = arr.length-1;
        System.out.println(firstOccurence(arr,key,len));
    }
}
