package com.scm.javatraining;

/**
 * <h2>ThreadSample Class</h2>
 * <p>
 * Process for Displaying ThreadSample
 * </p>
 * 
 * @author NweNi
 *
 */
public class ThreadSample extends Thread {
	/**
	 * <h2>limit</h2>
	 * <p>
	 * limit int transient
	 * </p>
	 */
	public transient static int limit = 55; // will not persist
	/**
	 * <h2>defaultlimit</h2>
	 * <p>
	 * defaultlimit int
	 * </p>
	 */
	public static int defaultlimit = 77; // will persist

	/**
	 * <h2>showDetails</h2>
	 * <p>
	 * synchronized method for showDetails();
	 * </p>
	 *
	 * @return void
	 */
	public synchronized void showDetails() {
		System.out.println(
				"In addition to vitamin C and folate, oranges provide smaller amounts of other nutrients, including calcium, potassium, and thiamine (vitamin B1). Oranges are a good source of fiber"
						+ " and a rich source of vitamin C and folate, among many other beneficial nutrients.\n");
	}

	/**
	 * <h2>main</h2>
	 * <p>
	 * 
	 * </p>
	 *
	 * @param args String[]
	 * @return void
	 */
	public static void main(String[] args) {
		// creating thread object
		ThreadSample fruit = new ThreadSample();
		fruit.start();
		ThreadSample orange = new ThreadSample();
		System.out.println("Orange is a fruit.\n");
		orange.showDetails();
		// printing transient modifier
		System.out.println(limit);
		System.out.println(defaultlimit);
	}

	/**
	 * <h2>run</h2>
	 * <p>
	 * run method for thread class
	 * </p>
	 * 
	 */
	public void run() {
		System.out.println("A fruit develops from the flower of a plant, "
				+ "while the other parts of the plant are categorized as vegetables. Fruits contain seeds.");
	}
}
