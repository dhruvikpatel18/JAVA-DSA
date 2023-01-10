public class LargestBSTinBT {
    public static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.right = this.left = null;
        }
    }
    //to store the information of current BST
    public static class Info{
        boolean isBst;
        int size;
        int max;
        int min;

        public Info(boolean isBst, int size, int max, int min){
            this.isBst = isBst;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root){
        if(root == null){
            return new Info(true,0,Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.data, Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max,rightInfo.max));

        if(root.data <= leftInfo.max || root.data>= rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.isBst && rightInfo.isBst){
            maxBST = Math.max(maxBST,size);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }

    public static void main(String[] args) {
               /*
                       50
                     /    \
                  30       60
                 /  \     /  \
                5   20   45    70
                              /  \
                            65    80

                    given BT
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
                     60
                    /  \
                  45    70
                       /  \
                     65    80
            expected BST
        */
        largestBST(root);
        System.out.println("Largest BST is: "+maxBST);

    }
}
