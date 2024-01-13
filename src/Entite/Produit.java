/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.util.Date;

/**
 *
 * @author mootezzouari
 */
public class Produit {

    private int identifiant;
    private String libelle, marque;
    private float prix;
    private Date date_exp;

    public void setPrix(float prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("le prix doit etre positif");
        }
    }

    public float getPrix() {
        return prix;
    }

    public Produit(int id, String libelle,
            String marque, float p) {
        identifiant = id;
        this.marque = marque;
        this.libelle = libelle;
        prix = p;

    }

    public Produit(int identifiant, String libelle,
            String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;

    }

    public Produit(String mar,
            String lib, Date d) {
        marque = mar;
        libelle = lib;
        date_exp = d;
    }

    public Produit() {
    }

    public void afficher() {
        System.out.println("l'identifiant :" + this.identifiant);

        System.out.println("la marque :" + marque);

        System.out.println("le libelle :" + libelle);

        System.out.println("le prix :" + prix);

        System.out.println("La date exp :" + date_exp);

    }

    public String toString() {

        return "identifiant :" + identifiant + " marque :"
                + marque + " libelle :"
                + libelle + " prix :" + prix + " Date exp :" + date_exp;
    }

    public boolean comparer(Produit p) {

        if (identifiant == p.identifiant && p.libelle == this.libelle && p.prix == prix) {
            return true;
        }
        return false;

    }

    public static boolean comparer(Produit p1, Produit p2) {

        if (p1.identifiant == p2.identifiant && p1.libelle == p2.libelle && p1.prix == p2.prix) {
            return true;
        }

        return false;
    }
}
