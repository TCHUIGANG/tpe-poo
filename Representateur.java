package employe;

public class Representateur extends Employe {
    private  double ca2;

    public Representateur(String nom, String prenom, String matricule,double ca2 ) {
        super(nom, prenom, matricule);
        this.ca2 = ca2;
    }

    @Override
    public double calculersalaire(){
         double S;
       double Sb = 110000;
        double Sm = 0.2*ca2 + 200;
        S = Sb + Sm;
        return S;
    }
}
