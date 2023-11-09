package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	protected int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	
	public void donner(int montant, Humain h) {
		h.gagnerArgent(montant);
		this.perdreArgent(montant);
		this.parler("Je viens de donner " + montant + " pièces à " + h.getNom());
	}
	
	
	public void provoquer(Yakuza y) {
		if (this.honneur*2 > y.reputation) {
			this.gagnerArgent(y.getArgent());
			y.perdreDuel();
			this.honneur+=1;
			this.parler("J'ai gagné!");
		}
		else {
			y.gagnerDuel();
			this.honneur -= 1;
			this.parler("J'ai perdu...");
		}
		
	}

	

}
