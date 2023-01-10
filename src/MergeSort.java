//nlogn tc

public class MergeSort {
    public static void mergeSort(int[]arr, int st, int en){
        if(st>=en){
            return;
        }
        int mid = st+(en-st)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,en);

        merge(arr,st,mid,en);
    }
    public static void merge(int[] arr, int st, int mid, int en){
        int[] tmp = new int[en-st+1];
        int i = st;//for left part
        int j = mid+1;//for right part
        int k =0;

        while(i<=mid && j<= en){
            if(arr[i] < arr[j]){
                tmp[k] = arr[i];
                i++;
            }else{
                tmp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for only left part
        while(i<=mid){
            tmp[k++] = arr[i++];
        }
        //for on;y right part
        while(j<=en){
            tmp[k++] = arr[j++];
        }
        //copy tmp to arr
        for(int n=0, m = st; n<tmp.length; n++,m++){
            arr[m] = tmp[n];
        }
    }
    public static void printArry(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,5,3,21,5,1};
        mergeSort(arr,0,arr.length-1);
        printArry(arr);
    }
}
