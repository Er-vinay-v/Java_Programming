package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Breadth_first_Search {
    public static class treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode(int val){this.val=val;}
    }
     public static ArrayList<Integer>display(treeNode root){
        ArrayList<Integer>ans=new ArrayList<>();
         Queue<treeNode>q=new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
             treeNode x=q.remove();
             if (x.left!=null)q.add(x.left);
             if (x.right!=null)q.add(x.right);
             ans.add(x.val);
         }
         return ans;
    }

    public static void main(String[] args) {
        treeNode x1=new treeNode(1);
        treeNode x2=new treeNode(2);
        treeNode x3=new treeNode(3);
        treeNode x4=new treeNode(4);
        treeNode x5=new treeNode(5);
        treeNode x6=new treeNode(6);
        treeNode x7=new treeNode(7);

        x1.left=x2;
        x1.right=x3;
        x2.left=x4;
        x2.right=x5;
        x3.left=x6;
        x3.right=x7;
        ArrayList<Integer>ab=new ArrayList<>(display(x1));
        System.out.println(ab);
        System.out.println("Space complexity: O(n)");
        System.out.println("Time complexity is: O(n)");

    }
}
