package lab5;


import lab5.Counter;


public class TestCounter {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Counter c = new Counter();
        c.up();
        System.out.println(c.getNumber());  // 1

        for (int i = 0; i < 8; i++) {
            c.up();
        }
        System.out.println(c.getNumber());  // 9

        for (int i = 0; i < 3; i++) {
            c.up();
        }
        System.out.println(c.getNumber());  // 10

        for (int i = 0; i < 5; i++) {
            c.down();
        }
        System.out.println(c.getNumber());  // 5
        
        for (int i = 0; i < 10; i++) {
            c.down();
        }
        System.out.println(c.getNumber());  // 0
    }
}
