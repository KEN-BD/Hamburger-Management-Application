/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hamburgermanagementapllication;

/**
 *
 * @author Lenovo
 */
public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "white", "bacon & sausage", 5.74);
        super.addHamburgerAddition1("Chips", 1.57);
        super.addHamburgerAddition2("Drinks", 1.00);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot Add Additional Item To A Deluxe Burger"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot Add Additional Item To A Deluxe Burger"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot Add Additional Item To A Deluxe Burger"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot Add Additional Item To A Deluxe Burger"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
