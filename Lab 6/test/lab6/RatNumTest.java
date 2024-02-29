/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CS-KU
 */
public class RatNumTest {
      @Test
    public void test1() {
        // 1/2 + 1/3 = 5/6
        RatNum x = new RatNum(1, 2);
        RatNum y = new RatNum(1, 3);
        x.plus(y);
        assertEquals(new RatNum(5, 6), x);

    }

    @Test
    public void test2() {
        // 8/9 + 1/9 = 1
        RatNum x = new RatNum(8, 9);
        RatNum y = new RatNum(1, 9);
        x.plus(y);
        assertEquals(new RatNum(1, 1), x);
    }

    @Test
    public void test3() {
        //  4/17 * 7/3 = 28/51
        RatNum x = new RatNum(4, 17);
        RatNum y = new RatNum(7, 3);
        x.multiply(y);
        assertEquals(new RatNum(28, 51), x);
    }

    @Test
    public void test4() {
        //  7/5 * 20/42 = 2/3
        RatNum x = new RatNum(7, 5);
        RatNum y = new RatNum(20, 42);
        x.multiply(y);
        assertEquals(new RatNum(2, 3), x);
    }

    @Test
    public void test5() {
        // 203/16957 * 9299/5887 = 17/899
        RatNum x = new RatNum(203, 16957);
        RatNum y = new RatNum(9299, 5887);
        x.multiply(y);
        assertEquals(new RatNum(17, 899), x);
    }

    @Test
    public E() {
        // 0/6 = 0
        RatNum x = new RatNum(0, 6);
        assertEquals(new RatNum(0, 1), x);
    }
}