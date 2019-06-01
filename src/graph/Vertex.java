package graph;

import java.io.Serializable;


public class Vertex implements Serializable{

	private Object object;

	public Vertex(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}