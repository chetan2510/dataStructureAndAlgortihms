package Graphs;

import java.util.Stack;

public class TopologicalSort {

    public Stack<GraphNode> graphNodeStack = new Stack<>();

    /**
     * Performs topological sorting
     * Complexity : Time complexity O(E + V)
     * space complexity : O(E + V)
     *
     * @param node
     */

    public void performTopologicalSort(GraphNode node) {

        for (GraphNode neighbour : node.getNeighbours()) {
            if (!neighbour.isVisited())
                performTopologicalSort(neighbour);
        }

        node.setVisited(true);
        graphNodeStack.push(node);
    }

    /**
     * pop out all the elements from the stack
     */
    public void popAllFromStack() {

        // while the stack is not empty
        while (!graphNodeStack.isEmpty()) {
            System.out.println(graphNodeStack.pop());
        }
    }
}
