package graph;

public abstract class Edge {

	Vertex vertex1;
	Vertex vertex2;

	public abstract Vertex getVertex1();

	public abstract Vertex getVertex2();

	public abstract Vertex[] getAllVertex();

}