package main;

public class Motorcycle  extends Vehicle{
	
	private int helm;
	public Motorcycle(String vehicle, String brand, String name, String license, int topSpeed, int gasCap, String type, int wheel, int helm)
	{
		super(vehicle, brand, name, license, topSpeed, gasCap, type, wheel);
		this.helm = helm;
	}
	
	
	public void action(String name)
	{
		System.out.println(name + " is standing!");
	}
	
	public void pricePerHelm(int helm, int price)
	{
		int helmPrice = helm * price;
		System.out.println("Price: " + helmPrice );
	}

	@Override
	int getEntertainmentSystem()
	{
		return 0;
	}
	@Override
	public int getHelm()
	{
		return helm;
	}

}
