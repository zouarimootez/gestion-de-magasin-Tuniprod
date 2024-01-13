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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Produit p1 = new Produit();

        Produit p2 = new Produit(1024, "tomate", "sicam");

        Produit p3 = new Produit(2510, "yaourt", "vitalait", 0);

        Produit p4 = new Produit(3250, "Lait", "Delice", 1.2f);

        System.out.println("Afficher");
        p4.afficher();

        System.out.println(p4.toString());
        System.out.println(p4);
        System.out.println(p3);

        Date d1 = new Date();

        p4.afficher();
        System.out.println(p4);
        
        
        
        
    }

}
