package personnage;

import java.security.PublicKey;

public class Humain {
	private String nom;
	private String boissonFavorite;
	protected int argent;
	static public final int nbConnaissanceMax = 30;
	private Humain[] memoire = new Humain[nbConnaissanceMax];	
	protected int nbConnaissance = 0;

	
	//Constructor
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	protected void parler(String texte) {
		System.out.println("("+getNom()+") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + this.boissonFavorite);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + "! GLOUPS !");
	}
	
	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}

	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix>this.argent) {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'offrir" 
		+ bien + " à " + prix +" sous");
		}else {
			parler("J'ai " + getArgent() + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		if (nbConnaissance==nbConnaissanceMax) {
			for (int i =0; i<nbConnaissance-1; i++) {
				this.memoire[i]=this.memoire[i+1];
			}
			nbConnaissance--;
		}
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
		
		
		
		
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance<nbConnaissanceMax) {
			this.memoire[nbConnaissance]= humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
	}
	
	public void listerConnaissance() {
		StringBuilder listeConnaissanceStr = new StringBuilder();
		for (int i = 0; i<this.nbConnaissance; i++) {
			listeConnaissanceStr.append(this.memoire[i].getNom());
			if (i!=nbConnaissance-1) {
				listeConnaissanceStr.append(", ");
			}
		}
		parler("Je connais beaucoup de monde dont : " + listeConnaissanceStr);
		
	}
}
