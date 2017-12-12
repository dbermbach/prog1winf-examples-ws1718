/**
 * 
 */
package algodat;

/**
 * @author Dave
 */
public class Pair {

	private PairEntity first;
	private PairEntity second;

	public boolean setValues(PairEntity one, PairEntity two) {
		first = one;
		second = two;
		return true;
	}

	/**
	 * @return the first
	 */
	public PairEntity getFirst() {
		return this.first;
	}

	/**
	 * @return the second
	 */
	public PairEntity getSecond() {
		return this.second;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "A pair comprising " + first + " and " + second+".";
	}

	public static void main(String[] args) {
		Pair p = new Pair();
//		p.setValues(new Single(), new Single());
//		System.out.println(p);
		p.setValues(new Sock(), new Glove());
		System.out.println(p);
		
	}
	
}
