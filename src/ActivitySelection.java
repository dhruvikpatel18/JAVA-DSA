import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
//        //if activities were not sorted according to end time
//        int activity[][] = new int [start.length][3];//3->columns->index,start,end
//        for(int i=0; i<start.length; i++){
//            activity[i][0] = i;
//            activity[i][1] = start[i];
//            activity[i][2] = end[i];
//        }
//        //lambda function to sort 2d activity array
//        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);//add first activity index always
        //ans.add(activity[0][0])
        int prevEnd = end[0];
        //int prevEnd = activity[0][2];

        for(int i=1; i<start.length; i++){
            if(start[i] >= prevEnd){  //if(activity[i][1] >= preEnd)
                ans.add(i); // ans.add(activity[i][0])
                prevEnd = end[i]; //prevEnd = activity[i][2]
            }
        }
        System.out.println("maximum activity: "+ ans.size());
        //print as
        for(int i=0; i< ans.size(); i++){
            System.out.print(start[ans.get(i)] +"-"+end[ans.get(i)]);
            System.out.println();
        }
    }
}
