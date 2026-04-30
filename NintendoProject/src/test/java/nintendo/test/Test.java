package nintendo.test;

import java.time.LocalDate;

import nintendo.model.Achat;
import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boutique boutique = new Boutique("Le Canard Enchanté", new Adresse(3, "Avenue", "Cuac"));
		Client client1 = new Client("Donald", "Canard");
		Client client2 = new Client("Jack", "Sparrow");

		Console c1 = new Salon("PS5", 600, LocalDate.parse("2020-11-12"));
		Console c2 = new Hybride("Switch", 250, LocalDate.parse("2017-12-01"));
		Console c3 = new Portable("3DS", 160, LocalDate.parse("2011-02-26"));



		Jeu j1 = new Jeu("Super Luigi Bros", c3, boutique);
		Jeu j2 = new Jeu("Qwacker Man", c1, boutique);
		Jeu j3 = new Jeu("Tomadochi life", c3, boutique);
		Jeu j4 = new Jeu("Zelda : Breath of the child ", c2, boutique);
		Jeu j5 = new Jeu("Call of Duty Black OPS 35", c1, boutique);

		Achat a1 = new Achat(j1, LocalDate.parse("2025-02-14"), 29.99);
		Achat a2 = new Achat(j2, LocalDate.parse("2025-05-20"), 59.99);
		Achat a3 = new Achat(j4, LocalDate.parse("2025-10-01"), 49.99);
		Achat a4 = new Achat(j5, LocalDate.parse("2025-12-04"), 69.99);
		
        client1.ajouterAchat(a1);
        client1.ajouterAchat(a2);

        client2.ajouterAchat(a3);
        client2.ajouterAchat(a4);

	}

}
