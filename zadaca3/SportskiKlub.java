package fikt.oop.inki895.zadaca3;

public class SportskiKlub implements Comparable<SportskiKlub> {
	private String ime;
	private String sport;
	private int brojNaClenovi;
	
	public SportskiKlub(String ime, String sport, int brojClenovi) {
		this.ime=ime;
		this.sport=sport;
		this.brojNaClenovi=brojClenovi;
	}
	
	public String getIme() {
		return ime;
	}
	public String getSport() {
		return sport;
	}
	public int getBrojNaClenovi() {
		return brojNaClenovi;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public void setBrojClenovi(int brojNaClenovi) {
		this.brojNaClenovi = brojNaClenovi;
	}
	public int compareTo(SportskiKlub sk) {
		SportskiKlub a = (SportskiKlub) sk;
		if (this.ime.equals(a.ime))
			return 0;
		else
			return this.ime.compareTo(a.ime);
	}
}
