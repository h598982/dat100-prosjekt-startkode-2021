package no.hvl.dat100.prosjekt.modell;

import java.util.Arrays;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene. Når
 * programmet er ferdig settes denne til 13, men under utvikling / testing kan
 * det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		
		antall = 0;
		samling = new Kort[MAKS_KORT];
		
	}

	public Kort[] getSamling() {
		
		return samling;
		
	}
	
	public int getAntalKort() {
		
		return antall;
		
	}
	
	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {
		
		/*boolean tom = false;
		if(antall == 0) {
			tom = true;
		}
		return tom;*/
		
		return (antall == 0);
		
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort
	 *            er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {
		
		if(antall < samling.length) {
			samling[antall] = kort;
			antall++;
		}
	}
	
	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil være sortert
	 * slik at de normalt må stokkes før bruk.
	 */
	public void leggTilAlle() {
		
		for(Kortfarge f : Kortfarge.values()) {
			for(int i = 1; i <= Regler.MAKS_KORT_FARGE; i++) {
				leggTil(new Kort(f,i)); 
			}
		}
		
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {
		
		for(int i = 0;  i < samling.length; i++) {
			samling[i] = null;
		}
		antall = 0;
		
	}
	
	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort seSiste() {
		
		if(antall == 0) {
			return null;
		} else {
			Kort siste = samling[antall-1];
			return siste;
		}

	}

	/**
	 * Tek ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres
	 *         null.
	 */
	public Kort taSiste() {
		
		Kort siste = seSiste();
				
		if(siste == null) {
			return null; 
		} else {
			samling[antall-1] = null;
			antall--;
			return siste;
		}
		
	}
	
	/**
	 * Undersøker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {
		
		boolean finnes = false;
		
		for(int i = 0; i < antall; i++) {
			if(samling[i].equals(kort)) {
				finnes = true;
			}
		}
		return finnes;
	}

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga,
	 * skjer ingenting med samilingen
	 * 
	 * @param kort
	 *            kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *            ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */
			 
	public boolean fjern(Kort kort) {
		
		boolean fjernet = false;
		
		for(int i = 0; i < antall; i++) {
			if(samling[i] == kort) {
				samling[i] = null;
				samling[i] = samling[i+1];
				antall--;
				fjernet = true;
			} else {
				fjernet = false;
			}
		}
		return fjernet;
	}
	
	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {
		
		Kort[] alleKort = new Kort[antall];
		
		for(int i = 0; i < antall; i++) {
			alleKort[i] = samling[i];
		}
		
		return alleKort;
		
	
	}
	
}
