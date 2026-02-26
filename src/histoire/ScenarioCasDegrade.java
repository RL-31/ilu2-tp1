package histoire;

import personnages.*;
import villagegaulois.*;

public class ScenarioCasDegrade {
	
	public static void main(String[] args) { 
		Etal etal = new Etal();
		Gaulois idefix = new Gaulois("Idéfix", 10);
		Village village = new Village("Les irréductibles", 10, 3);
		
		// etal.occuperEtal(idefix, "Ménhirs", 2);
		
		/*try {
			etal.acheterProduit(0, idefix);
		}
		catch(IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}*/
		
		try {
			village.afficherVillageois();
		}
		catch(VillageSansChefException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fin du test");
	}
	
}