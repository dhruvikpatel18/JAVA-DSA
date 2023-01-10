import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //for closing
            if(ch == ')'){
                int count = 0;
                while(st.pop() != '('){
                    count++;
                }
                if(count <1){
                    return true;
                }
            }else{
                //opening
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(a+b+(f-v))";
        System.out.println(isDuplicate(str));

    }
}
