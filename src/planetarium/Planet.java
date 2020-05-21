package planetarium;

import java.util.ArrayList;

import java.util.Scanner;

public class Planet extends Celestian_Body {

	public Planet(String name, double mass, double positionX, double positionY) {
		super(name, mass, positionX, positionY);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	ArrayList<String> namePlanet = new ArrayList<>();
	ArrayList<Double> massPlanet = new ArrayList<>();
	ArrayList<Double> position = new ArrayList<>();

	public void add_Planet() {

		int numPlanet = 0;
		System.out.println("\nINSERIRE I PARAMETRI DEL PIANETA\n");

		System.out.println("Quanti pianeti vuoi inserire?");
		numPlanet = sc.nextInt();
		int count = 1;
		for (int i = 0; i < numPlanet; i++) {

			System.out.println("Inserisci il nome del " + count + " pianeta:");
			name = sc.next();
			namePlanet.add(name);

			// INSERIRIMENTO MASSA
			System.out.println("Inserisci la massa del " + count + " pianeta:");
			mass = sc.nextDouble();
			massPlanet.add(mass);

			System.out.println(
					"Inserisci la posizione del " + count + " pianeta {Inserire prima il dato x e poi il dato y}:");
			positionX = sc.nextDouble(); // INS X
			position.add(positionX);

			positionY = sc.nextDouble(); // INS Y
			position.add(positionY);
			count++;
		}

	}

	public double SumMasPlanet() {
		double sum = 0;
		int i;
		for (i = 0; i < massPlanet.size(); i++)
			sum += massPlanet.get(i);
		return sum;
	}

	public void StampaPlanet() {

		for (int i = 0, j = 0; i < namePlanet.size(); i++) {

			System.out.println("Il nome del Pianeta è:  " + namePlanet.get(i));

			System.out.println("La massa è: " + massPlanet.get(i) + " tonnellate");

			System.out.println("Posizionata nel settore " + "(" + position.get(j) + "," + position.get(++j) + ")\n");
			j++;
		}

	}

	public double SumPosX_Planet() {
		double sumX = 0;
		for (int m = 0; m < position.size(); m += 2)
			sumX += position.get(m);
		return sumX;
	}

	public double SumPosY_Planet() {
		double sumY = 0;
		for (int m = 1; m < position.size(); m += 2)
			sumY += position.get(m);
		return sumY;
	}
}
