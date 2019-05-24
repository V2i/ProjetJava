package graph;

import java.util.List;

public interface Graph {
	List<Vertex> listOfVertex();
	List<Edge> listOfEdge();
	

	public Vertex[] neighboursVertex(Vertex vertex);
	
	public String toStringVertex();
	
	public String toStringEdge();
	
	void addVertex(Vertex vertex);
	
	void removeVertex(Vertex vertex);
	
	int nbVertex();
	
	void addEdge(Vertex vertex1,Vertex vertex2);
		
	void removeEdge(Edge edge);
		
	void addUndirectedEdge(UndirectedEdge edge);
	
	void removeUndirectedEdge(UndirectedEdge edge);
	
	void addDirectedEdge(DirectedEdge edge);
	
	void removeDirectedEdge(DirectedEdge edge);
	
	int nbEdge();

}