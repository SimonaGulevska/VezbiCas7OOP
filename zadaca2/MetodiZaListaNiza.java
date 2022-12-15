package fikt.oop.inki895.zadaca2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 

public class MetodiZaListaNiza {
	public void konvertiranjeListaVoNiza(List<String> lista) {
		String[] niza=new String [lista.size()];
		lista.toArray(niza);
		System.out.println("Listata pretvorena vo niza:");
		for(String s:niza) {
			System.out.println(s);
		}
	}
	public void konvertiranjeNizaVoLista(String[] niza) {
		List<String> lista=new ArrayList<String>();
		lista=Arrays.asList(niza);
		System.out.println("Nizata pretvorena vo lista:");
		for(String s:lista) {
			System.out.println(s);
		}
	}

}
