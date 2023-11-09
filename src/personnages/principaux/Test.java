package personnages.principaux;

public class Test {

	public static void main(String[] args) {
		Samourai s = new Samourai("Nom", 20, "Coca", "Seigneur");
		s.direBonjour();
		s.boire("Pepsi");
		s.direBonjour();
		s.boire();
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour();
	}

}
