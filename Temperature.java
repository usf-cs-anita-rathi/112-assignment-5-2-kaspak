public class Temperature
{
	/* Two instance variables:
			a temperature value (a floating-point number) and 
			a character for the scale, either C for Celsius or F for Fahrenheit.
	*/

	private float degrees;
	private char scale;

	/*The class should have four constructor methods:
	One for EACH instance variable
	(assume zero degrees if no value is specified and Celsius if no scale is specified)*/

	public Temperature(float temperature, char scaleInput) // one with two parameters for the two instance variables
	{
		degrees = temperature;
		scale = scaleInput;
	}
	
	public Temperature(float temperature) // 1 -- Constructor
	{
		degrees = temperature;
	}

	public Temperature(char scaleInput) // 2 -- Constructor
	{
		scale = scaleInput;
	}

	public Temperature() // 1.2 -- Constructor
	{
		degrees = 0;
		scale = 'C';
	}

	public float getTempCelsius()
	{
		degrees = (degrees - 32)*(5/9);
		return degrees;
	}

	public float getTempFahrenheit()
	{
		degrees = ( degrees*(9/5) ) + 32;
		return degrees;
	}

	/*(2) three mutator methods: 
	one to set the value, one to set the scale (F or C), and one to set both*/

	public void setDegrees(float temperature) // 1 -- mutator
	{
		degrees = temperature;
	}

	public void setScale(char scaleInput) // 2 -- mutator
	{
		scale = scaleInput;
	}

	public void setDegreesScale(float temperature, char scaleInput)
	{
		degrees = temperature;
		scale = scaleInput;
	}

	public boolean equals(Temperature otherTemp)
	{
		System.out.println(otherTemp);
		if (scale != otherTemp.scale)
		{
			otherTemp.scale = scale; // makes sure otherTemp scale is the same

			if (otherTemp.scale == 'C')
			{
				otherTemp.degrees = (otherTemp.degrees - 32)*(5/9);
			}

			else if (otherTemp.scale == 'F')
			{
				otherTemp.degrees = ( otherTemp.degrees*(9/5) ) + 32;
			}
		}

		return ( (degrees == otherTemp.degrees) &&
				 (scale == otherTemp.scale) );
	}


	public boolean greaterThan(Temperature otherTemp)
	{
		if (scale != otherTemp.scale)
		{
			otherTemp.scale = scale; // makes sure otherTemp scale is the same

			if (otherTemp.scale == 'C')
			{
				degrees = (degrees - 32)*(5/9);
			}

			else if (otherTemp.scale == 'F')
			{
				degrees = ( degrees*(9/5) ) + 32;
			}
		}

		else 
		{
			otherTemp.scale = scale;
		}

		return (degrees > otherTemp.degrees);
	}

	public boolean lessThan(Temperature otherTemp)
	{
		if (scale != otherTemp.scale)
		{
			otherTemp.scale = scale; // makes sure otherTemp scale is the same

			if (otherTemp.scale == 'C')
			{
				degrees = (degrees - 32)*(5/9);
			}

			else if (otherTemp.scale == 'F')
			{
				degrees = ( degrees*(9/5) ) + 32;
			}
		}

		else 
		{
			otherTemp.scale = scale;
		}

		return (degrees < otherTemp.degrees);
	}

	public String toString()
	{
		return (degrees + " " + scale);
	}
}