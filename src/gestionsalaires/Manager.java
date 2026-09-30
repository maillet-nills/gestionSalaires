/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionsalaires;

/**
 *
 * @author maxim
 */
public class Manager extends Employe{
    public Manager(String nom, String prenom, int anciennete) {
        super(nom, prenom, anciennete, "Manager");
    }

    @Override
    public double getSalaire() {
        return (2200+anciennete*110);
    }

    public String getDescription() {
        return super.getDescription();
    }

}
