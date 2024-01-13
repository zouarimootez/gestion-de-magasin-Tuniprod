/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Entite.Produit;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;

/**
 *
 * @author mootezzouari
 */
public class Magasin {

    private int identifiant;
    private String adresse;

    private final int CAPACITE = 50;

    private Produit[] tabpro = new Produit[CAPACITE];

    private int compP;

    private static int totalp;

    private final int CAPACITE_EMP = 20;
    private Employe[] tabEmp = new Employe[CAPACITE_EMP];
    private int compE;

    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }

    public Magasin() {
    }

    public void ajouter(Produit p) {
        if (compP < CAPACITE) {
            if (!this.chercher(p)) {
                tabpro[compP] = p;
                compP++;
                totalp++;
                System.out.println("comp :" + compP);
            } else {
                System.out.println("Le produit existe");
            }
        } else {
            System.out.println("le magasin est plein");
        }
    }

    public void ajouter(Employe e) {
        if (compE < CAPACITE_EMP) {
            tabEmp[compE] = e;
            compE++;
        } else {

            System.out.println("LE MAGAIN est plein");
        }

    }
    
    
    public void afficherEmploye()
    {
    for(int i=0;i<compE;i++)
    {
        System.out.println(tabEmp[i].toString());
    }
    
    }
    public void afficheSalaire()
    {
    
    for(int i=0;i<compE;i++)
    {
        System.out.println("salaire :"+tabEmp[i].calculSalaire());
    }
    }
    
    public void affichePrime()
    {
    for(int i=0;i<compE;i++)
    {if(tabEmp[i] instanceof Responsable){
        Responsable res=(Responsable)tabEmp[i];
        System.out.println("Prime :"+res.getPrime());
    }else{
                System.out.println("ce n'est pas un responsable");
    }
    }
    
    }
    public static int getTotal() {
        return totalp;
    }

    public boolean chercher(Produit p) {

        for (int i = 0; i < compP; i++) {
            if (Produit.comparer(p, tabpro[i])) //if(p.comparer(tabpro[i]))
            {
                return true;
            }
        }
        return false;
    }

    public void affichePrix() {
        for (int i = 0; i < compP; i++) {
            System.out.println("Prix :" + tabpro[i].getPrix());
        }

    }

    public String toString() {
        String str = "l'ensemble des produits :\n";

        for (int i = 0; i < compP; i++) {
            str += tabpro[i] + "\n";
        }
        return "identifiant :" + identifiant + "adresse :" + adresse + str;
    }

    public Magasin plusProduit(Magasin m) {
        if (this.compP > m.compP) {
            return this;
        }
        return m;
    }

    public static Magasin plusProduit(Magasin m1, Magasin m2) {
        if (m1.compP > m2.compP) {
            return m1;
        }
        return m2;

    }

}
