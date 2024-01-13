/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

import Gestion.Magasin;

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
        //Employe e1 = new Employe();//je suis emplyoe
        Caissier c1 = new Caissier(); //je suis caissier
        System.out.println("C2");
        Caissier c2 = new Caissier(12, 1, "nn", "tunis", 10);
        
        System.out.println("num cais :" + c2.getNumCaisse());
        System.out.println("id :" + c2.getId());
        System.out.println("e2");
//        Employe e2 = new Employe(1, "ben fadhel", "tunis", 10);

        System.out.println("c3");
        Caissier c3 = new Caissier(1, "nnn", 14);
        
        System.out.println(c3);

//        System.out.println(e2);
        c3.afficher();
        
        c3.test();
        c3.test(5);
        
        Responsable res1 = new Responsable(1, "nnn", "ariana", 20, 1000);
        Responsable res2 = new Responsable(1, "nnn", "ariana", 20, 1000);
        Vendeur vend1 = new Vendeur(3, "ons", "tunis", 30, 500);
        
        Magasin m1 = new Magasin(2, "tunis");
        c1.setNbHeure(40);
        m1.ajouter(c1);
        //m1.ajouter(e2);
        m1.ajouter(c2);
        m1.ajouter(vend1);
        m1.ajouter(res1);
        m1.afficherEmploye();
        
        m1.afficheSalaire();
        
        Employe e1 = new Responsable(2, "nn", "tunis", 10, 1000);
        
        if (e1 instanceof Responsable) {
            Responsable res3 = (Responsable) e1;
            
            System.out.println("Prime :" + res3.getPrime());
            
        } else {
            System.out.println("ce n'est pas un responsable");
        }
        if (e1 instanceof Caissier) {
            //Caissier caiss=(Caissier)e1;
            
            System.out.println("num cai" + ((Caissier) e1).getNumCaisse());
        } else {
            System.out.println("ce n'est pas un caissier");
        }
        
        m1.affichePrime();
        
        System.out.println(res1.equals(res2));
        
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        
        System.out.println(str1.equals(str3));
        
        System.out.println(str1.equals(res2));
        
        System.out.println(res2.equals(str1));
        
        Caissier ca=new Caissier();
        ca.setId(1);
        ca.setNom("nom");
        
        Vendeur v1=new Vendeur();
        v1.setId(1);
        v1.setNom("nom");
        
        System.out.println(ca.equals(v1));
        
        System.out.println(ca.getClass());
        System.out.println(v1.getClass());
        
    }
    
}
