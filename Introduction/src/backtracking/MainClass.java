package backtracking;

// Ques -> Shortest Path in a Maze

// jab bhi Integer.MAX_VALUE mei + 1 karenge to wo negative number ban jayega

public class MainClass {

	public static void main(String[] args) {
		
		// index starts from 0 and end to 9 for row
		// index starts from 0 and end to 9 for column
		int a[][] =
			{
					{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
					{ 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
					{ 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
					{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
					{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
					{ 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
					{ 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
					{ 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
			};
		
		
		int result = shortestPath(a, 0, 0, 6, 7);
		
		if(result >= 1000000) {
			System.out.println("No path possible");
		} else {
			System.out.println(result);
		}
	}
	
	static int shortestPath(int a[][], int i, int j, int x, int y) {
		// i and j starting position and x start and y destination
		
		int rows = a.length;
		int cols = a[0].length;
		
		boolean visited[][] = new boolean[rows][cols];
		
		return shortestPath(a, i, j, x, y, visited);
	}
	
	static boolean isValid(int a[][], int i, int j, boolean visited[][]) {
		
		int rows = a.length;
		int cols = a[0].length;
		
		return i >= 0 && j>= 0 && i < rows && j < cols && a[i][j] == 1 && !visited[i][j]; 
	}
	
	static int shortestPath(int a[][], int i, int j, int x, int y, boolean visited[][]) {
		
		if(!isValid(a, i, j, visited)) return 1000000;
		if(i == x && j == y) return 0;
		
		visited[i][j] = true;
		int left = shortestPath(a, i, j-1, x, y, visited) + 1;
		int bottom = shortestPath(a, i+1, j, x, y, visited)+1;
		int right = shortestPath(a, i, j+1, x, y, visited)+1;
		int top = shortestPath(a, i-1, j, x, y, visited)+1;
		
		// This line makes backtracking work
		visited[i][j] = false;
		return Math.min(Math.min(left, bottom), Math.min(right, top));	
	}

}
