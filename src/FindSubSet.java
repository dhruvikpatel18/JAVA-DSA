public class FindSubSet {
    //n elements substring will be 2^n
    //TC:O(n*2^n) , SC:O(n)
    public static void subSet(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        subSet(str,ans+str.charAt(i),i+1);
        //No choice
        subSet(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSet(str,"",0);
    }
}
