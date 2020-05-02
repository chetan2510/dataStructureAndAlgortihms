package Graphs.single_shortest_path_algos;

import Graphs.GraphNode;

import java.util.LinkedList;

/**
 * So in single shortest path one will be source that will be set to null
 * Now first agenda will be to set the parent of all the nodes and then using recursive calls
 * we can get the path to the parent
 */
public class BFSAsASingleShortestPath {

    /**
     *
     * @param node
     */
    public static void setparentInTheGraph(GraphNode node) {
        LinkedList<GraphNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(node);
        while (!nodeQueue.isEmpty()) {
            GraphNode currentNode = nodeQueue.remove(0);
            currentNode.setVisited(true);
           // System.out.print(currentNode.getName());
//            if(currentNode.getParent() != null)
//            System.out.print(" --- " + currentNode.getParent().getName());
            for (GraphNode neighbour : currentNode.getNeighbours()) {
                if (!neighbour.isVisited()) {
                    nodeQueue.add(neighbour);
                    neighbour.setVisited(true);
                    neighbour.setParent(currentNode);
                }
            }

//            System.out.println();

        }
    }

    /**
     * Prints the path recursively .....
     * @param node
     */
    public static void getPath(GraphNode node) {

      if(node.getParent() != null)
          getPath(node.getParent());

        System.out.print("  " + node.getName() + " >> ");
    }


}
