package employe;

public class Manutentionnaire_Travaillant_Avec_Produit_Dangereux extends Manutentionnaire implements Employe_A_Risque {
   static double pm = 25000 ;

    public Manutentionnaire_Travaillant_Avec_Produit_Dangereux(String nom, String prenom, String matricule, double nh) {
        super(nom, prenom, matricule, nh);
    }


    @Override
  public double calculersalaire(){
     double s = super.calculersalaire() + pm;
      return s;
  }
}
