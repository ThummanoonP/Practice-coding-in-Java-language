package lab_1;

public class TestLab1_3 extends Test {

    public static void main(String[] args) {
        begin();

        check(true,  Lab1_3.isPrime(2));
        check(true,  Lab1_3.isPrime(3));
        check(true,  Lab1_3.isPrime(5));
        check(false, Lab1_3.isPrime(12));
        check(true,  Lab1_3.isPrime(13));
        check(false, Lab1_3.isPrime(15));

        getScore();
    }
}
