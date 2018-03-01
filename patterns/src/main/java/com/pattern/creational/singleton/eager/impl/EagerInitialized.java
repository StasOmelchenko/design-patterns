package com.creational.singleton.eager.impl;

/**
 * The implementation Singleton design pattern using eager initialization
 * 
 * The instance will be created at the time of class loading. This is the easiest method to create a
 * singleton class but it has a drawback that instance is created even though client application
 * might not be using it.
 * 
 * @author Stas Omelchenko
 */

public class EagerInitialized {

	private static final EagerInitialized INSTANCE = new EagerInitialized();

	private EagerInitialized() {}

	public EagerInitialized getInstance() {
		return INSTANCE;
	}
}
