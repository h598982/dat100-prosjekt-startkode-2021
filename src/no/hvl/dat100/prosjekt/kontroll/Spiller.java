package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.spill.Spillere;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Abstrakt klasse som implementerer alle metodene i kontrakten (interfacet) ISpiller,
 * bortsett fra nesteHandling(). Dette er grunnen til at klassen er abstrakt.
 * For � lage "virkelige" spillere, m� vi arve fra denne klassen og implementere
 * nesteHandling (fra ISpiller).
 * 
 * Klassen har objektvariablene hand (Hand), antalltrekk (heltall) og spiller
 * (Spillere). Den har to konstrukt�rer. Se beskrivelse av disse.
 * 
 */
public abstract class Spiller implements ISpiller {

	// hand for spilleren (samling)
	private KortSamling hand; 
	
	// antall trekk spilleren har gjort fra fra-bunken
	private int antalltrekk; 
	
	// hvem spilleren er (Nord,Syd,Ingen) - se oppramsklassen Spillere
	private Spillere spiller;

	/**
	 * Standard konstrukt�r som oppretter en Spiller med en h�nd uten kort,
	 * antalltrekk som 0 og setter spiller til Spillere.INGEN.
	 */
	public Spiller() {
		
		// TODO - START
		hand = new KortSamling();
		antalltrekk = 0;
		spiller = Spillere.INGEN;
				
		// TODO - END
	}

	/**
	 * Konstrukt�r der vi kan sette hvilken spiller det er (NORD, SYD eller
	 * INGEN).
	 * 
	 * @param spiller
	 *            hvilken spiller det er.
	 */
	public Spiller(Spillere spiller) {
		
		// TODO - START
		hand = new KortSamling();
		antalltrekk = 0;
		this.spiller = spiller;
		
		// TODO - END
	}

	public int getAntallKort() {
		
		// TODO - START
		return hand.getAntalKort();
		
		// TODO - END
	}

	public KortSamling getHand() {
		
		// TODO - START
		return hand;

		// TODO - END
	}
	
	public int getAntallTrekk() {
		
		// TODO - START
		return antalltrekk;

		// TODO - END
	}

	public Spillere hvem() {
		
		// TODO - START
		return spiller;

		// TODO - END
		
	}

	public void setAntallTrekk(int t) {
		
		// TODO - START
		antalltrekk = t;
			
		// TODO - END
	}

	public boolean erFerdig() {
		
		// TODO - START
		
		return hand.erTom();
		
		// TODO - END
		
	}

	public void leggTilKort(Kort kort) {
		
		// TODO - START
		hand.leggTil(kort);
		
		// TODO - END
		
	}

	public void fjernKort(Kort kort) {
		
		// TODO - START
		hand.fjern(kort);
		
		// TODO - END
		
	}

	public void fjernAlleKort() {
		
		// TODO - START
		hand.fjernAlle();
		
		// TODO - END
	}

	public void trekker(Kort kort) {
		
		// TODO - START
		hand.leggTil(kort);
		antalltrekk = antalltrekk +1;
		
		// TODO - END
		
	}
}
