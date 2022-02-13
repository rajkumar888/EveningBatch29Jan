package arraysdemo;

import java.util.Arrays;

public class SumAndAverageofArray {

	public static void main(String[] args) {

		double[] arr={111.0, 20.0, 12.0, 13.0, 14.0, 18.0,11.5};
		
		double sum=0.0;
		
		
		for(int i=0; i<arr.length ; i++){
			sum=sum+arr[i];
		}
		
		System.out.println("Value of sum "+sum);
		System.out.println("Total no of values "+arr.length);
		System.out.println("Value of Average "+(sum/arr.length));
		
		Arrays.sort(arr);
		
		for( double a:arr){
			System.out.print(a+" ");
		}
	}

}
