package Graphs.single_shortest_path_algos.WeightedGraphs;

import Graphs.WeightNode;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraMain {
    private static LinkedList<WeightNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        // Creates 5 nodes of the graph
        for (int i = 0; i < 5; i++) {
            nodeList.add(new WeightNode("" + (char) (65 + i)));
        }

        // current node, neighbour, distance between the neighbour
        addWeightedEdge(1, 3, 6);
        addWeightedEdge(1, 4, 3);
        addWeightedEdge(2, 1, 3);
        addWeightedEdge(3, 4, 2);
        addWeightedEdge(4, 3, 1);
        addWeightedEdge(4, 2, 1);
        addWeightedEdge(5, 2, 4);
        addWeightedEdge(5, 4, 2);

        // printing the nodes taking source as E
        performDijkstra(nodeList.get(4));



    }


    // Adds the weight to the node also sets its distance
    private static void addWeightedEdge(int i, int j, int d) {

        WeightNode currentNode = nodeList.get(i - 1);
        WeightNode neighbour = nodeList.get(j - 1);
        currentNode.getNeighbours().add(neighbour);
        currentNode.getWeightMap().put(neighbour, d);

    }

    private static void performDijkstra(WeightNode node) {

        // Heap is implemented at the backend of the priority queue. So this is the best use case scenario for it.
        PriorityQueue<WeightNode> priorityQueue = new PriorityQueue<>();
        node.setDistance(0);
        priorityQueue.addAll(nodeList);

        // loop until the queue gets empty
        while (!priorityQueue.isEmpty()) {

            // taking the first node from the priority queue
            WeightNode currentNode = priorityQueue.poll();
            for (WeightNode neighbour : currentNode.getNeighbours()) {
                if (priorityQueue.contains(neighbour)) // means neighbour is not visited
                {
                    if (currentNode.getDistance() + currentNode.getWeightMap().get(neighbour) < neighbour.getDistance()) {
                        neighbour.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbour));
                        neighbour.setParent(currentNode);
                    }

                    //  *** refreshing the queue ***
                    priorityQueue.remove(neighbour);
                    priorityQueue.add(neighbour);
                }
            }
        }
    }


    /**
     * Prints the path
     * @param node
     */
    private static void printPath(WeightNode node) {

        if(node.getParent() != null) {
            System.out.println(node.getParent().getName() + " -> ");
            printPath(node.getParent());
        } else {
            System.out.println(node.getName());
        }
    }


}
