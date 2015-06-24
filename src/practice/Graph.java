package practice;


import java.util.*;



public class Graph {

	Map<Integer, ArrayList<Edges>> nodes;
	
	Graph(int size)
	{
		
		nodes = new HashMap<Integer, ArrayList<Edges>>();
		
		for(int i = 1; i<=size; i++)
		{
			nodes.put(i, new ArrayList<Edges>());
	
			
		}
	}
	
	void addEdge(int source, int destination)
	{
		Edges edges = new Edges(destination);
		
		ArrayList<Edges> arr = nodes.get(source);
		arr.add(edges);
		edges = new Edges(source);
		arr = nodes.get(destination);
		arr.add(edges);
		
	}
	
	void bfs(int start)
	{
		boolean[] visited = new boolean[nodes.size()+1];
		
		Queue<Integer> queue = new LinkedList<Integer>(); 
		ArrayList<Edges> arr;
		Edges edge;
		queue.add(start);
		visited[start] = true;
		while(!queue.isEmpty())
		{
			int s = queue.remove();
			arr = nodes.get(s);
			System.out.print(s+" --> ");
			for (Edges e : arr)
			{
				if(visited[e.destination]==false)
				{
					visited[e.destination] = true;
					queue.add(e.destination);
				}
			}
		}
		
		
	}
	
	void dfs(int start, boolean[] visited)
	{
		visited[start] = true;
		System.out.print(start+" --> ");
		ArrayList<Edges> arr = nodes.get(start);
		for (Edges e : arr)
		{
			if(!visited[e.destination])
				dfs(e.destination, visited);
		}
		
		
	}
	
	
	
	
	void leaves(int start, boolean[] visited, Stack<Integer> stk, int[] child)
	{
		
			int s = stk.peek();
			ArrayList<Edges> arr = nodes.get(s);
			int count = 0;
			
			for(Edges e : arr)
			{
				if (!visited[e.destination])
				{
					visited[e.destination] = true;
					stk.push(e.destination);
					leaves(e.destination, visited, stk, child);
					count += child[e.destination];
				}
			}
			child[s] += count;
			stk.pop();
			System.out.println(s+ " child "+child[s]);
		
	}
	int count(int start, int window)
	{
		int counter = 0;
		if(window>0)
		{
		
		ArrayList<Edges> arrList = nodes.get(start);
		Iterator<Edges> itr = arrList.iterator();
		while(itr.hasNext())
		{
			counter = 1;
			counter += count(itr.next().destination, window-1);
			
		}
		
		
		}
		return counter;
	}
	public void addValue_descended(int T, int V, int K, int d)
	{
		ArrayList<Edges> arrlist = nodes.get(T);
		Iterator<Edges> itr = arrlist.iterator();
		while (itr.hasNext()){
			Edges edges = itr.next();
			long value = edges.getChild();
			edges.putChild(value+V + K*d);
			addValue_descended(edges.destination, V, K, d+1);
		}
	}
}
