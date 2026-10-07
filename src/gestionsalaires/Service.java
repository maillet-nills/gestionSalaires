package gestionsalaires;

import java.util.ArrayList;

public class Service {
    private ArrayList<Employe> employes;

    public Service() {
        this.employes = new ArrayList<Employe>();
    }

    public void AjouterEmploye(Employe e){
        this.employes.add(e);
    }

    public void ListerEmployes(){
        double total = 0;

        for (Employe e : employes){
            System.out.println("\n### " + e.prenom + " " + e.nom + " ###");
            System.out.println(e.getDescription());
            System.out.println("Salaire : " + e.getSalaire() + "€");
            total += e.getSalaire();
        }

        System.out.println("\nSalaire total : " + total + "€");
    }
}
