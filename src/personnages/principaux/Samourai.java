package personnages.principaux;

public class Samourai extends Ronin{
	
	protected String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur = seigneur;
	}
	
	public void boire(String nouvelleBoisson) {
        // Logique pour permettre au samourai de boire n'importe quelle boisson
        this.boisson = nouvelleBoisson;
    }
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler(" Je suis sous les ordres de " + this.seigneur);
	}

	

}
