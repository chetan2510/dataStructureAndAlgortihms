package Graphs.single_shortest_path_algos.WeightedGraphs.NegativeCycle;

import Graphs.WeightNode;

import java.util.LinkedList;

// bellmann ford to save us from negative cycle
public class BellmanFordImplementation {

    private static LinkedList<WeightNode> nodeList = new LinkedList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            nodeList.add(new WeightNode("" + (char) (65 + i)));
        }

        addWeightedEdge(1, 3, 6);
        addWeightedEdge(1, 4, 3);
        addWeightedEdge(2, 1, 3);
        addWeightedEdge(3, 4, 2);
        addWeightedEdge(4, 3, 1);
        addWeightedEdge(4, 2, 1);
        addWeightedEdge(5, 2, 4);
        addWeightedEdge(5, 4, 2);

        performBellmanFordOnNode(nodeList.get(4));
        verifyIfNegativeCycleIsNotThere();

    }

    private static void addWeightedEdge(int indexOfCurrentNode, int indexOfNeighbourNode, int edgeWeight) {
        WeightNode currentNode = nodeList.get(indexOfCurrentNode - 1);
        WeightNode neighbourNode = nodeList.get(indexOfNeighbourNode - 1);
        currentNode.getNeighbours().add(neighbourNode);
        currentNode.getWeightMap().put(neighbourNode, edgeWeight);

    }

    // Performs the bellmanFord algorithm on each node
    private static void performBellmanFordOnNode(WeightNode currentNode) {

        int numberOfVertexs = nodeList.size();

        // Updates the distance of each node with the maximum integer value.
        for (WeightNode node : nodeList) {
            node.setDistance(Integer.MAX_VALUE/10); // <-- Important to divide by 10 run without it and observe the difference ; )
        }

        // setting Starting point's distance 0
        currentNode.setDistance(0);

        for (int i = 0; i < numberOfVertexs - 1; i++) {
            for (WeightNode node : nodeList) {
                WeightNode recentNode = node;
                for (WeightNode neighbour : recentNode.getNeighbours()) {
                    if (neighbour.getDistance() > (recentNode.getDistance() + recentNode.getWeightMap().get(neighbour))) {
                        neighbour.setDistance(recentNode.getDistance() + recentNode.getWeightMap().get(neighbour));
                        neighbour.setParent(recentNode);
                    }
                }
            }
        }

    }

    // Checks for negative cycle
    private static void verifyIfNegativeCycleIsNotThere(){

        // This is the USP for the bellman ford, so basically it has iterated all the nodes and has set the
        // minimum distance for all. Now in this iteration that is the last iteration it is just checking
        // if the distance is getting reduced or not. If yes that proves negstive cycle is there
        // else everything is fine
        for(WeightNode recentNode : nodeList) {
            for (WeightNode neighbour : recentNode.getNeighbours()) {
                if (neighbour.getDistance() > recentNode.getDistance() + recentNode.getWeightMap().get(neighbour)) {
                    System.out.println("Negative cycle  found");
                    System.out.println("Node name : " +neighbour.getName());
                    return;
                }
            }
        }
    }


}
