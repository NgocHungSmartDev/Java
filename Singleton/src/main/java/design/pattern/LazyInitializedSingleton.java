/**
 * LazyInitializedSingleton.java Sep 4, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 4, 2021
 */
package design.pattern;

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
