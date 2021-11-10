package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles p�. 
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til � representere 
 * kortene som er i de to bunker p� border. 
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;
	
	/**
	 * Metoden oppretter to bunker, til- og fra-bunken
	 * Alle kortene legges til fra-bunken. 
	 */
	public Bord() {
		
		bunkeFra = new KortSamling();
		bunkeTil = new KortSamling();
		
		bunkeFra.leggTilAlle();
	}
	
	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public KortSamling getBunkeTil() {
		
		return bunkeTil;
		
	}

	/**
	 * Gir peker/referanse til fra-bunken.
	 * 
	 * @return referanse/peker til fra-bunken.
	 */
	public KortSamling getBunkeFra() {
		
		return bunkeFra;
		
	}
	
	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {
		
		// TODO - START
		/*boolean tom = false;
		if(bunkeTil.erTom() == true) {
			tom = true;
		}
		
		return tom;*/
		return bunkeTil.erTom();
	
		// TODO - END
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {
		
		// TODO - START
		return bunkeFra.erTom();

		// TODO - END
		
	}
	
	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {
		
		// TODO - START
		return bunkeFra.getAntalKort();
		

		// TODO - END
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {
		
		// TODO - START
		return bunkeTil.getAntalKort();

		// TODO - END
	}
	
	/**
	 * Tar �verste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke p�).
	 */
	public void vendOversteFraBunke() {
		
		// TODO - START
		Kort overst = bunkeFra.taSiste();
		
		bunkeTil.leggTil(overst);
		
		// TODO - END
		
	}
		
	/**
	 * Tar �verste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */
	
	public Kort taOversteFraBunke() {
		
		// TODO - START
		//Kort taOverst = bunkeFra.taSiste();
		//bunkeFra.fjern(taOverst);
		
		//return taOverst;
		return bunkeFra.taSiste();
		

		// TODO - END
	}
	
	/**
	 * Metode som leser �verste kortet i til-bunken. Kortet vil fremdeles v�re
	 * �verst i til-bunken etter at metoden er utf�rt.
	 * 
	 * @return peker/referanse til �verste kortet i til-bunken.
	 */
	public Kort seOversteBunkeTil() {
		
		// TODO - START
		//Kort seOverste = bunkeTil.seSiste();
		//return seOverste;
		
		return bunkeTil.seSiste();
		// TODO - END
	}
	
	/**
	 * N�r fra-bunken blir tom, tar man vare p� kortet p� toppen av til-bunken.
	 * Deretter legges alle den andre kortene i til-bunken over i fra-bunken.
	 * Denne stokkes og kortet som man har tatt vare p� legges tilbake i
	 * til-bunken. Det vil n� v�re det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		// TODO - START
		Kort overstFraTil = bunkeTil.seSiste();
		
		for(int i = 0; i < bunkeTil.getAntalKort(); i++) {
			Kort[] resterendeKort = bunkeTil.getAllekort();
			bunkeFra.leggTil(resterendeKort[i]);
		}
		
		bunkeTil.fjernAlle();
		bunkeTil.leggTil(overstFraTil);
		
		// TODO - END
	}
		
	/**
	 * Metode som legger et kort i til-bunken. 
	 * 
	 * @param k
	 * 			kort som skal legges ned. 
	 * 	
	 */
	public void leggNedBunkeTil(Kort k) {
		
		// TODO - START
		bunkeTil.leggTil(k);
				
		// TODO - END
				
	}
}
