package main;

public abstract class Vehicle 
{
	private String vehicle;
	private String brand;
	private String name;
	private String license;
	private int topSpeed;
	private int gasCap;
	private String type;
	private int wheel;

	public Vehicle(String vehicle, String brand, String name, String license, int topSpeed, int gasCap, String type,
			int wheel) {
		this.vehicle = vehicle;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.type = type;
		this.wheel = wheel;
	}
	public String getVehicle() {
		return vehicle;
	}

	
	public String getBrand() {
		return brand;
	}
	
	public String getName() {
		return name;
	}

	
	public String getLicense() {
		return license;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}

	
	public int getGasCap() {
		return gasCap;
	}
	
	public String getType() {
		return type;
	}

	
	public int getWheel() {
		return wheel;
	}
	
	abstract int getHelm();
	abstract int getEntertainmentSystem();
	
}
