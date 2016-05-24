package kataromjon;

public class StringCalculator {

	// Return Sum of values with param as string separate with comma
	public int add(String values) {
		int somme = 0;		

		// if values is empty return 0
		if (!values.equals("")) {
			String customDelimiter = ",";
			if (values.startsWith("//") && values.length() >= 2) {
				customDelimiter = String.valueOf(values.charAt(2));
				values = values.substring(4);
			}
			
			// Support return carrier
			values = values.replace("\n", customDelimiter);
			
			// else return sum of string parsed to integer
			String[] splitValues = values.split(customDelimiter);
			for (String i : splitValues) {
					somme += Integer.parseInt(i);
			}
		}
		return somme;
	}
}
