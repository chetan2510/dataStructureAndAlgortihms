package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSLinkedList {


    /**
     * Perfoms breadth first search
     * @param node
     */
    public static void perfromBreadthFirstSearch(GraphNode node) {

        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove(0);
            currentNode.setVisited(true);
            System.out.println(currentNode.getName());
            for (GraphNode graphNode : currentNode.getNeighbours()) {
                if (!graphNode.isVisited()) {
                    graphNode.setVisited(true);
                    queue.add(graphNode);
                }
            }
        }
    }
}
