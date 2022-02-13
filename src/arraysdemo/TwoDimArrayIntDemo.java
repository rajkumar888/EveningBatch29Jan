package arraysdemo;

public class TwoDimArrayIntDemo {

	public static void main(String[] args) {

		int[][] table = { { 10, 50, 65, 32 }, 
				{ 20, 33, 76, 87 }, 
				{ 40, 44, 45, 89 } };

	
		
//		System.out.println(table.length);
//		System.out.println(table[0].length);
		
		for (int row = 0; row < table.length; row++) {

			for (int col = 0; col < table[row].length; col++) {

				System.out.print(table[row][col] + " ");
			}
			System.out.println();

		}
	}

}
