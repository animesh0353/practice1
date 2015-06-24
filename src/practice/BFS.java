package practice;

public class BFS {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph adjList;
		
		Graph graph = new Graph(4);
	    graph.addEdge(1, 2);
	    graph.addEdge(1, 3);
	    graph.addEdge(2, 3);
	    graph.addEdge(3, 1);
	    graph.addEdge(3, 4);
	    graph.addEdge(4, 4);
	 
	    System.out.println("Following is Breadth First Traversal (starting from vertex 2) \n");
	    graph.bfs(1);
	 
	    
	    boolean[] visited = new boolean[graph.nodes.size()+1];
	    
	    System.out.println("\n Following is Depth First Traversal (starting from vertex 2) \n");
	    for(int i=graph.nodes.size(); i>0 ; i--)
	    	if(!visited[i])
	    		graph.dfs(i, visited);
		
		
	}

}
