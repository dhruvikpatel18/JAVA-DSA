public class Klevel {
    public static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void kThLevel(Node root,int level,int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        kThLevel(root.left,level+1,k);
        kThLevel(root.right,level+1,k);
    }

    public static void main(String[] args) {

          /*
                    1                 1st level
                   / \
                  2   3               2st level
                 / \ / \
                4  5    6             3st level
               /
              7                       4st level
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.right.right= new Node(6);
        root.left.left.left= new Node(7);

        //print 3rd level
        kThLevel(root,1,3);

    }
}
