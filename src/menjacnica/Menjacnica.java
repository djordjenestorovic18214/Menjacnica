package menjacnica;

import java.util.GregorianCalendar;
import interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	public void dodajKurs(Valuta valuta, Kurs kurs) {
		valuta.getKursevi().add(0, kurs);
	}

	public void obrisiKurs(Valuta valuta, GregorianCalendar datum) {
		if(valuta.getKursevi() == null) {
			System.out.println("Lista sa kursevima je prazna!");
		return;
		}
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum() == datum) {
				valuta.getKursevi().remove(valuta.getKursevi().get(i));
				break;
			}
		}
	}

	public Kurs pronadjiKurs(Valuta valuta, GregorianCalendar datum) {
		if(valuta.getKursevi() == null) {
			System.out.println("Lista sa kursevima je prazna!");
		return null;
		}
		for (int i = 0; i < valuta.getKursevi().size(); i++) {
			if(valuta.getKursevi().get(i).getDatum() == datum) {
				return valuta.getKursevi().get(i);
			}
		}
		return null;
	}

}
