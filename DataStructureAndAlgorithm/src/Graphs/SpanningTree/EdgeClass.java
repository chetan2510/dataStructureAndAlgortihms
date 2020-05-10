package Graphs.SpanningTree;

import Graphs.WeightNode;

public class EdgeClass implements Comparable<EdgeClass> {

    private WeightNode firstNode;
    private WeightNode secondNode;
    private int edgeLength;

    public WeightNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(WeightNode firstNode) {
        this.firstNode = firstNode;
    }

    public WeightNode getSecondNode() {
        return secondNode;
    }

    public void setSecondNode(WeightNode secondNode) {
        this.secondNode = secondNode;
    }
    public int getEdgeLenght() {
        return edgeLength;
    }

    public void setEdgeLenght(int edgeLenght) {
        edgeLength = edgeLenght;
    }

    @Override
    public int compareTo(EdgeClass object) {
        return this.edgeLength - object.edgeLength;
    }
}
