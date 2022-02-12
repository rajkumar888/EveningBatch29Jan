package loopsdemo;

import java.util.Arrays;

public class ForEachDemo {

	public static void main(String[] args) {

		// int[] arr={10,20,30,40,80,15};
		//
		// for(int val:arr){
		// System.out.println(val);
		// }

		String str = "Welcome to Java Learning";
		//
		// for(char ch : str.toCharArray()){
		// System.out.print(ch);
		// }

		// for(int i= str.length()-1 ; i>=0 ; i--){
		// System.out.print(str.charAt(i));
		// }
		//
		
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println(".............");
		
		Arrays.sort(ch);
		
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
