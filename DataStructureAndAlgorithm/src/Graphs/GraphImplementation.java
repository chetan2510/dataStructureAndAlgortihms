package Graphs;

import java.util.LinkedList;

public class GraphImplementation {

    LinkedList<LinkedList<Integer>> graph;

    public GraphImplementation(int numberOfVertices) { //numberOfVertices means number of nodes
        graph = new LinkedList<>();
        for(int i = 0; i < numberOfVertices; i++) {
            LinkedList<Integer> list = new LinkedList<>();
            graph.add(list);
        }
    }

    public void AddEdges(int u, int v) {
        graph.get(u).add(v);
    }

    public void printGraph() {
        int i = 0;
        for (LinkedList<Integer> list : graph ) {
            System.out.print("For vertex "+ i + " ->");
            for (Integer value : list) {
                System.out.print(value.intValue());
                System.out.print(" -> ");
            }
            System.out.println();
            i++;
        }
    }

}
