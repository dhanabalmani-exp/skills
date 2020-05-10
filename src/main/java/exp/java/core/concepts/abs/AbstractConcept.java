/**
 * 
 */
package exp.java.core.concepts.abs;

/**
 * A class which is declared with the abstract keyword is known as an abstract
 * class in Java. it can have abstract and non-abstract methods (method with the
 * body).
 * 
 * <ul>
 * <li>An abstract class must be declared with an abstract keyword.
 * <li>It can have abstract and non-abstract methods.
 * <li>It cannot be instantiated.
 * <li>It can have constructors and static methods also.
 * <li>It can have final methods which will force the subclass not to change the
 * body of the method.
 * </ul>
 * 
 * @author DhanabalM
 *
 */
public abstract class AbstractConcept {

	/**
	 * 
	 */
	public AbstractConcept() {

	}

	// Compile time error: only set a visibility modifier, one of public or
	// protected
	// private abstract void sign();

	// Compile time error: Abstract methods do not specify a body
	/*
	 * public abstract void sign() {
	 * 
	 * }
	 */

	/**
	 * Abstract methods
	 * 
	 * Definition can be found in the extended class
	 */
	public abstract void sign();

	/**
	 * Method to approve
	 * 
	 * Defined as non-abstract methods
	 */
	public void approve() {
		// approve code
		System.out.println("Approved");
	}

	/**
	 * Method to sign and approve
	 * 
	 * Defined as non-abstract methods and cannot be overwrite in the extended
	 * class
	 */
	public final void signAndApprove() {
		sign(); // it will call the extended class method
		approve();
	}

	/**
	 * Method to reset
	 * 
	 * Defined as non-abstract methods with static and cannot be overwrite in
	 * the extended class
	 */
	public final static void reset() {
		// Reset code
		System.out.println("Reset completed");
	}

	public static void main(String arg[]) {

		class AbstractConcept1 extends AbstractConcept {

			/**
			 *  
			 */
			@Override
			public void sign() {
				System.out.println("Signed");

			}
		}

		// Compile time error: Cannot instantiate
		// final AbstractConcept c = new AbstractConcept();

		// Way to access
		final AbstractConcept c = new AbstractConcept1();

		// Call the abstract methods
		c.sign();

		// Call the non-abstract methods
		c.signAndApprove();

		// Can be accessed using Abstract class name as it is defined as static
		AbstractConcept.reset();
	}
}
