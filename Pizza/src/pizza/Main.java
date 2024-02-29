/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza;

/**
 *
 * @author CS-KU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pizza p = new Pizza();
        p.addTopping(Pizza.Topping.Ham);
        p.addTopping(Pizza.Topping.Cheese);
        p.addTopping(Pizza.Topping.Pepperoni);
        System.out.println(p.getPrice());
        System.out.println(p.toString());
    }

}
