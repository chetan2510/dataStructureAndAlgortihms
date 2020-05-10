package Graphs.SpanningTree;

import Graphs.WeightNode;

import java.util.LinkedList;
import java.util.PriorityQueue;

// Implements kruskals algorithm
public class KruskalsAlgorithm {

    private static LinkedList<WeightNode> nodeList = new LinkedList<>();
    private static PriorityQueue<EdgeClass> edgeQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            nodeList.add(new WeightNode("" + (char) (65 + i)));
        }

        addWeightUndirectedGraph(1, 2, 10);
    }

    private static void addWeightUndirectedGraph(int firstIndex, int secondIndex, int distance) {

        WeightNode firstNode = nodeList.get(firstIndex);
        WeightNode secondNode = nodeList.get(secondIndex);
        EdgeClass edgeClassObject = new EdgeClass();
        edgeClassObject.setFirstNode(firstNode);
        edgeClassObject.setSecondNode(secondNode);
        edgeClassObject.setEdgeLenght(distance);
        edgeQueue.add(edgeClassObject);

    }


    private static int performKruskalAlgorithm() {

        int cost = 0;
        while(!edgeQueue.isEmpty()) {

            EdgeClass edgeClass = edgeQueue.poll();
            WeightNode neighbourOne = edgeClass.getFirstNode();
            WeightNode neighbourSecond = edgeClass.getSecondNode();


            // TODO: Create a disjoint class and add the requried fuctions and then continue

        }

        return cost;


    }


}
