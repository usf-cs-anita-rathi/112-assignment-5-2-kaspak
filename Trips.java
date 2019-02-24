public class Trips
{
	public static void main(String[] args)
	{
		Odometer trip1 = new Odometer(),
				 trip2 = new Odometer(),
				 trip3 = new Odometer(),
				 trip4 = new Odometer();

		System.out.println("Trip 01: ");
		trip1.setFuelEfficiency();
		trip1.setMilesDriven();
		System.out.println("Gallons: " + trip1.getGallons());
		System.out.println("Odometer: " + trip1.odometerTotal);
		trip1.resetOdometer();

		System.out.println();

		System.out.println("Trip 02: ");
		trip2.setFuelEfficiency();
		trip2.setMilesDriven();
		System.out.println("Gallons: " + trip2.getGallons());
		trip2.resetOdometer();
		System.out.println("Odometer Reset!");
		System.out.println("Odometer: " + trip2.odometerTotal);

		System.out.println();

		System.out.println("Trip 03: ");
		trip3.setFuelEfficiency();
		trip3.setMilesDriven();
		System.out.println("Gallons: " + trip3.getGallons());
		System.out.println("Odometer: " + trip3.odometerTotal);
		trip3.resetOdometer();

		System.out.println();

		System.out.println("Trip 04: ");
		trip4.setFuelEfficiency();
		trip4.setMilesDriven();
		System.out.println("Gallons: " + trip4.getGallons());
		System.out.println("Odometer: " + trip4.odometerTotal);
		trip4.resetOdometer();
	}
}