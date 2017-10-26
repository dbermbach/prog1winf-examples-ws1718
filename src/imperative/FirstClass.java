package imperative;
import Prog1Tools.IOTools;



/**
 * 
 */

/**
 * @author Dave
 */
public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.print("Hello\n\\");
		System.out.print("Hello\"");
		System.out.println("end");
		System.out.println('a');
		System.out.println(1.3e10);
		System.out.println(2.4574383);
		System.out.println(345);
		System.out.println(true);
		System.out.println(false);
		int helloWorld; // byte, short, long
		helloWorld = 123;
		System.out.println(helloWorld);
		boolean meinBoolean = true;
		System.out.println(meinBoolean);
		char c = 'b';
		String s = "hello";
		double d = 3.14; // float
//		int i = IOTools.readInt("Bitte ein int eingeben");
//		System.out.println(i);
		long helloWorldGross = helloWorld;
		helloWorld = (int) helloWorldGross;
		int a = 7, b = 3;
		a = a + b;
		System.out.println(a/3);
		System.out.println(a%3);
		System.out.println("a="+a+"abc"+(a+a));
//		a = (a+b)*(a-b*(a+b+(a/b)));
		System.out.println(-a);
//		a++;
//		a--;
//		++a;
//		--a;
		System.out.println("vor Inc:"+a);
		System.out.println("mit Inc: " + ++a);
		System.out.println("nach Inc: "+ a);
		

		/*
		 * mehrzeiliger Kommentar
		 */

	}

}
