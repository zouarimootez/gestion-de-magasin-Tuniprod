/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

/**
 *
 * @author mootezzouari
 */
public abstract class Employe {

    protected int id;
    protected String nom, adresse;
    protected int nbHeure;

    public Employe(int id, String n, String ad, int nbh) {

        this(id, n);
        adresse = ad;
        nbHeure = nbh;
        System.out.println("je suis le constructeru avec paramètres");
    }

    public Employe(int id, String n) {
        this.id = id;
        nom = n;
        System.out.println("je suis le constructeurs à deux paramèrtres");
    }

    public Employe() {
        System.out.println("je suis Employe");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public String toString() {

        return "id :" + id + "nom :" + nom + "adresse :" + adresse + "nb heure :" + nbHeure;
    }

    public void test() {
        System.out.println("test Employe");
    }

    public abstract float calculSalaire();

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }
        Employe e = (Employe) o;
        if (e.id == id && e.nom.equals(nom)) {
            return true;
        }

        return false;
    }

}
