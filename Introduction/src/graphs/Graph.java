package graphs;

import java.util.*;
public class Graph {
	
	private LinkedList<Integer> adj[];
	
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	public int bfs(int source, int destination) {
		boolean visited[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(source);
		parent[source] = -1;
		visited[source] = true;
		
		while(!q.isEmpty()) {
			int current = q.poll();
			if(current == destination) break;
			
			for(int neighbour : adj[current]) {
				if(!visited[neighbour]) {
					visited[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = current;
				}
			}
		}
		
		int current = destination;
		int distance = 0;
		
		while(parent[current] != -1) {
			System.out.print(current + " -> ");
			current = parent[current];
			distance++;
		}
		System.out.print(source);
		
		return distance;
	}
	
	// implemented by recursion
	private boolean dfsRecursive(int source, int destination, boolean visited[]) {
		if(source == destination) return true;
		
		for(int neighbour : adj[source]) {
			if(!visited[neighbour]) {
				visited[neighbour] = true;
				boolean isConnected = dfsRecursive(neighbour, destination, visited);  // recursion
				if(isConnected) return true;
			}
		}
		return false;
	}
	
	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		
		return dfsRecursive(source, destination, vis);
	}
	
	// implemented by stack
	public boolean dfsStack(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		
		while(!stack.isEmpty()) {
			int cur = stack.pop();
			
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}	
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of Vertices and Edges: ");
		int v = in.nextInt();
		int e = in.nextInt();
		
		Graph graph = new Graph(v);
		System.out.println("Enter the " + e + " edges: ");
		for(int i=0; i<e; i++) {
			int source = in.nextInt();
			int destination = in.nextInt();
			
			graph.addEdge(source, destination);
		}
		
		// for bfs
		// System.out.print("Enter source and destination: ");
		// int source = in.nextInt();
		// int destination = in.nextInt();
		// int distance = graph.bfs(source, destination);
		// System.out.println(" And Minimum distance is " + distance);
		
		// for dfs
		System.out.print("Enter source and destination: ");
		int source = in.nextInt();
		int destination = in.nextInt();
		// System.out.println("possible " + graph.dfs(source, destination));
		System.out.println("possible " + graph.dfsStack(source, destination));
		
		in.close();
	}
}
