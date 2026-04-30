package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boutique boutique = new Boutique("Le Canard Enchanté", new Adresse(3, "Avenue", "Cuac"));
		Client client1 = new Client("Donald","Canard");
		Client client2 = new Client("Jack","Sparrow");
	}

}
