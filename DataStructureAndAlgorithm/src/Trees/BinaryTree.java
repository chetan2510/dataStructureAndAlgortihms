package Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * in this implementation the left side will be having larger number and the right side will be having smaller one
 */
public class BinaryTree {

    BinaryNode root;
    private int leftSpacing = 45;
    private int rightSpacing = 55;
    private int leftLeftSpacing = 45;
    private int leftRightSpacing = 45;
    private int rightLeftSpacing = 55;
    private int rightRightSpacing = 55;
    boolean inLeftNode;
    boolean inRigtNOde;



    /**
     * Parametrized constructor of the binary tree
     * @param root
     */
    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    /**
     * Gets the root node
     * @return
     */
    public BinaryNode getRoot() {
        return this.root;
    }

    /**
     * Inserts the value in the tree
     *
     * @param value, value to be inserted in the tree
     */
    public void insert(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BinaryNode currentNode = queue.poll();
            if(currentNode.getLeftNode() == null) {
               BinaryNode leftNode = new BinaryNode();
               leftNode.setValue(value);
               currentNode.setLeftNode(leftNode);
               break;
            } else if (currentNode.getRightNode() == null) {
                BinaryNode rightNode = new BinaryNode();
                rightNode.setValue(value);
                currentNode.setRightNode(rightNode);
                break;
            } else {
                queue.offer(currentNode.getLeftNode());
                queue.offer(currentNode.getRightNode());
            }
        }
    }
}
