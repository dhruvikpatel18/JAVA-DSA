public class SumTree {
    public static class Node{
        int data;
        Node right,left;

        public Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }
    public static int convertToSumTree(Node root){
        if(root == null) return 0;
        int leftSum = convertToSumTree(root.left);
        int rightSum = convertToSumTree(root.right);
        int leftSubTree = root.left == null?0:root.left.data;
        int rightSubTree = root.right == null?0:root.right.data;

        int currData = root.data;
        root.data = leftSubTree+leftSum+rightSubTree+rightSum;
        return currData;
    }
    //for print converted tree using preorder
    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        convertToSumTree(root);
        preorder(root);
    }
}
