package personnages;

public class Humain {
	protected String nom;
	protected int argent;
	protected String boisson;
	

	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	
	public void parler(String texte) {
		System.out.println(this.nom + " - " + texte);
	}
	
	
	public void direBonjour () {
		String texte = "Bonjour ! Je m'appelle " + this.nom + 
				" et j'aime boire du " + this.boisson;
		this.parler(texte);
	}
	
	
	public void boire (String nom, String boisson) {
		String texte =  "Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !";
		this.parler(texte);
	}


	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}


	public String getBoisson() {
		return boisson;
	}
	
	
	
	
	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setArgent(int argent) {
		this.argent = argent;
	}


	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}


	public void gagnerArgent(int montant) {
		this.argent += montant;
	}
	
	public void perdreArgent(int montant) {
		if (this.argent <=0){
			this.parler ("J'ai les poches vides");
		}
		this.argent -= montant;
	}
}