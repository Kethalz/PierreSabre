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
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*this.honneur;
		if (force>=adversaire.getStreetCred()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			this.argent+=adversaire.getArgent();
			parler("Je t'ai eu petit Yakuza");
			adversaire.perdre();
			}else {
			this.honneur--;
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(this.argent);
			this.argent=0;
		}
	}
}
