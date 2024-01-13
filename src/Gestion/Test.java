/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Entite.Produit;

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
        
        Magasin m1=new Magasin(1, "tunis");
        
        Magasin m2=new Magasin();
        
        Produit p1=new Produit(1,"delice","lait");
       // p1.setPrix(500);
        Produit p2=new Produit(2,"delice","yaourt");
        
        
        Produit p3=new Produit(2,"delice","yaourt");
        p2.setPrix(1000);
        p3.setPrix(1000);
        m1.ajouter(p1); //tot =1
        
        m1.ajouter(p2); //totl=2
        
        
        m1.ajouter(p2); //tot=3
        
        System.out.println("le nombre total des produits est :"+Magasin.getTotal());
        m2.ajouter(p2); //totla=4
        
        m1.affichePrix();
        
        
        System.out.println(m1);
        System.out.println(m2);
        
        System.out.println("le nombre total des produits est :"+Magasin.getTotal());
    
   
    
    System.out.println("le nombre total des produits est :"+Magasin.getTotal());
    
        System.out.println(p1.comparer(p2));
        
        System.out.println("comparet"+p2.comparer(p3));
        System.out.println(p1.equals(p2));
        
        System.out.println("equals"+p2.equals(p3));
        
        
        
        System.out.println(Produit.comparer(p1, p3));
        
        
        System.out.println(m1.chercher(p2));
        
        System.out.println(m2.chercher(p1));
        
        System.out.println("Plus PR");
        
        System.out.println(m1.plusProduit(m2));
        Magasin m3=new Magasin();
        
        System.out.println(Magasin.plusProduit(m1, m2));
    }
    
}
