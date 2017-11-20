package employe;

public class Manutentionnaire extends Employe{
      private double nh;

    public Manutentionnaire(String nom, String prenom, String matricule, double nh) {
        super(nom, prenom, matricule);
        this.nh = nh;
    }

      @Override
    public double calculersalaire(){
         double S;
       double Sb = 110000;
        double Sm = nh*65;
        S = Sb + Sm;
        return S;
    }
}
