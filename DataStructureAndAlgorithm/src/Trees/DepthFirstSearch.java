package Trees;

/**
 * We traverse depth wise
 */
public class DepthFirstSearch {

    /**
     * performs preOrderTraversing
     * Printing happens like root--leftSubTree--rightSubTree
     *
     * @param root, represents root binaryNode
     */
    public void preOrderTraversal(BinaryNode root) {
        if(root == null) {
            return;
        }
        System.out.print(" "+root.getValue()+" ");
        preOrderTraversal(root.getLeftNode());
        preOrderTraversal(root.getRightNode());
    }

    /**
     * Performs postOrderTraversing
     * Printing happens like leftSubtree--root--rightSubtree
     *
     * @param root
     */
    public void inOrderTraversal(BinaryNode root) {
        if(root == null) {
            return;
        }
        inOrderTraversal(root.getLeftNode());
        System.out.print(" "+root.getValue()+" ");
        inOrderTraversal(root.getRightNode());

    }

    /**
     * Performs postOrderTraversing
     * Printing happens like leftSubtree--rightSubtree--root
     *
     * @param root
     */
    public void postOrderTraversing(BinaryNode root) {
        if(root == null) {
            return;
        }
        postOrderTraversing(root.getLeftNode());
        postOrderTraversing(root.getRightNode());
        System.out.print(" "+root.getValue()+" ");
    }
}
