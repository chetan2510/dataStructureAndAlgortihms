package Graphs;

import java.util.LinkedList;

public class GraphUtils {

    /**
     * Adds the neighbour in the graph
     *
     * @param i
     * @param j
     */
    public static void developUndirectedGraph(LinkedList<GraphNode> graphNodes, int i, int j) {
        GraphNode firstNode = graphNodes.get(i - 1);
        GraphNode secondNode = graphNodes.get(j - 1);
        firstNode.getNeighbours().add(secondNode);
        secondNode.getNeighbours().add(firstNode);
    }
}
