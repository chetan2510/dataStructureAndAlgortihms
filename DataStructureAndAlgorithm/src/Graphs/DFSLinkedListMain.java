package Graphs;

import java.util.LinkedList;
import static Graphs.GraphUtils.developUndirectedGraph;

public class DFSLinkedListMain {

    public static LinkedList<GraphNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        // cresting 10 nodes
        for(int i = 0; i< 10; i++) {
            nodeList.add(new GraphNode(i+"V"));
        }

        // building graph by adding edges to it
        developUndirectedGraph(nodeList,1, 2);
        developUndirectedGraph(nodeList,1, 4);
        developUndirectedGraph(nodeList,2, 3);
        developUndirectedGraph(nodeList,2, 5);
        developUndirectedGraph(nodeList,3, 6);
        developUndirectedGraph(nodeList,3, 10);
        developUndirectedGraph(nodeList,4, 7);
        developUndirectedGraph(nodeList, 5, 8);
        developUndirectedGraph(nodeList, 6, 9);
        developUndirectedGraph(nodeList, 7, 8);
        developUndirectedGraph(nodeList, 8, 9);
        developUndirectedGraph(nodeList, 9, 10);


        // Output:
        //0V
        //3V
        //6V
        //7V
        //8V
        //9V
        //2V
        //5V
        //1V
        //4V
        // This loop is basically for the unconnected ones
        for(GraphNode graphNode : nodeList) {
            if(!graphNode.isVisited()) {

                // connected ones will be taken care in this method only
                DFSLinkedList.performDFS(graphNode);
            }
        }
    }
}
