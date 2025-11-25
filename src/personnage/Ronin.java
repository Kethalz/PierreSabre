package personnage;

public class Ronin extends Humain {

	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (int) (this.argent*0.1);
		this.argent-= don;
		parler( beneficiaire.getNom() + " prend ces " + don + " sous.");
	}
}
