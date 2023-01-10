import javax.swing.*;
import java.util.*;

public class Trie {
    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false; //end of word

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }
    //create root for starting a trie
    public static Node root = new Node();

    //insert TC:(L)
    public static void insert(String word){
        //initialize curr from root
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    //search TC:(L)
    public static boolean search(String key){
        Node curr = root;
        for(int level =0; level<key.length(); level++){
            int idx = key.charAt(level)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow = true;
    }

    //WORDBREAK PROBLEM
    public static boolean wordBreak(String key){
        if(key.length() == 0) return true;
        for(int i=1; i<key.length(); i++){
            if(search(key.substring(0,i)) && wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    //Longest word with all prefix
    public static String ans ="";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null) return;

        for(int i=0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                char ch = (char)(i-'a');
                temp.append(ch);
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i],temp);
                //backtrack
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }


    public static void main(String[] args) {
        String[] arr = {"i","like","sam","samsung","mobile","ice" };
        //insert into trie
        for(int i=0; i< arr.length; i++){
            insert(arr[i]);
        }
//        String key = "ilikesamsung";
//        System.out.println(wordBreak(key));

        longestWord(root,new StringBuilder(""));
        System.out.println(ans);

    }
}
