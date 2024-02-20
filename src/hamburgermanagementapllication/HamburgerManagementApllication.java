/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hamburgermanagementapllication;

/**
 *
 * @author Lenovo
 */
public class HamburgerManagementApllication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Hamburger hamburger = new Hamburger("basic","white","sausage",3.57);
    hamburger.addHamburgerAddition1("tomato", 0.57);
    hamburger.addHamburgerAddition2("lautice", 0.43);
        System.out.println("The Hamburger price is: "+hamburger.itimizeHamburger());
    
    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 0.57);
    healthyBurger.addHealthAddition1("lautice", 0.44);
    healthyBurger.addHealthAddition2("tomato", 0.33);
        System.out.println("The HealthyBurger price is: "+healthyBurger.itimizeHamburger());
        
    DeluxeBurger deluxeBurger = new DeluxeBurger();
    deluxeBurger.addHamburgerAddition3("soda", 1.04);
        System.out.println("The DeluxeBurger Price Is: "+deluxeBurger.itimizeHamburger());
        
        double totalHamburgerPrice = hamburger.itimizeHamburger();
        double totalHealthyBurgerPrice = healthyBurger.itimizeHamburger();
        double totalDeluxeBurgerPrice = deluxeBurger.itimizeHamburger();
        
        double total = totalHamburgerPrice + totalHealthyBurgerPrice + totalDeluxeBurgerPrice;
        
        System.out.println("The total price for all hamburgers is: " + total);
    }
    
}
