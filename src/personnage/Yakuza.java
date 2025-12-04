package personnage;

public class Yakuza extends Humain{

	private String clan;
	private int streetcred = 0;
	
	public int getStreetCred() {
		return streetcred;
	}

	public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
		super(nom, boissonFavorite, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int extortion = victime.seFaireExtorquer();
		this.argent += extortion;
		this.streetcred ++;
		parler("J'ai piqué les " + extortion + " sous de " + victime.getNom() +", ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int perte = this.argent;
		this.argent = 0;
		parler("J'ai perdu mon duel et mes " + perte + "sous, snif ... J'ai déshonoré le clan de " + this.clan);
		return perte;
	}
	
	public void gagner(int gain) {
		this.argent+=gain;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan " + this.clan
		+  "? Je l'ai dépouillé de ses " + gain + " sous");
	}
}
