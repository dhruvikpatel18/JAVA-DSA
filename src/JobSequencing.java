import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {
    static class job{
        int id;
        int deadline;
        int profit;

        public job(int i,int d, int p){
            this.id = i;
            this.deadline = d;
            this.profit = p;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0; i< jobInfo.length; i++){
            jobs.add(new job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs,(a,b) -> b.profit-a.profit);
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(jobs.get(0).id);
        int time = 1;

        for(int i=1; i< jobs.size(); i++){
            job j = jobs.get(i);
            if(time < j.deadline){
                ans.add(j.id);
                time++;
            }
        }
        //print ans
        for(int i=0; i< ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();


    }
}
