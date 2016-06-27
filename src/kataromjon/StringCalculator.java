package kataromjon;

public class StringCalculator {

	// Return Sum of values with param as string separate with comma
	public int add(String values) {
		int somme = 0;

		// if values is empty return 0
		if (values != "") {
			// else return sum of string parsed to integer
			String[] splitValues = values.split(",");
			for (String i : splitValues) {

				// if we have a return carrier...
				if (i.contains("\n")) {
					String[] splitCarriers = i.split("\n");
					for (String c : splitCarriers) {
						somme += Integer.parseInt(c);
					}
				} else {
					somme += Integer.parseInt(i);
				}
			}
		}
		return somme;
	}
}
