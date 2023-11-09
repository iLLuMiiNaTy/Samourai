package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	
	protected String clan;
	protected int reputation = 0;
	

	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}


	public String getClan() {
		return clan;
	}


	public void setClan(String clan) {
		this.clan = clan;
	}


	public int getReputation() {
		return reputation;
	}


	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	
	public void extorquer(Commercant c) {
		this.argent += c.getArgent();
		c.seFaireExtorquer();
		this.reputation += 1;
		this.parler("Je viens d'extorquer " + c.getNom());
	}
	
	
	public void gagnerDuel() {
		
	}
	
	
	public int perdreDuel() {
		this.argent = 0;
		this.reputation -= 1;
		this.parler("J'ai perdu...");
	}
	
	public void direBonjour() {
		this.reputation += 1;
		this.parler(J'ai gagné !);
	}
	
	
	

}
