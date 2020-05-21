package planetarium;

import java.util.ArrayList;
import java.util.Scanner;

public class Moon extends Celestian_Body {

	public Moon(String name, double mass, double positionX, double positionY) {
		super(name, mass, positionX, positionY);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	ArrayList<String> nameMoon = new ArrayList<>();
	ArrayList<Double> massMoon = new ArrayList<>();
	ArrayList<Double> position = new ArrayList<>();

	int numMoon = 0;

	public void add_Moon() {
		System.out.println("\nINSERIRE I PARAMETRI DELLA LUNA\n");
		System.out.println("Quante lune vuoi inserire?:");

		numMoon = sc.nextInt();
		int count = 1;
		for (int i = 0; i < numMoon; i++) {

			System.out.println("Inserisci il nome della " + count + " luna:");
			name = sc.next();
			nameMoon.add(name);

			// INSERIMENTO MASSA

			System.out.println("Inserisci  la massa della " + count + " luna:");
			mass = sc.nextDouble();
			massMoon.add(mass);

			System.out.println(
					"Inserisci la posizione della " + count + " luna {Inserire prima il dato x e poi il dato y}:");
			positionX = sc.nextDouble(); // INS X
			positionY = sc.nextDouble(); // INS Y

			position.add(positionX);
			position.add(positionY);
			count++;

		}

	}

	public double SumMasMoon() {
		double sum = 0;
		for (int i = 0; i < massMoon.size(); i++)
			sum += massMoon.get(i);
		return sum;
	}

	public void StampaMoon() {

		for (int i = 0, j = 0; i < nameMoon.size(); i++) {

			System.out.println("Il nome della Luna è: " + nameMoon.get(i));

			System.out.println("La massa è: " + massMoon.get(i) + " tonnellate");

			System.out.println("Posizionata nel settore  " + "(" + position.get(j) + "," + position.get(++j) + ")\n");
			j++;

		}

	}

	public double SumPosX_Moon() {
		double sumX = 0;
		for (int m = 0; m < position.size(); m += 2)
			sumX += position.get(m);
		return sumX;
	}

	public double SumPosY_Moon() {
		double sumY = 0;
		for (int m = 1; m < position.size(); m += 2)
			sumY += position.get(m);
		return sumY;
	}
}
