package fikt.oop.inki895.zadaca1;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> lekovi=new ArrayList<String>();
		lekovi.add("Kafetin");
		lekovi.add("Vitamin C");
		lekovi.add("Analgin");
		lekovi.add("Pracetamol");
		if(lekovi.get(lekovi.size()-1).equals("Pracetamol"))
			System.out.println("Лекот помага за намалување на телесната температура!");
		else
			System.out.println("Намената на лекот е непозната!");
	}
}
