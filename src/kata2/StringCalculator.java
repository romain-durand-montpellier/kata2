package kata2;

public class StringCalculator {

	public int add(String values) {
		int somme = 0;

		// if values is empty return 0
		if (values != "") {

			// if values have only one interger un values , simply return the param since there's nothing to add
			if ( !values.contains(",") )
			{
				somme = Integer.parseInt(values);				
			}
			// if more than one...
			else
			{
				//TODO:				
			}

			
		}
		return somme;

	}

}
