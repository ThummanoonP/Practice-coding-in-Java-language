package lab_1;

public class TestLab1_1 extends Test {

    public static void main(String[] args) {
        begin();

        check(  0, Lab1_01.getMinute( 0,  0));
        check( 50, Lab1_01.getMinute( 0, 50));
        check( 60, Lab1_01.getMinute( 1,  0));
        check(170, Lab1_01.getMinute( 2, 50));
        check(721, Lab1_01.getMinute(12,  1));

        getScore();
    }
}
