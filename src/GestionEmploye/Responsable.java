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
public class Responsable extends Employe{
    
    private float prime;
    
    public Responsable(int id, String n, String ad, int nbh,float prime)
    {
    super(id,n,ad,nbh);
    this.prime=prime;
    
    }
    
    public String toString()
    {
    return "Responsable :"+super.toString()+"prime :"+prime;
    }
    public float calculSalaire()
    {
        float Salaire = 0;
        if (this.nbHeure > 160) {

            int Heure_Supp = this.nbHeure - 160;
            float Prix_Supp = (float) (Heure_Supp * (10 + (10 * 0.2)));
            Salaire = (160 * 10) + Prix_Supp + prime;

        } else {
            Salaire = (this.nbHeure * 10) + prime;
        }

        return Salaire;

    
    }

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }
    
}
