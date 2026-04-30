package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boutique boutique = new Boutique("Le Canard Enchanté", new Adresse(3, "Avenue", "Cuac"));
		Client client1 = new Client("Donald","Canard");
		Client client2 = new Client("Jack","Sparrow");

		
		
		
		Console c1 = new Console("PS5");
		Console c2 = new Console("Switch");
		Console c3 = new Console("DS3D");
		

		Jeu j1 = new Jeu("Super Luigi Bros",c3);
		Jeu j2 = new Jeu("Qwacker Man",c1);
		Jeu j3 = new Jeu("Tomadochi life",c3);
		Jeu j4 = new Jeu("Zelda : Breath of the child ",c2);
		Jeu j5 = new Jeu("Call of Duty Black OPS 35",c1);
		
	}

}
