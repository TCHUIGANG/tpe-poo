package employe;

public class Technicien extends Employe{
     private double nu;

    public Technicien(String nom, String prenom, String matricule,double nu) {
        super(nom, prenom, matricule);
        this.nu = nu;
    }

     @Override
    public double calculersalaire(){
         double S;
       double Sb = 110000;
        double Sm = nu*5;
        S = Sb + Sm;
        return S;
    }
}
