package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yuka = new Yakuza("Yuka Le Noir", "du whisky", 30, "Warsong");
		yuka.direBonjour();
		yuka.extorquer(marco);
	
		Ronin roro = new Ronin("Roro", "du shochu" , 60);
		roro.direBonjour();
		roro.donner(marco);

		
		roro.provoquer(yuka);
		
	}
}
