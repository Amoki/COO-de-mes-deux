package tetepremiere.commande.groupe;

public class ChargeurTelecommande {

	public static void main(String[] args) {

		Telecommande remoteControl = new Telecommande();

		Lampe lampe = new Lampe("Séjour");
		TV tv = new TV("Séjour");
		Stereo stereo = new Stereo("Séjour");
		Jacuzzi jacuzzi = new Jacuzzi();
 
		CommandeAllumerLampe lampeAllumee = new CommandeAllumerLampe(lampe);
		CommandeAllumerStereo stereoAllumee = new CommandeAllumerStereo(stereo);
		CommandeAllumerTV tvAllumee = new CommandeAllumerTV(tv);
		CommandeAllumerJacuzzi jacuzziAllume = new CommandeAllumerJacuzzi(jacuzzi);
		CommandeEteindreLampe lampeEteinte = new CommandeEteindreLampe(lampe);
		CommandeEteindreStereo stereoEteinte = new CommandeEteindreStereo(stereo);
		CommandeEteindreTV tvEteinte = new CommandeEteindreTV(tv);
		CommandeEteindreJacuzzi jacuzziEteint = new CommandeEteindreJacuzzi(jacuzzi);

		Commande[] allumageGroupe = { lampeAllumee, stereoAllumee, tvAllumee, jacuzziAllume};
		Commande[] extinctionGroupe = { lampeEteinte, stereoEteinte, tvEteinte, jacuzziEteint};
  
		MacroCommande macroAllumageGroupe = new MacroCommande(allumageGroupe);
		MacroCommande macroExtinctionGroupe = new MacroCommande(extinctionGroupe);
 
		remoteControl.setCommande(0, macroAllumageGroupe, macroExtinctionGroupe);
  
		System.out.println(remoteControl);
		System.out.println("---Exécution de Macro Marche ---");
		remoteControl.boutonMarchePresse(0);
		System.out.println("--- Exécution de Macro Arret ---");
		remoteControl.boutonArretPresse(0);
	}
}
