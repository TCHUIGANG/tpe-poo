package employe;

public class Vendeur extends Employe {
   protected double ca1=0.0;

    public Vendeur(String nom, String prenom, String matricule,double ca1 ) {
        super(nom, prenom, matricule);
        this.ca1 = ca1;
    }
    @Override
    public double calculersalaire(){
       double S;
       double Sb = 110000;
        double Sm = 0.2*ca1 + 100;
       return( S = Sm + Sb);
      
    }
}
