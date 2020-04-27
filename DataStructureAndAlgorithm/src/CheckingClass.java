import Graphs.GraphImplementation;

public class CheckingClass {

    public static void main(String[] args) {
        GraphImplementation graphImplementation = new GraphImplementation(5);
        graphImplementation.AddEdges( 0, 1); // u is the current vertex and v is the adjacent vertex
        graphImplementation.AddEdges( 0, 4);
        graphImplementation.AddEdges( 1, 2);
        graphImplementation.AddEdges( 1, 3);
        graphImplementation.AddEdges( 1, 4);
        graphImplementation.AddEdges( 2, 3);
        graphImplementation.AddEdges( 3, 4);
        graphImplementation.printGraph();
    }
}
