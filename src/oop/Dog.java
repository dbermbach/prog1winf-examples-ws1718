/**
 * 
 */
package oop;

/**
 * @author Dave
 */
public class Dog {

	/** Groesse des Hundes */
	private double height;
	/** Name des Hundes */
	private String name;

	public Dog() {

	}

	public Dog(double height, String name) {
		this.height = height;
		this.name = name;
	}

	public void printStuff() {
		System.out.println("height=" + this.height + ", name=" + this.name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog d = new Dog();
		d.height = 0.5;
		d.name = "Rex";
		Dog d2 = new Dog(0.4, "Snoop");
		d.printStuff();
		d2.printStuff();
		
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return this.height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
