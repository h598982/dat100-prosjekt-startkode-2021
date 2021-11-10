package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		Kort temp;
		
		for(int i = 0; i < samling.getSamling().length; i++) {
			for(int j = i; j > 0; j--) {
				temp = samling.getSamling()[j];
				if(temp == null) {
					continue;
				}
				if(temp.compareTo(samling.getSamling()[j-1]) < 0) {
					samling.getSamling()[j] = samling.getSamling()[j-1];
					samling.getSamling()[j-1] = temp;
				}
			}
		}
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		samling = new KortSamling();
		Kort[] Stokket = samling.getSamling();
		
		Random rand = new Random();
		
		for(int i = 0; i < Stokket.length; i++) {
			int indexToSwap = rand.nextInt(Stokket.length);
			Kort temp = Stokket[indexToSwap];
			Stokket[indexToSwap] = Stokket[i];
			Stokket[i] = temp;
		}
	}
}
