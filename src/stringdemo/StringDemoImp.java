package stringdemo;

public class StringDemoImp {

	public static void main(String[] args) {
		
		
		
		String str1=new String("Hello");
		
		String str2=new String("Hello");
		
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1==str2);
		
		System.out.println(str1.intern()==str2.intern());
		
		System.out.println(".........");
		
		
		String str5 = "Welcome";
		
		String str6 = "Welcome";
		
		System.out.println(str5.intern()==str6.intern());
		
		char[] ch = {'j','a','v','a','p','o','i','n','t'};
				
		String s = new String(ch);
		
		System.out.println(s);
		
		

	}

}
