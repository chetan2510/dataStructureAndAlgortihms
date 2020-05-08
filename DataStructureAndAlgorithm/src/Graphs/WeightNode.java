package Graphs;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class WeightNode implements Comparable<WeightNode>{

    private String name;
    private LinkedList<WeightNode> neighbours = new LinkedList<>();
    private LinkedHashMap<WeightNode, Integer> weightMap = new LinkedHashMap<>();
    private boolean isVisited = false;
    private WeightNode parent;
    private int distance;

    public WeightNode(String name) {
           setName(name);
           setDistance(Integer.MAX_VALUE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<WeightNode> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(LinkedList<WeightNode> neighbours) {
        this.neighbours = neighbours;
    }

    public LinkedHashMap<WeightNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(LinkedHashMap<WeightNode, Integer> weightMap) {
        this.weightMap = weightMap;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public WeightNode getParent() {
        return parent;
    }

    public void setParent(WeightNode parent) {
        this.parent = parent;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public int compareTo(WeightNode node) {

        // current distance should be less.
        // eg current distance = 0, node distance = infinite
        // 0 - infinity => negative number so the current node will remain on top
        return this.distance - node.distance;
    }
}
