package planetarium;

import java.util.Scanner;

public class Planetarium_Main {

/**
 * ciao sono main 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Star sole  =new Star ("sole" , 20 , 0 , 0);
//		
//		double massa = sole.pianeti.get(0).lune.get(0).mass;
		
		
		int scelta = 0;
		int scelta1 = 0;

		String name = null;
		double mass = 0;
		double positionX = 0;
		double positionY = 0;

		Celestian_Body corpo_celeste = new Celestian_Body(name, mass, positionX, positionY);
		Star stella = new Star(name, mass, positionX, positionY);
		Planet pianeta = new Planet(name, mass, positionX, positionY);
		Moon luna = new Moon(name, mass, positionX, positionY);

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("" + "1. Creazione di un Universo\n" + "2. Eliminazione di una Pianeta o Luna\n"
					+ "0. esci dal programma\n");
			scelta = sc.nextInt();

			switch (scelta) {

			case 1: // Inserisci Universo

				corpo_celeste.add_Universe(stella, pianeta, luna);
				corpo_celeste.SumMass(stella, pianeta, luna);
				corpo_celeste.SumPosition(pianeta, luna);
				corpo_celeste.Center_of_Mass(stella, pianeta, luna);
				break;

			case 2:

				do {

					System.out.println("" + "1. Eliminare un Pianeta\n" + "2. Eliminazione una luna \n"
							+ "0. esci dal sottoprogramma\n");
					scelta1 = sc.nextInt();

					switch (scelta1) {

					case 1:
						if (pianeta.namePlanet.size() == 0) {
							System.out.println("\nNON E POSSIBILE QUESTA OPZIONE NON HAI PIANETA DA ELIMINARE\n");
							break;
						}

						corpo_celeste.Delete_Planet(pianeta);

						break;

					case 2:

						if (luna.nameMoon.size() == 0) {
							System.out.println("\nNON E POSSIBILE QUESTA OPZIONE NON HAI LUNA DA ELIMINARE \n");
							break;
						}
						corpo_celeste.Delete_Moon(luna);

						break;
					}
				} while (scelta1 != 0);

				break;
			}
		} while (scelta != 0);

	}

}
