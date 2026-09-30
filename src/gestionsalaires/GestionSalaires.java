/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class GestionSalaires {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tests applicatifs

        // CLOTURE DU TICKET ID 8 PayMaster[1447]
        // CLOTURE DU TICKET ID 10 PayMaster[1448]
        // CLOTURE DU TICKET ID 11 PayMaster[1449]
        Developpeur d = new Developpeur("Durand", "Michel", 4, "python");
        Manager m = new Manager("Dupont", "Lucie", 2);
        DeveloppeurExpert de = new DeveloppeurExpert("Baron", "Emma", 1, "php");
        
        System.out.println(d.getDescription());
        System.out.println(m.getDescription());
        System.out.println(de.getDescription());

        // CLOTURE DU TICKET ID 9 PayMaster[1448]
        Administratif a = new Administratif("Bastide", "Kimy", 3);

        System.out.println(a.getDescription());

    }
    
}
