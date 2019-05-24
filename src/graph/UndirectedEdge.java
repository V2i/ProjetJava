package graph;

public class UndirectedEdge extends Edge {
	
	public UndirectedEdge(Vertex vertex1, Vertex vertex2) {
		super.vertex1 = vertex1;
		super.vertex2 = vertex2;
	}

	public Vertex getVertex1() {
		return super.vertex1;
	}

	public Vertex getVertex2() {
		return super.vertex2;
	}

	public Vertex[] getAllVertex() {
		return new Vertex [] { super.vertex1, super.vertex2 };
	}

}