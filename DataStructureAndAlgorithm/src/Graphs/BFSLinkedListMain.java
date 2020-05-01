package Graphs;

import java.util.LinkedList;

public class BFSLinkedListMain {

    public static LinkedList<GraphNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        // creating 10 nodes
        for (int i = 0; i < 10; i++) {
            nodeList.add(new GraphNode(i + "V"));
        }

        // adding edges to the graph
        developUndirectedGraph(1, 2);
        developUndirectedGraph(1, 4);
        developUndirectedGraph(2, 3);
        developUndirectedGraph(2, 5);
        developUndirectedGraph(3, 6);
        developUndirectedGraph(3, 10);
        developUndirectedGraph(4, 7);
        developUndirectedGraph(5, 8);
        developUndirectedGraph(6, 9);
        developUndirectedGraph(7, 8);
        developUndirectedGraph(8, 9);
        developUndirectedGraph(9, 10);

        // Ouput :
        //0V
        //1V
        //3V
        //2V
        //4V
        //6V
        //5V
        //9V
        //7V
        //8V
        for (GraphNode graphNode : nodeList)
            if (!graphNode.isVisited())
                BFSLinkedList.perfromBreadthFirstSearch(graphNode);


    }

    /**
     * Adds the neighbour in the graph
     *
     * @param i
     * @param j
     */
    private static void developUndirectedGraph(int i, int j) {
        GraphNode firstNode = nodeList.get(i - 1);
        GraphNode secondNode = nodeList.get(j - 1);
        firstNode.getNeighbours().add(secondNode);
        secondNode.getNeighbours().add(firstNode);
    }
}
