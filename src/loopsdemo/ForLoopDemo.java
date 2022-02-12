package loopsdemo;

import java.util.Date;

public class ForLoopDemo {

	public static void main(String[] args) throws InterruptedException {

		
		
//		for( int i=1 ; i<=10 ; i++){
//			System.out.println(new Date()+"......."+i);
//			Thread.sleep(1000);
//		}
		
		
//		int i=1;
//		while(i<=10 ){
//			System.out.println(new Date()+"......."+(i++));
//			Thread.sleep(1000);
//		}
//		
		int i=1;
		do{
			System.out.println(new Date()+"......."+(i++));
			Thread.sleep(1000);
		}while(i<=10);
		
	}

}
