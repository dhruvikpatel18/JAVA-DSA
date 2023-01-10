import java.util.*;

public class RangeSumBST {
    public static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.right = this.left = null;
        }
    }
    public static int sum = 0;
    public static int rangeSumBST(Node root, int low, int high){
        if(root == null) return 0;
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.peek();
            q.remove();

            if(curr.data >= low && curr.data <= high){
                sum += curr.data;
            }
            if(curr.left != null && curr.data > low){
                q.add(curr.left);
            }
            if(curr.right != null && curr.data < high){
                q.add(curr.right);
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        int ans = rangeSumBST(root,5,60);
        System.out.println(ans);
    }
}
