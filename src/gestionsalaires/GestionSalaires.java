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
        Developpeur d = new Developpeur("Durand", "Michel", 4);
        Manager m = new Manager("Dupont", "Lucie", 2);
        
        System.out.println(d.getDescription());
        System.out.println(m.getDescription());

        // CLOTURE DU TICKET ID 9 PayMaster[1448]
        Administratif a = new Administratif("Bastide", "Kimy", 3);

        System.out.println(a.getDescription());

    }
    
}
