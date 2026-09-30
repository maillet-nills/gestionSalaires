package gestionsalaires;

public class DeveloppeurExpert extends Developpeur{

    public DeveloppeurExpert(String nom, String prenom, int anciennete, String langage) {
        super(nom, prenom, anciennete, langage);
        super.poste = "développeur expert";
    }

    @Override
    public double getSalaire() {
        return super.getSalaire() * 1.1;
    }
}
