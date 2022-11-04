package tn.esprit.spring.entities;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Joueur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idJoueur;
	@Column
	private String nom;
	@Column
	private float taille;
	@Column
	private boolean blessure;
	@Column
	private int nbButsEnCarriere;
	@Enumerated(EnumType.STRING)
	private Poste poste;
	@ManyToOne
	@JsonIgnore
	private Equipe equipes;
	public int getIdJoueur() {
		return idJoueur;
	}
	public void setIdJoueur(int idJoueur) {
		this.idJoueur = idJoueur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getTaille() {
		return taille;
	}
	public void setTaille(float taille) {
		this.taille = taille;
	}
	public boolean isBlessure() {
		return blessure;
	}
	public void setBlessure(boolean blessure) {
		this.blessure = blessure;
	}
	public int getNbButsEnCarriere() {
		return nbButsEnCarriere;
	}
	public void setNbButsEnCarriere(int nbButsEnCarriere) {
		this.nbButsEnCarriere = nbButsEnCarriere;
	}
	public Poste getPoste() {
		return poste;
	}
	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	public Equipe getEquipes() {
		return equipes;
	}
	public void setEquipes(Equipe equipes) {
		this.equipes = equipes;
	}

}
