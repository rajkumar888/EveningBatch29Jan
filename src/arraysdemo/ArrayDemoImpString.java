package arraysdemo;

public class ArrayDemoImpString {

	public static void main(String[] args) {

	String[] strarr = {"Computer", "Mouse", "Keyboard", "Mobile", "Speaker"};
	
		
		for(   String xyz:strarr){
			System.out.println(xyz);
		}
		
		System.out.println(".....");
		
		for(int i=0; i< strarr.length ; i++){
			System.out.println(strarr[i]);
		}
		
		System.out.println(".....");
		
		for(int i=strarr.length - 1; i>=0  ; i--){
			System.out.println(strarr[i]);
		}
	}

}
