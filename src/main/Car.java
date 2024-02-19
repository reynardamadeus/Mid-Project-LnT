package main;

public class Car extends Vehicle {
	private int enSystem;
	public Car(String vehicle, String brand, String name, String license, int topSpeed, int gasCap, String type, int wheel, int enSystem)
	{
		super(vehicle, brand, name, license, topSpeed, gasCap, type, wheel);
		this.enSystem = enSystem;
	}
	
	@Override
	public int getEntertainmentSystem()
	{
		return enSystem;
	}

	@Override
	int getHelm() 
	{
		return 0;
	}
	
	public void sound()
	{
		System.out.println("Turning on entertainment system...");
	}
	
	public void nitro()
	{
		System.out.println("Boosting!");
	}
	
}

