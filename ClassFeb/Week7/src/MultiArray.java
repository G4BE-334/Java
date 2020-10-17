public class MultiArray {

	public static void main(String[] args) {

		int[][] numbers = create2DArray(3, 5);
		print2DArray(numbers);
		System.out.println("===========================");
	}

	// Demonstrate a two-dimensional array.
	public static int[][] create2DArray(int rowCount, int columnCount) {

		// This is valid Java syntax
		// int twoD[][] = new int[rowCount][columnCount];

		// This is preferred
		int[][] twoD = new int[rowCount][columnCount];
		int totalCount = 0;
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = totalCount;
				totalCount++;
			}
		}

		return twoD;
	}

	public static void print2DArray(int[][] twoD) {
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.print("");
		}
	}

}