package Graphs.single_shortest_path_algos;

import Graphs.GraphNode;

import java.util.LinkedList;

import static Graphs.GraphUtils.developUndirectedGraph;

public class BFSAsASingleShortestPathMain {

    private static LinkedList<GraphNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        // can make this dynamic but for now let it be like that
        for (int i = 0; i < 10; i++) {
            nodeList.add(new GraphNode(i + "V"));
        }

        // links the graph
        developUndirectedGraph(nodeList, 1,9);
        developUndirectedGraph(nodeList,9,3);
        developUndirectedGraph(nodeList,9,10);
        developUndirectedGraph(nodeList,3,2);
        developUndirectedGraph(nodeList,10,2);
        developUndirectedGraph(nodeList,3,5);
        developUndirectedGraph(nodeList,2,4);
        developUndirectedGraph(nodeList,2,8);
        developUndirectedGraph(nodeList,4,5);
        developUndirectedGraph(nodeList,4,6);
        developUndirectedGraph(nodeList,8,7);
        developUndirectedGraph(nodeList,6,7);

        // Setting the parent for the graph taking 2 as the source
        BFSAsASingleShortestPath.setparentInTheGraph(nodeList.get(2));
        BFSAsASingleShortestPath.getPath(nodeList.get(9));


    }



}
