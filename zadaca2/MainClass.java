package fikt.oop.inki895.zadaca2;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		MetodiZaListaNiza obj1=new MetodiZaListaNiza();
		List<String> lista=new ArrayList<String>();
		lista.add("S");
		lista.add("I");
		lista.add("M");
		lista.add("O");
		lista.add("N");
		lista.add("A");
		obj1.konvertiranjeListaVoNiza(lista);
		
		String[] niza= {"S","I","M"};
		obj1.konvertiranjeNizaVoLista(niza);
	}

}
