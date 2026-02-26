package histoire;

import personnages.*;
import villagegaulois.*;

public class ScenarioCasDegrade {
	
	public static void main(String[] args) { 
		Etal etal = new Etal();
		Gaulois idefix = new Gaulois("Idéfix", 300000);
		
		etal.occuperEtal(idefix, "Ménhirs", 300000);
		
		etal.acheterProduit(100, null);
		
		System.out.println("Fin du test");
	}
	
}