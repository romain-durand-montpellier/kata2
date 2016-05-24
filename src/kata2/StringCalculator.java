package kata2;

public class StringCalculator {

	// Return Sum of values with param as string separate with comma
	public int add(String values) {
		int somme = 0;

		// if values is empty return 0
		if (values != "") {
			// else return sum of string parsed to integer 
			String[] intValues = values.split(",");
			for (String i : intValues) {
				somme += Integer.parseInt(i);
			}
		}
		return somme;
	}
}
