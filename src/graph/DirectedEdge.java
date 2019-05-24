package graph;

public class DirectedEdge extends Edge {
	
	public DirectedEdge(Vertex start, Vertex end) {
		super.vertex1 = start;
		super.vertex2 = end;
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