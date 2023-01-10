import java.rmi.UnexpectedException;
import java.util.Stack;

public class Stack_ques {
//    //push at bottom of stack  O(n), O(1)
//    public static void pushAtBottom(Stack<Integer> st, int data){
//        //base case
//        if(st.isEmpty()){
//            st.push(data);
//            return;
//        }
//        int top = st.pop();
//        pushAtBottom(st,data);
//        st.push(top);
//    }
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//
//        pushAtBottom(st,4);
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
//    }

//    //reverse a string
//    public static String reverseString(String str){
//        Stack<Character> st = new Stack<>();
//        //insert in stack
//        int idx =0;
//        while(idx < str.length()){
//            st.push(str.charAt(idx));
//            idx++;
//        }
//        //pop out from stack
//        StringBuilder sb = new StringBuilder("");
//        while(!st.isEmpty()){
//            sb.append(st.pop());
//        }
//        return sb.toString();
//
//    }
//    public static void main(String[] args) {
//        String str = "dhruvik";
//        String res = reverseString(str);
//        System.out.println(res);
//    }
//
//    //reverse stack O(n), O(1)
//    public static void pushAtBottom(Stack<Integer> st, int data){
//        if(st.isEmpty()){
//            st.push(data);
//            return;
//        }
//        int top = st.pop();
//        pushAtBottom(st,data);
//        st.push(top);
//
//    }
//    public static void reverseStack(Stack<Integer> st){
//        if(st.isEmpty()){
//            return;
//        }
//        int top = st.pop();
//        reverseStack(st);
//        pushAtBottom(st,top);
//    }
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//
//        reverseStack(st);
//        while(!st.isEmpty()){
//            System.out.println(st.pop());
//        }
//    }

    //next greater element
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        Stack<Integer> st = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            //remove small elements (from stack) then current element
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[st.peek()];
            }
            st.push(i);
        }
        //print
        for(int i=0; i<nxtGreater.length; i++){
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}
