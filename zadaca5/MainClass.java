package fikt.oop.inki895.zadaca5;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String> ();
		mnozestvo1.add("Apple");
		mnozestvo1.add("Orange");
		mnozestvo1.add("Strawberry");

		Set<String> mnozestvo2 = new TreeSet<String> ();
		mnozestvo2.add("Strawberry");
		mnozestvo2.add("Pear");
		mnozestvo2.add("Blueberry");

		System.out.println("Presek:");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);
	}
}
