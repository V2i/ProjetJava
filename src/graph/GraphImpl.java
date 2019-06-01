package graph;
import graph.*;

import java.util.ArrayList;
import java.io.Serializable;


public class GraphImpl implements Graph, Serializable{

    private ArrayList<Vertex> listVertex;
    private ArrayList<Edge> listEdge;

    public GraphImpl() {
        this.listEdge = new ArrayList<Edge>();
        this.listVertex = new ArrayList<Vertex>();
    }

    public GraphImpl(ArrayList<Vertex> listVertex, ArrayList<Edge> listEdge) {
        this.listEdge = listEdge;
        this.listVertex = listVertex;
    }

    public GraphImpl(ArrayList<Vertex> listVertex) {
        this.listEdge = new ArrayList<Edge>();
        this.listVertex = listVertex;
    }

    public ArrayList<Vertex> neighboursVertex(Vertex vertex){
        ArrayList<Vertex> listVertex = null;

        for(Edge edge : this.listEdge){
            if(edge.getVertex1().equals(vertex)) {
                listVertex.add(edge.getVertex2());
            }else if(edge.getVertex2().equals(vertex) && edge instanceof DirectedEdge) {
                listVertex.add(edge.getVertex1());
            }
        }
        return listVertex;
    }

    public String toStringVertex() {
        String res = "";
        for (Vertex vertex : this.listVertex) {
            res += vertex.getObject().toString() + "\n";
        }
        return res;
    }
    
    public String toStringEdge() {
        String res = "";
        for (Edge edge : this.listEdge) {
            res += edge.getVertex1().getObject().toString() + " " + edge.getVertex2().getObject().toString() + "\n";
        }
        return res;
    }

    public void addVertex(Vertex vertex) {
        this.listVertex.add(vertex);
    }

    public void removeVertex(Vertex vertex) {
        this.listVertex.remove(vertex);
    }

	public int nbVertex() {
        return this.listVertex.size();
    }

	public void addEdge(Vertex vertex1,Vertex vertex2) {
        Edge edge = new UndirectedEdge(vertex1, vertex2);
        this.listEdge.add(edge);
    }

	public void removeEdge(Edge edge) {
        this.listEdge.remove(edge);
    }

	public void addUndirectedEdge(UndirectedEdge edge){
        this.listEdge.add(edge);
    }

    public void removeUndirectedEdge(UndirectedEdge edge){
        this.listEdge.remove(edge);
    }

    public void addDirectedEdge(DirectedEdge edge) {
        this.listEdge.add(edge);
    }

    public void removeDirectedEdge(DirectedEdge edge){
        this.listEdge.remove(edge);
    }

    public int nbEdge() {
        return this.listEdge.size();
    }

    public ArrayList<Vertex> getListVertex() {
        return this.listVertex;
    }
}