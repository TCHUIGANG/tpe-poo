package employe;

public class Salary {

    public static void main(String[] args) {
       
      Personnel  p1 = new Personnel("TCHUIGANG Software");
     // Employe_A_Risque e1 = new Manutentionnaire_Travaillant_Avec_Produit_Dangereux(" TCHOMBA " ," Arman "," 16A006TD " , 0);
      
            System.out.println("Liste des employe de la companie " + p1.getEntreprise());    
       // System.out.println("Ajout d'employés à la collection ");
        p1.ajouterEmploye(new Vendeur(" NANA " ," Abo "," 16A001TD " , 0 ));
        p1.ajouterEmploye(new Representateur(" BABA " ," Souley "," 16A002TD " , 0 ));
        p1.ajouterEmploye(new Technicien(" SIMO " ," Franclin "," 16A003TD " , 0 ));
        p1.ajouterEmploye(new Manutentionnaire(" MBONING " ," Junior "," 16A004TD " , 0 ));
        p1.ajouterEmploye(new Technicien_Travaillant_Avec_Produit_Dangereux(" KAMGA " ," Paul "," 16A005TD " , 0));
        p1.ajouterEmploye(new Manutentionnaire_Travaillant_Avec_Produit_Dangereux(" TCHOMBA " ," Arman "," 16A006TD " , 0 ));
        p1.ajouterEmploye(new Manutentionnaire_Travaillant_Avec_Produit_Dangereux(" TCHUIGANG " ," DERIC "," 16A007TD " , 0 ));
        p1.liste_employe();
        System.out.println("SALAIRE DES EMPLOYES");
        p1.calculersalaires();
        System.out.println("SALAIRE MOYEN");
        p1.Salaire_Moyen();
    }   
}

