package lab_1;


public class TestLab1_4 extends Test {

    public static void main(String[] args) {
        begin();

        checkClose(0, Lab1_4.tax(100000));
        checkClose(5000, Lab1_4.tax(200000));
        checkClose(55000, Lab1_4.tax(600000));
        checkClose(735000, Lab1_4.tax(3000000));
        checkClose(1405000, Lab1_4.tax(5000000));

        getScore();
    }
}
