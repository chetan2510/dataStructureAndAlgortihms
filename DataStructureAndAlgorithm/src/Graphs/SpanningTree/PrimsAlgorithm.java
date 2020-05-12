package Graphs.SpanningTree;
import Graphs.WeightNode;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    private static LinkedList<WeightNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {
        for(int i = 0; i< 5; i++) {
            nodeList.add(new WeightNode("" + (char)(65 + i)));
        }

        addUndirectedGraph(1,2,10);
        addUndirectedGraph(1,3,20);
        addUndirectedGraph(2,3,30);
        addUndirectedGraph(2,4,5);
        addUndirectedGraph(3,4,15);
        addUndirectedGraph(3,5,6);
        addUndirectedGraph(4,5,8);

        prims(nodeList.get(4));


    }

    /**
     * Adds value to undirected graph
     *
     * @param i
     * @param j
     * @param distance
     */
    private static void addUndirectedGraph(int i, int j, int distance) {
        WeightNode firstNode = nodeList.get(i - 1);
        WeightNode secondNode = nodeList.get(j - 1);
        firstNode.getNeighbours().add(secondNode);
        secondNode.getNeighbours().add(firstNode);
        firstNode.getWeightMap().put(secondNode, distance);
        secondNode.getWeightMap().put(firstNode, distance);

    }


    /**
     * Performs prims algorithm
     *
     * @param node
     */
    private static void prims(WeightNode node) {
        for(int counter = 0; counter < nodeList.size(); counter++) {
            nodeList.get(counter).setDistance(Integer.MAX_VALUE);
        }
        node.setDistance(0);
        PriorityQueue<WeightNode> queue = new PriorityQueue<>();
        queue.addAll(nodeList);
        while(!queue.isEmpty()) {
           WeightNode presentedNode = queue.poll();
           for(WeightNode neighbour : presentedNode.getNeighbours()) {

               // This if condition is a main difference between dijkstra and prims
               // NOTE: we are noting adding the distance of current node ;)
               if(neighbour.getDistance() > presentedNode.getWeightMap().get(neighbour)) {
                   neighbour.setDistance(presentedNode.getWeightMap().get(neighbour));
                   neighbour.setParent(presentedNode);

                   //  *** refreshing the queue ***
                   queue.remove(neighbour);
                   queue.add(neighbour);
               }
           }
        }

        int cost = 0;
        // print table of node with minimum distance and shortest path from source
        for (WeightNode nodeToCheck : nodeList) {
            System.out.print("Node " + nodeToCheck.getName());
            if(nodeToCheck.getParent() != null)
            System.out.print(" key: " + nodeToCheck.getDistance() + ", Parent: " + nodeToCheck.getParent().getName());
            cost = cost + nodeToCheck.getDistance();
            System.out.println();
        }//end of for loop

        System.out.println("\nTotal cost of MST: " + cost);
    }
}
