package employe;

abstract class Employe {
private String nom;
private String prenom;
private String matricule;
public Employe(String nom, String prenom, String matricule){
    this.nom = nom;
    this.prenom = prenom; 
}
public abstract double calculersalaire();
public String Nom_prenom(){
    String str = "" + this.nom + " " + this.prenom;
    return str;
}
public String getNom(){
    String str =  "  L'employé " + this.nom + " " + this.prenom + " de la " + this.getClass() ;
    return str;
}
}
