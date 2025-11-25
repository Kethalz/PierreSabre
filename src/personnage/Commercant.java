package personnage;

public class Commercant extends Humain{

	public Commercant(String nom, int argent) {
		super(nom, "du thé" , argent);
	}

	public int seFaireExtorquer() {
		int extortion = this.argent;
		this.argent=0;
		System.out.println("J'ai tout perdu! Le monde est trop injuste...");
		return extortion;
	}
	public void recevoir(int argent) {
		this.argent += argent;
		System.out.println(argent + " sous ! Je te remercie généreux donateur!");
	}
}
