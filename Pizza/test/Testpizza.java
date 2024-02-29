/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import pizza.Pizza;
import static org.junit.Assert.*;

/**
 *
 * @author CS-KU
 */
public class Testpizza {

    Pizza p;

    public Testpizza() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
            p = new Pizza();
    }

    @After
    public void tearDown() {
    }
@Test
    public void test1() {
        assertEquals(100, p.getPrice());
        assertEquals("This pizza has no toppings", p.toString());
    }

    @Test
    public void test2() {
        p.addTopping(Pizza.Topping.Ham);
        assertEquals(110, p.getPrice());
        assertEquals("The topping of this pizza is ham", p.toString());
    }

    @Test
    public void test3() {
        p.addTopping(Pizza.Topping.Ham);
        p.addTopping(Pizza.Topping.Ham);
        assertEquals(110, p.getPrice());
        assertEquals("The topping of this pizza is ham", p.toString());
    }

    @Test
    public void test4() {
        p.addTopping(Pizza.Topping.Ham);
        p.addTopping(Pizza.Topping.Cheese);
        assertEquals(120, p.getPrice());
        assertEquals("The toppings of this pizza are ham, cheese", p.toString());
    }

}