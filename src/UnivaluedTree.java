public class UnivaluedTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isUniValued(Node root){
        if(root == null){
            return true;
        }
        if(root.left != null && root.left.data != root.data){
            return false;
        } if(root.right != null && root.right.data != root.data){
            return false;
        }

        return isUniValued(root.left) && isUniValued(root.right);
    }

    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        root.right.left = new Node(6);
//        root.right.right = new Node(7);

        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.left = new Node(1);
        root.left.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);

        if(isUniValued(root)){
            System.out.println("Tree is univalued");
        }else{
            System.out.println("Tree is not univalued");
        }
    }
}
