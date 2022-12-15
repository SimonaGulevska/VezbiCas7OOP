package fikt.oop.inki895.zadaca3;
import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<SportskiKlub> sportskiKlubovi = new ArrayList<SportskiKlub>();
		sportskiKlubovi.add(new SportskiKlub("Morocco", "Fudbal", 12));
		sportskiKlubovi.add(new SportskiKlub("Croatia", "Fudbal", 15));
		sportskiKlubovi.add(new SportskiKlub("Argentina", "Fudbal", 11));
		
		Collections.sort(sportskiKlubovi);
		for (SportskiKlub a : sportskiKlubovi) {
			System.out.println("Ime na sportskiot klub: "+a.getIme());
			System.out.println("Sport: "+a.getSport());
			System.out.println("Broj na clenovi vo klubot: "+a.getBrojNaClenovi());
		}
	}
}
