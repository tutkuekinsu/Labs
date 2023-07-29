package Package;

public class Cube extends Shape3D{
	
	public Cube(String name, int face, int vertex , int edge, int length)
	{
		setName(name);
		setFace(face);
		setVertex(vertex);
		setEdge(edge);
		setLength(length);
	}
	
	public void printAll( Pyramid[] pyramids ) {
		int i=2;
		pyramids[i].sayHi();
		System.out.println("Name: " + getName() + "\nFace: " + getFace() + "\nVertex: " + getVertex() + "\nEdge: " + getEdge() + "\nLength: " + getLength() + "\nVolume: " + getVolume() );

		
	}
	
	
	
	public void setName(String newName) {
		this.name=newName;
	}
	
	public String getName() {
		return name;
	}
	public void setFace(int newFace) {
		this.face=newFace;
		
	}
	
	public int getFace() {
		return face;
	}
	
	
	public void setVertex(int newVertex) {
		this.vertex=newVertex;
	}
	
	
	public int getVertex() {
		return vertex;
	}
	
	public void setEdge(int newEdge) {
		this.edge=newEdge;
	}
	public int getEdge() {
		return edge;
	}
	
	public  void setLength(int newLength) {
		this.length=newLength;
	}
	public int getLength() {
		return length;
	}
	
	public int getVolume() {
		return (int)Math.pow(length,3);
	}
	
	public String toString() {
		return this.toString();
	}
	
	
	public void sayHi() {
		System.out.println(this.name + "is a" + this.getClass());
	}
	
	
	public void isEulerian() {
		if(face+vertex==edge+2)
			System.out.println(name +"satisfies Euler’s formula :)");
		else
			System.out.println(name+ "does not satisfy Euler’s formula :(");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
