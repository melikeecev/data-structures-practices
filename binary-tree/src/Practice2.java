/*
* Problem: Write an efficient algorithm to compute the binary tree’s height. The height or depth of a binary tree is the
* total number of edges or nodes on the longest path from the root node to the leaf node.
* The program should consider the total number of nodes in the longest path. For example, an empty tree’s height is 0,
* and the tree’s height with only one node is 1.
* */

class Node{
    int key;
    Node left = null, right = null;
    Node(int key){
        this.key = key;
    }
}

public class Practice2 {

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(10);
        root.right = new Node(12);
        root.left.left = new Node(15);
        root.left.right = new Node(16);

        System.out.println("The height of the binary tree is " + height(root));
    }
}
