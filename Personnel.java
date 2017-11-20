package employe;

import java.util.*;

public class Personnel{
    String Entreprise;
   private ArrayList<Employe> Personnel = new ArrayList<Employe>();
   public Personnel(String nom_entreprise){
  this.Entreprise = nom_entreprise;
   }
   public String getEntreprise(){
       return Entreprise;
   }

public void ajouterEmploye(Employe employeAjouter){
 Personnel.add(employeAjouter);
}
public void liste_employe(){
     for(Employe b:Personnel){
     System.out.println(" "+ b.Nom_prenom());
 }
} 
public void calculersalaires(){
  for(Employe a:Personnel){
      a.calculersalaire();
      System.out.println(" " + a.getNom() + " a un salaire  de : " +a.calculersalaire()+ " FCFA");
  }
}
public double Salaire_Moyen() {
double salairemoyen = 0;
Employe employe;
Iterator iterator = Personnel.iterator();
while (iterator.hasNext() ) {
employe = (Employe) iterator.next();
salairemoyen += employe.calculersalaire()/(Personnel.size());
}
System.out.println("le salaire moyen des employés de la collection est : " +salairemoyen+ " Franc cf");
return salairemoyen;
 }
}