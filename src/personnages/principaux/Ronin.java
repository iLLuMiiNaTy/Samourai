package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur = 1;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	
	public void donner(int montant, Commercant c) {
		c.gagnerArgent(montant);
		this.perdreArgent(montant);
	}
	
	
	public void provoquer(Yakuza y) {
		if (this.honneur*2 > y.reputation) {
			this.gagnerArgent(y.getArgent());
			y.perdreDuel();
			this.honneur+=1;
			this.parler("J'ai gagné!");
		}
		y.gagnerDuel();
		this.honneur -= 1;
		this.parler("J'ai perdu...");
	}

	

}
