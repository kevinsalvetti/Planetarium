package planetarium;

import java.util.Scanner;

public class Star extends Celestian_Body {

	public Star(String name, double mass, double positionX, double positionY) {
		super(name, mass, positionX, positionY);
		// TODO Auto-generated constructor stub
	}
	//correzione  ArrayList<Planet> pianeti = new  pianeti 
	Scanner sc = new Scanner(System.in);

	public void add_Star() {
		System.out.println("\nINSERIRE I PARAMETRI DELLA STELLA\n");

		System.out.println("Inserisci il nome della stella:");
		name = sc.next();

		System.out.println("Inserisci la massa della stella:");
		mass = sc.nextDouble();

	}

	public double SumMasStar() {
		return mass;
	}

	public void StampaStar() {

		System.out.println("STAMPA DEI DATI DELL' ULTIMO UNIVERSO INSERITO");

		System.out.println("Il nome della stella è: " + name);

		System.out.println("La massa è di " + mass + " tonnellate");

		System.out.println("Posizionata nel settore (0,0)\n");

	}

}