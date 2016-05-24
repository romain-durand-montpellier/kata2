package kata2;

public class StringCalculator {

	// Return Sum of values with param as string separate with comma
	public int add(String values) {
		int somme = 0;

		// if values is empty return 0
		if (values != "") {

			// if values have only one integer in values , simply return the param since there's nothing to add
			if ( !values.contains(",") )
			{
				somme = Integer.parseInt(values);				
			}
			// if more than one...
			else
			{
				String[] intValues = values.split(",");
				
				for (String i : intValues) {
					somme += Integer.parseInt(i);
				}
			}

			
		}
		return somme;

	}

}
