package main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vehicle, brand, name, licence, type;
		int input, topSpeed, gasCap, wheel;
		
		do
		{
			//Menu Interface
			System.out.println("|=========================|");
			System.out.println("| Aplikasi PT. ChipiChapa |");
			System.out.println("|-------------------------|");
			System.out.println("|                         |");
			System.out.println("|1. Input Data            |");
			System.out.println("|2. View Data             |");
			System.out.println("|3. Exit                  |");
			System.out.println("|                         |");
			System.out.println("|=========================|");
			System.out.print(">>");
			input = sc.nextInt();
			sc.nextLine();
			
			//option
			switch(input)
			{
				//input option
				case 1:
					System.out.println("Entered input");
					do
					{
						System.out.print("Input type [Car / Motorcycle]: ");
						vehicle = sc.nextLine();
					}while (vehicle.equals("Car") && vehicle.equals("Motorcycle"));
					do
					{
						System.out.print("Input brand [>=5]: ");
						brand = sc.nextLine();
					}while (brand.length() < 5);
					
					do
					{
						System.out.print("Input name [>=5]: ");
						name = sc.nextLine();
					}while (name.length() < 5);
					
//					do
//					{
//						System.out.print("Input license: ");
//						license = sc.nextLine();
//					}while license[0] >= 'A' && license[0] <= 'Z';
					
					do
					{
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						topSpeed = sc.nextInt();
						sc.nextLine();
					}while (topSpeed >= 100 && topSpeed <= 250);
					do
					{
						System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
						gasCap = sc.nextInt();
						sc.nextLine();
					}while (gasCap < 30 && gasCap > 60);
					
					if(vehicle.equals("Car"))
					{
						do
						{
							System.out.print("Input wheel [4 <= wheel <= 6]: ");
							wheel = sc.nextInt();
							sc.nextLine();
						}while (wheel < 4 && wheel > 6);
						
						do
						{
							System.out.print("Input type [SUV | Supercar | Minivan]: ");
							type = sc.nextLine();
						}while (type.equals("SUV") && type.equals("Supercar") && type.equals("Minivan"));
					}
					
					break;
					
				//view option
				case 2:
					System.out.println("Entered View");
					break;
				case 3:
					System.out.println("Exited");
					break;
				default:
					System.out.println("Please Retry Again!");
					break;
			}
		}while(input != 3);

	}

}
