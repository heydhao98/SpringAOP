package tn.esprit.spring.services;

import tn.esprit.spring.entities.Equipe;
import tn.esprit.spring.entities.Joueur;

public interface IExamenService {
	
	
	void ajouterEquipe(Equipe equipe);
	
	void ajouterEtAffecterJoueurAEquipe(Joueur joueur, int idEquipe);

}
