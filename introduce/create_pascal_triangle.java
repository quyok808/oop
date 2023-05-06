package introduce;

public class create_pascal_triangle {
	

	
	public static int[][] createPascalTriangle(int[] diagonalValues){
		int[][] triangle_pascal = new int[5][];
		int n = diagonalValues.length;
		for (int i = 0; i < n; i++) {
			triangle_pascal[i] = new int[i+1];
			triangle_pascal[i][i] = diagonalValues[i];
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				if (i != j) {
					triangle_pascal[i][j] = triangle_pascal[i][j+1] - 1;
				}
			}
		}
		return triangle_pascal;
	}
	
	public static void Triangle(int[][] triangle) {
		for (int i=0; i<triangle.length; i++) {
			for (int j=0; j<triangle[i].length; j++) {
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) {
		int[][] triangle = new int[5][];
		int[] diagonalValues = {1,5,2,0};
		triangle = createPascalTriangle(diagonalValues);
		Triangle(triangle);
	}
}
