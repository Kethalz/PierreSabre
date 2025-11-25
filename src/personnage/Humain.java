package personnage;

import java.security.PublicKey;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
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
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + this.boissonFavorite);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boissonFavorite + "! GLOUPS !");
	}
	
	private void gagnerArgent(int gain) {
		this.argent += gain;
	}

	private void perdreArgent(int perte) {
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
	
}
