package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai{
	
	private int traitrise=0;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}
	
	public void ranconner(int montant, Commercant c) {
		
	}
	
	public void extorquer(Commercant c) {
		if (traitrise < 3) {
			this.argent += c.getArgent();
			c.seFaireExtorquer();
			this.traitrise += 1;
			this.parler("Je viens d'extorquer " + c.getNom());
		}
		else {
			this.parler("Je ne peux plus extorquer sous peine d'être découvert");
		}
		
	}
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler(" Je suis un traître de niveau " + this.traitrise + 
				" sous les ordres de " + this.seigneur);
	}
	
	public void faireLeGentil(Humain h, int argent) {
		this.donner(argent, h);
	}
	
	
}
