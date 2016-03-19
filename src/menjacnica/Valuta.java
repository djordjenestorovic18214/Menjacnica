package menjacnica;

import java.util.LinkedList;

public class Valuta {
	private String naziv;
	private String kraciNaziv;
	private LinkedList<Kurs> kursevi;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.isEmpty())
			throw new RuntimeException("Greska! Naziv mora biti unet!");
		this.naziv = naziv;
	}
	public String getKraciNaziv() {
		return kraciNaziv;
	}
	public void setKraciNaziv(String kraciNaziv) {
		if(kraciNaziv == null || kraciNaziv.isEmpty())
			throw new RuntimeException("Greska! Kraci naziv mora biti unet!");
		this.kraciNaziv = kraciNaziv;
	}
	public LinkedList<Kurs> getKursevi() {
		return kursevi;
	}
	public void setKursevi(LinkedList<Kurs> kursevi) {
		if(kursevi == null || kursevi.isEmpty())
			throw new RuntimeException("Greska! Kursevi moraju biti uneti!");
		this.kursevi = kursevi;
	}
	
	@Override
	public String toString() {
		return "Naziv valute: " + naziv + " <" + kraciNaziv
				+ "> Kursevi: " + kursevi;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursevi == null) ? 0 : kursevi.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result
				+ ((kraciNaziv == null) ? 0 : kraciNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;

		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (kraciNaziv == null) {
			if (other.kraciNaziv != null)
				return false;
		} else if (!kraciNaziv.equals(other.kraciNaziv))
			return false;
		return true;
	}
}
