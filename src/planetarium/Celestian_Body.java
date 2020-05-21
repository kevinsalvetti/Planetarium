package planetarium;

import java.util.ArrayList;
import java.util.Scanner;

public class Celestian_Body {

	protected String name;
	protected double mass;
	protected double positionX;
	protected double positionY;

	public Celestian_Body(String name, double mass, double positionX, double positionY) {
		this.name = name;
		this.mass = mass;
		this.positionX = positionX;
		this.positionY = positionY;

	}

	Scanner sc = new Scanner(System.in);

	ArrayList<String> nameCelestian = new ArrayList<>();

	public void add_Universe(Star stella, Planet pianeta, Moon luna) {

		add_Celestian_Body();
		stella.add_Star();
		pianeta.add_Planet();
		luna.add_Moon();

		stella.StampaStar();
		pianeta.StampaPlanet();
		luna.StampaMoon();

	}

	private void add_Celestian_Body() {
		System.out.println("Inserisci il nome dell' universo");
		name = sc.next();
		nameCelestian.add(name);

	}

	public void StampaCelestian() {
		System.out.println(nameCelestian);
	}

	public void SumMass(Star stella, Planet pianeta, Moon luna) {

		System.out.println(
				"La somma delle masse è: " + (stella.SumMasStar() + pianeta.SumMasPlanet() + luna.SumMasMoon()));
	}

	public void SumPosition(Planet pianeta, Moon luna) {
		System.out.println("la somma dele posizioni è : " + (pianeta.SumPosX_Planet() + luna.SumPosX_Moon()) + ","
				+ (pianeta.SumPosY_Planet() + luna.SumPosY_Moon()) + "\n");

	}

	public void Center_of_Mass(Star stella, Planet pianeta, Moon luna) {

		double Center_of_MassX = 0;
		double Center_of_MassY = 0;

		Center_of_MassX = ((stella.SumMasStar() + pianeta.SumMasPlanet() + luna.SumMasMoon())
				/ (pianeta.SumPosX_Planet() + luna.SumPosX_Moon()));
		Center_of_MassY = ((stella.SumMasStar() + pianeta.SumMasPlanet() + luna.SumMasMoon())
				/ (pianeta.SumPosY_Planet() + luna.SumPosY_Moon()));

		System.out.println("Il centro di massa è: " + "(" + Center_of_MassX + " , " + Center_of_MassY + ")" + "\n");
	}

	public void Delete_Planet(Planet pianeta) {

		String planet_delete = null;
		int scelta = 0;

		do {
			if (pianeta.namePlanet.size() != 0) {

				System.out.println("\nNOMI DEI PIANETI CHE SI POSSO ELIMINARE");
				for (int i = 0; i < pianeta.namePlanet.size(); i++) {
					System.out.print(pianeta.namePlanet.get(i) + "\t " + "\n");
				}

				System.out.println("\nInserire il nome del pianeta che vuoi eliminare: ");
				planet_delete = sc.next();

				for (int i = 0; i < pianeta.namePlanet.size(); i++) {
					if (pianeta.namePlanet.get(i).equalsIgnoreCase(planet_delete)) {
						pianeta.namePlanet.remove(planet_delete);

					} else {

						System.out.println("Impossibile trovare il Corpo Celeste\n");

					}

				}

				System.out.println(
						"\nVuoi eliminare un' altro pianeta? \n\n* 0.esci dal programma di eliminazione del pianeta\n\n"
								+ "* Premere un altro numero per continuare");
				scelta = sc.nextInt();
			} else {
				System.out.println("\nNON SONO PRESENTI ALTRI PIANETI\n");
				scelta = 0;
			}
		} while (scelta != 0);

	}

	public void Delete_Moon(Moon luna) {

		Scanner sc = new Scanner(System.in);

		String moon_delete = null;
		int scelta = 0;
		do {
			if (luna.nameMoon.size() != 0) {

				System.out.println("\nNOMI DELLE LUNA CHE SI POSSONO ELIMINARE\n");
				for (int i = 0; i < luna.nameMoon.size(); i++) {
					System.out.print(luna.nameMoon.get(i) + "\t " + "\n");
				}

				System.out.println("\nInserire il nome dell luna che vuoi eliminare: ");
				moon_delete = sc.next();

				for (int i = 0; i < luna.nameMoon.size(); i++) {

					if (luna.nameMoon.get(i).equalsIgnoreCase(moon_delete))
						luna.nameMoon.remove(moon_delete);
					else {

						System.out.println("Impossibile trovare un altra luna\n");

					}

				}

				System.out.println(
						"\n Vuoi eliminare un' altra luna? \n\n *0.esci dal programma di eliminazione della luna\n\n"
								+ "*Premere un altro numero per continuare");
				scelta = sc.nextInt();
			} else {
				System.out.println("\nNON SONO PRESENTI ALTRE LUNE\n");
				scelta = 0;
			}

		} while (scelta != 0);

	}

}
