package personnage;

public class Yakuza extends Humain{

	private String clan;
	private int streetcred = 0;
	
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
		parler("J'ai piqué les " + extortion + "sous de " + victime.getNom() +", ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
	}
	
	
}
