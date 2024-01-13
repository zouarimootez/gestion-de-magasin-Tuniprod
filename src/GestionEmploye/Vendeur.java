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
public class Vendeur extends Employe{
    
    private int tauxdeVente;
    
    
    public Vendeur(int id, String n, String ad, int nbh,int tauxVente)
            {
            super(id,n,ad,nbh);
            this.tauxdeVente=tauxVente;
            }

    public Vendeur() {
    }
    
    
    public String toString()
    {
    return "Vendeur :"+super.toString()+"taux de Vente :"+tauxdeVente;
    }
    
    public float calculSalaire()
    {
                    return (450*tauxdeVente)/100;
    }

}
