package kata2;

public class StringCalculator {

	public int add(String values) {
		int somme = 0;

		if (values == "") {
			somme = 0;
		}
		//Simply return the param since there's nothing to add
		else {
			somme = Integer.parseInt(values);
		}
		return somme;

	}

}
