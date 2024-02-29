package lab_1;

public class TestLab1_2 extends Test {

    public static void main(String[] args) {
        begin();

        checkClose( 0,              Lab1_2.area(0));
        checkClose( 3.141592653589, Lab1_2.area(1));
        checkClose(12.566370614359, Lab1_2.area(2));
        checkClose(28.274333882308, Lab1_2.area(3));

        getScore();
    }
}
