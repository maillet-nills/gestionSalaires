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

    public Developpeur(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, "Developpeur");
        this.langage = langage;
    }

    @Override
    public int getSalaire() {
        int prime = switch (langage) {
            case "java" -> 50;
            case "python" -> 70;
            case "php" -> 45;
            default -> 0;
        };

        return (prime + 1900 + anciennete * 100);
    }

    public String getDescription() {
        return super.getDescription() + " C'est un développeur spécialisé en " + langage + ".";
    }
}
