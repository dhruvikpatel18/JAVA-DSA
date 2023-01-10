import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopViewOfTree {
    static class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class queueInfo{
        int hd;//horizontal distance
        Node node;

        public queueInfo(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root){
        //level order traversal
        if(root == null){
            return;
        }
        Map<Integer,Integer> map = new HashMap<>();
        Queue<queueInfo> q = new LinkedList<>();
        q.add(new queueInfo(root,0));
        q.add(null);
        int min = 0,max=0;

        while(!q.isEmpty()){
            queueInfo curr = q.remove();

            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                //check if Hd is encountered for first time
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node.data);
                }
                if(curr.node.left != null){
                    q.add(new queueInfo(curr.node.left,curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new queueInfo(curr.node.right, curr.hd+1));
                    max= Math.max(max, curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i)+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
         /*
                    1
                   / \
                  2   3
                   \
                    4
                     \
                      5
                       \
                        6
                expected output : 2 1 3 6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        topView(root);

    }
}
