package menjacnica;

import java.util.GregorianCalendar;

import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public void dodajKurs(Valuta valuta, Kurs kurs) {
		valuta.getKursevi().add(0, kurs);
	}

	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
	}

	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		return null;
	}

}
