import java.util.LinkedList;
import java.util.Queue;

public class First_nonReapeating_charsInStream {
    public static void firstNonRepeating(String str){
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //first add to queue
            q.add(ch);
            //add its frequency in freq array
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] >1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 +" ");
            }else{
                System.out.print(q.peek()+" ");
            }

        }
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeating(str);

    }
}
