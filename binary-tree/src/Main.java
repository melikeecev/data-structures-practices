/*
*Problem: Write an efficient algorithm to check if two binary trees are identical or not. Two binary trees are identical
* if they have identical structure and their contents are also the same.
* */

class Node{
    int key;
    Node left = null, right = null;
    Node(int key) {
        this.key = key;
    }
}

public class Main {

    public static boolean isTreesIdentical(Node x, Node y){
        if(x == null && y== null) {
            return true;
        }else{
            return (x.key == y.key) && isTreesIdentical(x.left, y.left)
                    && isTreesIdentical(x.right, y.right);
        }
    }

    public static void main(String[] args) {
        Node x = new Node(15);
        x.left = new Node(10);
        x.right = new Node(20);
        x.left.left = new Node(8);
        x.left.right = new Node(12);
        x.right.left = new Node(16);
        x.right.right = new Node(25);

        Node y = new Node(15);
        y.left = new Node(10);
        y.right = new Node(20);
        y.left.left = new Node(8);
        y.left.right = new Node(12);
        y.right.left = new Node(16);
        y.right.right = new Node(25);

        if (isTreesIdentical(x, y)) {
            System.out.println("The given binary trees are identical");
        }
        else {
            System.out.println("The given binary trees are not identical");
        }

    }
}
