package fr.bitcoinerie.web.domain;

import java.util.Date;
import java.util.List;

public class MyUser {
    private int id_user;
    private String nom;
    private String prenom;
    private Float reputation;
    private Float montant_compte;
    private String login;
    private Date date_inscription;
    private String email;
    private String userStatus;
    private List<MyTransaction> liste_dépenses;
    private List<MyTransaction> liste_recettes;

    public MyUser(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Float getReputation() {
        return reputation;
    }

    public void setReputation(Float reputation) {
        this.reputation = reputation;
    }

    public Float getMontant_compte() {
        return montant_compte;
    }

    public void setMontant_compte(Float montant_compte) {
        this.montant_compte = montant_compte;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MyTransaction> getListe_dépenses() {
        return liste_dépenses;
    }

    public void setListe_dépenses(List<MyTransaction> liste_dépenses) {
        this.liste_dépenses = liste_dépenses;
    }

    public List<MyTransaction> getListe_recettes() {
        return liste_recettes;
    }

    public void setListe_recettes(List<MyTransaction> liste_recettes) {
        this.liste_recettes = liste_recettes;
    }
}
