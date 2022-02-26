package com.scm.javatraining;

public class CustomWrapper {
	private int i;

	/**
	 * <h2> Constructor for CustomWrapper </h2>
	 * <p>
	 * Constructor for CustomWrapper
	 * </p>
	 */
	CustomWrapper() {
	}

	/**
	 * <h2> Constructor for CustomWrapper </h2>
	 * <p>
	 * Constructor for CustomWrapper with one parameter
	 * </p>
	 * @param int i
	 */
	CustomWrapper(int i) {
		this.i = i;
	}

	/**
	 * <h2> getValue</h2>
	 * <p>
	 * getter method for int i
	 * </p>
	 *
	 * @return
	 * @return int
	 */
	public int getValue() {
		return i;
	}

	/**
	 * <h2> setValue</h2>
	 * <p>
	 * setter method for int i
	 * </p>
	 *
	 * @param i
	 * @return void
	 */
	public void setValue(int i) {
		this.i = i;
	}

	/**
	 * <h2> toString </h2>
	 * <p>
	 * override method for toString()
	 * </p>
	 * 
	 * @return string value
	 */
	@Override
	public String toString() {
		return Integer.toString(i);
	}
}
