package arraysdemo;

public class TrianglePrint {

	public static void main(String[] args) {

		for(int row=1; row<=10; row++){
			
			for(int space=9; space>=row; space--){
				System.out.print(" ");
			}
			
			for(int col=1; col<=row; col++){
				System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
