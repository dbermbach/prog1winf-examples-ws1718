/**
 * 
 */
package algodat;

/**
 * @author Dave
 */
public class GenericPair<T extends PairEntity> {

	private T first;
	private T second;

	public boolean setValues(T one, T two) {
		first = one;
		second = two;
		return true;
	}

	/**
	 * @return the first
	 */
	public T getFirst() {
		return this.first;
	}

	/**
	 * @return the second
	 */
	public T getSecond() {
		return this.second;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "A pair comprising " + first + " and " + second;
	}

	public static void main(String[] args) {
		// GenericPair<String> pair = new GenericPair<>();
		GenericPair<Sock> socks = new GenericPair<Sock>();
		socks.setValues(new Sock(), new Sock());
		// pair.setValues("string", "String");
		System.out.println(socks);
		// System.out.println(pair);
		printPair(socks);
		GenericPair<Glove> gloves = new GenericPair<Glove>();
		gloves.setValues(new Glove(), new Glove());
		printPair(gloves);
	}

	public static void printPair(GenericPair<? extends PairEntity> p) {
		System.out.println(p);
	}

}
