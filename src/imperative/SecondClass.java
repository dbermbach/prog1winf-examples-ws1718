/**
 * 
 */
package imperative;

/**
 * @author Dave
 */
public class SecondClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 5;
		double d = 3;
		System.out.println(i / d);
		double b = i / d;

		System.out.println(d <= i); // <= >= < > == !=
		System.out.println(i != 5);

		System.out.println(true && false); // and
		System.out.println(true || false); // or
		System.out.println(!true);

		d = Math.sqrt(9);
		System.out.println(d);
		System.out.println(Math.pow(2, 3));

		if (d <= 1)
			System.out.println(d);
		if (d <= 2) {
			System.out.println("hey");
			System.out.println(d);
		} else {
			System.out.println("else");
		}

		int var = 0;

		if (var < 0) {
			System.out.println("kleiner 0");
		} else if (var > 0) {
			System.out.println("größer 0");
		} else {
			System.out.println("0");
		}

		switch (var) {
		case 0:
			System.out.println("ist 0");
			break;
		case 2:
			System.out.println("ist 2");
			break;
		case 37:
			System.out.println("ist 37");
			break;
		default:
			System.out.println("ist was Anderes");
		}

		switch (var) {
		case 1:
		case 2: if(true){}else{}
		case 3:
			System.out.println("ist Primzahl kleiner 5"); break;
		default:
			System.out.println("ist was Anderes");
		}

	}

}
