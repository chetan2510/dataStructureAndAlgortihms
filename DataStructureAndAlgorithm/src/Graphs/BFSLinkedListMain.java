package Graphs;

import java.util.LinkedList;
import static Graphs.GraphUtils.developUndirectedGraph;

public class BFSLinkedListMain {

    public static LinkedList<GraphNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        // creating 10 nodes
        for (int i = 0; i < 10; i++) {
            nodeList.add(new GraphNode(i + "V"));
        }

        // adding edges to the graph
        developUndirectedGraph(nodeList, 1, 2);
        developUndirectedGraph(nodeList, 1, 4);
        developUndirectedGraph(nodeList, 2, 3);
        developUndirectedGraph(nodeList, 2, 5);
        developUndirectedGraph(nodeList, 3, 6);
        developUndirectedGraph(nodeList, 3, 10);
        developUndirectedGraph(nodeList, 4, 7);
        developUndirectedGraph(nodeList, 5, 8);
        developUndirectedGraph(nodeList, 6, 9);
        developUndirectedGraph(nodeList, 7, 8);
        developUndirectedGraph(nodeList, 8, 9);
        developUndirectedGraph(nodeList, 9, 10);

        // *** Time complexity : O(V + E) ***
        // *** Space complexity : O(V + E) ***
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

}
