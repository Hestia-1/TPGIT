package nintendo.test;

import java.io.Console;

import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Console c1 = new Console("PS5");
		Console c2 = new Console("Switch");
		Console c3 = new Console("DS3D");
		

		Jeu j1 = new jeu("Mario Bros",c3);
		Jeu j2 = new jeu("Spider Man",c1);
		Jeu j3 = new jeu("Tomadochi life",c3);
		Jeu j4 = new jeu("Zelda : Breath of the wild ",c2);
		Jeu j5 = new jeu("Call of Duty Black OPS 35",c1);
		
	}

}
