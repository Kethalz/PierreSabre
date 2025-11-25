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
	
	public void provoquer(Yakuza adversaire) {
		int force = 2*this.honneur;
		if (force>=adversaire.getStreetCred()) {
			this.argent+=adversaire.getArgent();
			adversaire.perdre();
			parler("Je t'ai eu petit Yakuza");
		}else {
			this.honneur--;
			this.argent=0;
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(this.argent);
		}
	}
}
