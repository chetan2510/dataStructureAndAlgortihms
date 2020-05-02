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
        graphNode.setVisited(true);
        while(!graphNodeStack.isEmpty()) {
            GraphNode currentNode = graphNodeStack.pop();
            System.out.println(currentNode.getName());
           for(GraphNode neighbourNode : currentNode.getNeighbours())
               if(!neighbourNode.isVisited()) {
                   graphNodeStack.push(neighbourNode);
                   neighbourNode.setVisited(true);
               }

        }

    }


    // Its not working as the output is not matching with the iterative one
    /**
     *
     * @param graphNode
     */
    public static void performDFSRecursive(GraphNode graphNode) {

        graphNode.setVisited(true);
        System.out.println(graphNode.getName());
        for(GraphNode neighbour : graphNode.getNeighbours()) {
            if(!neighbour.isVisited()) {
                performDFSRecursive(neighbour);
            }
        }

    }
}
