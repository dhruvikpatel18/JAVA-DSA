import java.util.Stack;

public class ValidPranathasis {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //for opning bracket
            if(ch == '(' || ch == '(' || ch == '['){
                st.push(ch);
            }else{
                //for closing
                if(st.isEmpty()){
                    return false;
                }
                if((st.peek() =='(' && ch ==')') ||( st.peek() =='{' && ch =='}')|| (st.peek() =='[' && ch ==']' )){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));

    }
}
