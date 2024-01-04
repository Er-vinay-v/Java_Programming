package Trees;

public class Basics {
    static void display(treeNode root){
        if (root==null){
            return;
        }
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);

    }

    public static class treeNode{
        int val;
        treeNode left;
        treeNode right;
        treeNode(int val){this.val=val;}
    }
    public static void main(String[] args) {
        treeNode x1=new treeNode(1);
        treeNode x2=new treeNode(2);
        treeNode x3=new treeNode(3);
        treeNode x4=new treeNode(4);
        treeNode x5=new treeNode(5);
        x1.left=x2;
        x1.right=x3;
        x2.left=x4;
        x2.right=x5;
        display(x1);
    }
}
