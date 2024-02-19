package main;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String vehicle, brand, name, license, type;
		int input, viewOption, topSpeed, gasCap, wheel, enSystem, helm;
		ArrayList<Vehicle> data = new ArrayList<>();
		
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
				//input data
				case 1:
					//input Vehicle Properties
					//Input & check type of vehicle
					do
					{
						System.out.print("Input type [Car / Motorcycle]: ");
						vehicle = sc.nextLine();
					}while (!(vehicle.equals("Car") || vehicle.equals("Motorcycle")));
					//Input & check brand
					do
					{
						System.out.print("Input brand [>=5]: ");
						brand = sc.nextLine();
					}while (brand.length() < 5);
					
					//Input & check name
					do
					{
						System.out.print("Input name [>=5]: ");
						name = sc.nextLine();
					}while (name.length() < 5);
				
					//input and check license details
					boolean check_1 = false;
					boolean check_2 = false;
					boolean check_3 = false;
					
					do
					{
						System.out.print("Input license: ");
						license = sc.nextLine();
						
						//split the license string into 3
						String[] licenseElements = license.split(" ");
						
						String first = licenseElements[0];
						String second = licenseElements[1];
						String third = licenseElements[2];
						
						//check first string of license
						if(first.charAt(0) >= 'A' && first.charAt(0) <= 'Z')
						{
							check_1 = true;
						}
						
						//check second string of license
						int secondSize = second.length();
						if(secondSize >= 1 && secondSize <= 4)
						{
							for(int i = 0; i < secondSize; i++)
							{
								if(!(second.charAt(i) >= '0' && second.charAt(i) <= '9'))
								{
									check_2 = false;
									break;
								}else
								{
									check_2 = true;
								}
							}
						}
						
						////check third string of license
						int thirdSize = third.length();
						if(thirdSize >= 1 && thirdSize <= 3)
						{
							for(int i = 0; i < thirdSize; i++)
							{
								if(!(third.charAt(i) >= 'A' && third.charAt(i) <= 'Z'))
								{
									check_3 = false;
									break;
								}else
								{
									check_3 = true;
								}
							}
						}
					
					}while (!(check_1 && check_2 && check_3));
					
					//Input & check top speed
					do
					{
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						topSpeed = sc.nextInt();
						sc.nextLine();
					}while (!(topSpeed >= 100 && topSpeed <= 250));
					
					//Input & check gas capacity
					do
					{
						System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
						gasCap = sc.nextInt();
						sc.nextLine();
					}while (!(gasCap >= 30 && gasCap <= 60));
					
					//for car vehicle type
					if(vehicle.equals("Car"))
					{
						//Input & check wheels
						do
						{
							System.out.print("Input wheel [4 <= wheel <= 6]: ");
							wheel = sc.nextInt();
							sc.nextLine();
						}while (!(wheel >= 4 && wheel <= 6));
						
						//Input & check car type
						do
						{
							System.out.print("Input type [SUV | Supercar | Minivan]: ");
							type = sc.nextLine();
						}while (!(type.equals("SUV") || type.equals("Supercar") || type.equals("Minivan")));
						
						//Input & check entertainment system
						do
						{
							System.out.print("Input entertainment system amount [>=1]: ");
							enSystem = sc.nextInt();
							sc.nextLine();
						}while (enSystem < 1);
						
						//put details into array list
						Car car = new Car(vehicle, brand, name, license, topSpeed, gasCap, type, wheel, enSystem);
						data.add(car);
					}else
					{
						//Input & check wheel
						do
						{
							System.out.print("Input wheel [2 <= wheel <= 3]: ");
							wheel = sc.nextInt();
							sc.nextLine();
						}while (!(wheel >= 2 && wheel <= 3));
						
						//Input & check motorcycle type
						do
						{
							System.out.print("Input type [Automatic | Manual]: ");
							type = sc.nextLine();
						}while (!(type.equals("Automatic") || type.equals("Manual")));
						
						//Input & check helm
						do
						{
							System.out.print("Input helm amount [>=1]: ");
							helm = sc.nextInt();
							sc.nextLine();
						}while (helm < 1);
						
						//put details into array list
						Motorcycle MC = new Motorcycle(vehicle, brand, name, license, topSpeed, gasCap, type, wheel, helm);
						data.add(MC);
					}
					break;
					
				//view option
				case 2:
					System.out.println("|----|-----------|-------------------|");
					System.out.println("|No  |Type       |Name               |");
					System.out.println("|----|-----------|-------------------|");
					int i = 0;
					for(Vehicle list : data)
					{
						i++;
						System.out.printf("|%-4d|%-11s|%-19s|%n", i, list.getVehicle(), list.getName());
					}
					System.out.println("|----|-----------|-------------------|");
					
					do 
					{
						System.out.print("Pick a vehicle number to test drive [enter '0' to exit]: ");
						viewOption = sc.nextInt();
						sc.nextLine();
						if(viewOption != 0)
						{
							System.out.println("Brand: " + data.get(viewOption-1).getBrand());
							System.out.println("Name: " + data.get(viewOption-1).getName());
							System.out.println("License Plate: " + data.get(viewOption-1).getLicense());
							System.out.println("Type: " + data.get(viewOption-1).getType());
							System.out.println("Gas Capacity: " + data.get(viewOption-1).getGasCap());
							System.out.println("Top Speed: " + data.get(viewOption-1).getTopSpeed());
							System.out.println("Wheel(s): " + data.get(viewOption-1).getWheel());
							if(data.get(viewOption-1).getVehicle().equals("Car"))
							{
								System.out.println("Entertainment System: " + data.get(viewOption-1).getEntertainmentSystem());
								Car outputCar = (Car) data.get(viewOption-1);
								outputCar.sound();
								if(data.get(viewOption-1).getType().equals("Supercar"))
								{
									outputCar.nitro();
								}
							}else
							{
								System.out.println("Helm: " + data.get(viewOption-1).getHelm());
								Motorcycle outputMotor = (Motorcycle) data.get(viewOption-1);
								outputMotor.action(outputMotor.getName());
								System.out.print("Helm Price: ");
								int price = sc.nextInt();
								sc.nextLine();
								outputMotor.pricePerHelm(outputMotor.getHelm(), price);
							}
						}
						
					}while(viewOption != 0);
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
