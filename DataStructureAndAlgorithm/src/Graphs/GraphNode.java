package Graphs;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class GraphNode {

    private String name;
    private int index;
    private LinkedList<GraphNode> neighbour = new LinkedList<>();
    private boolean isVisited = false;
    private GraphNode parent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public LinkedList<GraphNode> getNeighbours() {
        return neighbour;
    }

    public void setNeighbours(LinkedList<GraphNode> neighbours) {
        this.neighbour = neighbours;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }


    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public GraphNode(String name) {
        this.name = name;
    }
}
