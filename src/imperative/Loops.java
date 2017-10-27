/**
 * 
 */
package imperative;

/**
 * @author Dave
 */
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] primes = { 1, 2, 3, 5, 7 };
		System.out.println("mit for:");
		for (int i = 0; i < primes.length; i++) {
			System.out.println(primes[i]);
		}
		System.out.println("mit for each:");
		for (int i : primes) {
			System.out.println(i);
		}
		System.out.println("mit while:");
		int counter = 0;
		while (counter < primes.length) {
			System.out.println(primes[counter++]);
			// counter++;

		}
		System.out.println("mit do while:");
		counter = 0;
		do {
			System.out.println(primes[counter++]);
		} while (counter < primes.length);

		while (true) {
			double d = Math.random();
			System.out.println(d);
			if (d > 0.7)
				break;
		}

		for (int i : primes) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
