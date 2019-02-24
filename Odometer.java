import java.util.Scanner;

public class Odometer //an instrument for measuring the distance traveled by a vehicle.
{
	private int fuel;
	private int miles = 0;
	private int gallons = 0;
	public int odometerTotal = 0;

	Scanner input = new Scanner(System.in);

	public void resetOdometer()
	{
		odometerTotal = 0;
	}

	public void setFuelEfficiency() //miles per gallon
	{
		System.out.println("What would you like to set the fuel efficiency to?:");
		fuel = input.nextInt();
	}

	public void setMilesDriven()
	{
		System.out.println("What is the number of miles driven for this trip?:");
		miles = input.nextInt();

		odometerTotal += miles;
		gallons = (miles*2);
	}

	public int getGallons() // 1 mile per 2 gallons
	{
		return gallons;
		
	}
}