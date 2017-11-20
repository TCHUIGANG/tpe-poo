package employe;

public class Technicien_Travaillant_Avec_Produit_Dangereux extends Technicien implements Employe_A_Risque{
static double pm = 25000;

    public Technicien_Travaillant_Avec_Produit_Dangereux(String nom, String prenom, String matricule, double nu) {
        super(nom, prenom, matricule, nu);
    }

    
@Override
  public double calculersalaire(){
     double s = super.calculersalaire() + pm;
      return s;
  }
}
