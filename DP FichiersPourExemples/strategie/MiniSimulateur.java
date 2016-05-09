package tetepremiere.strategie;

public class MiniSimulateur {
 
	public static void main(String[] args) {
 
		Colvert	colvert = new Colvert();
		CanardEnPlastique	canardEnPlastique = new CanardEnPlastique();
		Leurre	leurre = new Leurre();
 
		PrototypeCanard	proto = new PrototypeCanard();

		colvert.effectuerCancan();
		canardEnPlastique.effectuerCancan();
		leurre.effectuerCancan();
   
		proto.effectuerVol();	
		proto.setComportementVol(new PropulsionAReaction());
		proto.effectuerVol();
	}
}
