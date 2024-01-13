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
public class Caissier extends Employe {

    private int numCaisse;

//    public Caissier()
//    {
//    super(0,null,null,0);
//    }
//    
    public Caissier(int num, int id, String n, String ad, int nbh) {
        super(id, n, ad, nbh);

        this.numCaisse = num;
    }

    public Caissier() {
        super();
        System.out.println("je suis caissier");
    }

    public Caissier(int id, String n, int num) {
        super(id, n);
        this.numCaisse = num;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    
    public void afficher()
    {
        System.out.println("toStting :"+toString());
        System.out.println("super :"+super.toString());
    }
    public String toString()
    {
    return "Caissier "+super.toString()+"num caisse :"+numCaisse;
    }
    
    
    public void test(int a)
    {
        System.out.println("val :"+a);
        super.test();
    }
    
    public float calculSalaire()
    {
    
    float Salaire=0;
        if (this.nbHeure > 180){
            
         int Heure_Supp = this.nbHeure - 180 ;
         float Prix_Supp= (float) (Heure_Supp *(5+(5*0.15)));
         Salaire= (180 * 5 )+Prix_Supp ;

        } else
        Salaire= (this.nbHeure * 5 );
       
return Salaire;

    }

}
