import java.util.ArrayList;

public class Bst {
    static class Node{
        int val;
        Node right,left;

        public Node(int val){
            this.val = val;
            this.right = null;
            this.left = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.val > val){
            //insert in left side
           root.left = insert(root.left,val);
        }else{//insert in right side
            root.right = insert(root.right,val);
        }
        return root;
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.val >= k1 && root.val <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.val+" ");
            printInRange(root.right,k1,k2);
        }
        else if(root.val > k2){
            printInRange(root.left,k1,k2);
        }else{
            printInRange(root.right,k1,k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i));
        }
        System.out.println();
    }
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return ;
        }
        path.add(root.val);

        if(root.left == null && root.right == null){
            printPath(path);
        }
        printRoot2Leaf(root.left,path);
        printRoot2Leaf(root.right,path);


        path.remove(path.size()-1);//while backtraking

    }

    public static boolean isValidBST(Node root, Node min, Node max){
        if(root == null) return true;

        // check left side
        if(max != null && root.val >= max.val){
            return false;
        }
        //check right side
        else if(min != null && root.val <= min.val){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    public static Node createMirror(Node root){
        if(root == null) return null;

        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node createBST(int[] arr, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,st,mid-1);
        root.right = createBST(arr,mid+1, end);

        return root;
    }

    public static Node balanceBST(Node root){
        ArrayList<Integer> arr = new ArrayList<>();
        getInOrder(root,arr);
        return convertToBST(arr,0,arr.size()-1);
    }
    public static void getInOrder(Node root, ArrayList<Integer> arr){
       if (root == null) return;
        getInOrder(root.left,arr);
        arr.add(root.val);
        getInOrder(root.right,arr);
    }
    public static Node convertToBST(ArrayList<Integer> arr, int st, int end){
        if(st > end) return null;

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = convertToBST(arr,st,mid-1);
        root.right = convertToBST(arr,mid+1,end);

        return root;
    }

    public static void main(String[] args) {

//        int values[] = {8,5,3,1,4,6,10,11,14};
////        int values[] = {5,4,6};
//        Node root = null;
//        for(int i=0; i< values.length; i++){
//            root = insert(root,values[i]);
//        }

//        printInRange(root,5,12); // 5 to 12
        
//        printRoot2Leaf(root,new ArrayList<>());

//       if (isValidBST(root,null,null)){
//           System.out.println("Valid BST");
//       }else{
//           System.out.println("Invalid BST");
//       }

//        createMirror(root);
//        preorder(root);

//        int[] arr = {3,5,6,8,10,11,12};
//        createBST(arr,0, arr.length-1);
//        preorder(root);

        /*
                     8
                   /   \
                  6     10
                 /       \
                5         11
               /           \
              3             12
            given BST
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
 /*
                     8
                   /   \
                  5     11
                 / \    / \
                3   6  10 12
            expected BST
         */
        root = balanceBST(root);
        preorder(root);
    }
}
