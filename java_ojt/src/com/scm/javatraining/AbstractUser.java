package com.scm.javatraining;

/**
 * <h2> AbstractUser Class</h2>
 * <p>
 * Process for Displaying AbstractUser
 * </p>
 * 
 * @author NweNi
 *
 */
public abstract class AbstractUser implements User{
	//Overloading in interfaces and abstract classes.
	abstract void edit(String str);
	
	abstract void delete(String str);
	
}
