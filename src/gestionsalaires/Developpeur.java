/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Developpeur extends Employe {

    private String langage;
    private boolean isExpert;

    public Developpeur(String nom, String prenom, int anciennete, String langage, boolean isExpert) {
        String poste = "développeur";
        if (isExpert) poste = "développeur expert";

        super(nom, prenom, anciennete, poste);
        this.langage = langage;
        this.isExpert = isExpert;
    }

    @Override
    public double getSalaire() {
        double prime = switch (langage) {
            case "java" -> 50;
            case "python" -> 70;
            case "php" -> 45;
            default -> 0;
        };

        double salaire = (prime + 1900 + anciennete * 100);

        if (isExpert){
            return salaire + (salaire * 0.1);
        } else {
            return salaire;
        }

    }

    public String getDescription() {
        return super.getDescription() + " C'est un développeur spécialisé en " + langage + ".";
    }
}
