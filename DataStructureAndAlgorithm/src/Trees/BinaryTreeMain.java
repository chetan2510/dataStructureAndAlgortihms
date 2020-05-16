package Trees;

/**
 * Binary tree main class
 */
public class BinaryTreeMain {

    private static BinaryTree binaryTree;

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode();
        root.setValue(20);
        binaryTree = new BinaryTree(root);
        binaryTree.insert(100);
        binaryTree.insert(3);
        binaryTree.insert(50);
        binaryTree.insert(15);
        binaryTree.insert(250);
        binaryTree.insert(35);
        binaryTree.insert(222);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.preOrderTraversal(root);
        System.out.println();
        depthFirstSearch.inOrderTraversal(root);
        System.out.println();
        depthFirstSearch.postOrderTraversing(root);


    }


}