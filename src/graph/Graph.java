package graph;


import java.util.ArrayList;


public interface Graph {
	
	public ArrayList<Vertex> neighboursVertex(Vertex vertex);
	
	public String toStringVertex();
	
	public String toStringEdge();
	
	public void addVertex(Vertex vertex);
	
	public void removeVertex(Vertex vertex);
	
	public int nbVertex();
	
	public void addEdge(Vertex vertex1,Vertex vertex2);
		
	public void removeEdge(Edge edge);
		
	public void addUndirectedEdge(UndirectedEdge edge);
	
	public void removeUndirectedEdge(UndirectedEdge edge);
	
	public void addDirectedEdge(DirectedEdge edge);
	
	public void removeDirectedEdge(DirectedEdge edge);
	
	public int nbEdge();

}