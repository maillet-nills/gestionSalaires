package gestionsalaires;

public class Administratif extends Employe{

    public Administratif(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Administratif");
    }

    @Override
    public int getSalaire() {
        return (1900 + anciennete * 100);
    }

    public String getDescription() {
        return super.getDescription();
    }
}
