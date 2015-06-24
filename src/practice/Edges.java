package practice;

public class Edges {

	int destination;
	long child;
	
	
	
	Edges(int destination)
	{
		this.destination = destination;
		child = 0;
	}
	void putChild(long child)
	{
		this.child = child;
	}
	long getChild()
	{
		return child;
	}
	
	
}
