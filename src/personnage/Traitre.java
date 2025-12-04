package personnage;

public class Traitre extends Samourai{
	
	private int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		//Eventually additions needed
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner=commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! "
					+ "Donne-moi " + argentRanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand"+ this.getNom());
		}else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer");
		}
	}
	public void faireLeGentil() {
		
	}
}
