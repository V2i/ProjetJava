package graph;

public class TestGraph {

	public static void main(String[] args) {
		Vertex vertex1 = new Vertex(args);
		Vertex vertex2 = new Vertex(args);
		
		UndirectedEdge edge = new UndirectedEdge(vertex1,vertex2);
		DirectedEdge edge2 = new DirectedEdge(vertex1,vertex2);
	}

}