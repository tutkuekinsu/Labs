package Package;

public abstract class Shape3D {
	public String name;
	public int face;
	public int vertex;
	public int edge;
	public int length;
	
	public abstract String getName();
	public abstract void setName(String newName);
	abstract int getFace();
	abstract void setFace(int newFace);
	abstract int getVertex();
	abstract void setVertex(int newVertex);
	abstract int getEdge();
	abstract void setEdge(int newEdge);
	abstract int getLength();
	abstract void setLength(int newLength);
	abstract int getVolume();
	public abstract String toString();
	abstract void sayHi();
	abstract void isEulerian();
	
	
	

}
