/**
 * 
 */
package algodat;

/**
 * @author Dave
 *
 */
public abstract class PairEntity {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName();
	}

	protected abstract String getName();
	
}

class Sock extends PairEntity{

	/* (non-Javadoc)
	 * @see algodat.PairEntity#getName()
	 */
	@Override
	protected String getName() {
		return "a sock";
	}
	
}

class Glove extends PairEntity{

	/* (non-Javadoc)
	 * @see algodat.PairEntity#getName()
	 */
	@Override
	protected String getName() {
		return "a glove";
	}
	
}

class Boot extends PairEntity{

	/* (non-Javadoc)
	 * @see algodat.PairEntity#getName()
	 */
	@Override
	protected String getName() {
		return "a boot";
	}
	
}

class Single{

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "a single";
	}
	
}