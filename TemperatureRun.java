public class TemperatureRun
{
	public static void main(String[] args)
	{
		Temperature temp1, temp2, temp3, temp4, temp5, temp6;

		temp1 = new Temperature(); // no argument -- default
		temp2 = new Temperature(32.0f, 'F'); // parameter test

		temp3 = new Temperature(-40.0f); //Testing parameters Degree & Scale
		temp3 = new Temperature('C');

		temp4 = new Temperature();
		temp5 = new Temperature();
		temp6 = new Temperature();

		temp4.setDegrees(-40.0f);
		temp4.setScale('F');

		temp5.setDegreesScale(100.0f, 'C');
		temp6.setDegreesScale(210.0f, 'F');

		temp3.getTempFahrenheit();
		temp3.getTempCelsius();

		System.out.println(temp1.toString());
		System.out.println(temp2.toString());
		System.out.println(temp3.toString());
		System.out.println(temp4.toString());
		System.out.println(temp5.toString());
		System.out.println(temp6.toString());
		System.out.println();


		System.out.println("Is " + temp1 + " equal " + temp2 + "?");
		if ( temp1.equals(temp2) )
			System.out.println("Equals\n");
		else 
			System.out.println("Does not equal\n");

		System.out.println("Is " + temp3 + " equal " + temp4 + "?");
		if ( temp3.equals(temp4) )
			System.out.println("Equals\n");
		else 
			System.out.println("Does not equal\n");

		System.out.println("Is " + temp5 + " equal " + temp6 + "?");
		if ( temp5.equals(temp6) )
			System.out.println("Equals\n");
		else 
			System.out.println("Does not equal\n");

	}
}