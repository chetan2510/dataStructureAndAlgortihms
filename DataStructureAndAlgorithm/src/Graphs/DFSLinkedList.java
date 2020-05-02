package Graphs;

import java.util.Stack;

public class DFSLinkedList {

    /**
     * Performs DFS for a graph
     * @param graphNode
     */
    public static void performDFS(GraphNode graphNode) {

        Stack<GraphNode> graphNodeStack = new Stack<>();
        graphNodeStack.push(graphNode);
        while(!graphNodeStack.isEmpty()) {
            GraphNode currentNode = graphNodeStack.pop();
            System.out.println(currentNode.getName());
            currentNode.setVisited(true);
           for(GraphNode neighbourNode : currentNode.getNeighbours())
               if(!neighbourNode.isVisited()) {
                   graphNodeStack.push(neighbourNode);
                   neighbourNode.setVisited(true);
               }

        }

    }
}
