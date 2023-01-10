import java.util.Stack;

public class MaxRectangularArea {
    public static void maxArea(int[] h){
        int[] nsl = new int[h.length]; //next smaller in left
        int[] nsr = new int[h.length]; //next smaller in right
        int maxarea = 0;

        Stack<Integer> st = new Stack<>();
        //next smaller in right
        for(int i=h.length-1; i>=0; i--){
            //for next greater ele -> while(!st.isEmpty() && h[st.peek()] >=h[i])
            while(!st.isEmpty() && h[st.peek()] >=h[i]){
                    st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = h.length;
            }else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        //next smaller in left
        st = new Stack<>();
        for(int i=0; i<h.length; i++){
            //for next greater ele -> while(!st.isEmpty() && h[st.peek()] >=h[i])
            while(!st.isEmpty() && h[st.peek()] >=h[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i] = -1;
            }else{
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        //calculate curr area : width->j-i-1-> nsr[i] - nsl[i] -1;
        for(int i=0; i<h.length; i++){
            int height = h[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height*width;
            maxarea = Math.max(area,maxarea);
        }
        System.out.println(maxarea);

    }
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
//        System.out.println(maxArea(heights));
        maxArea(heights);

    }
}
