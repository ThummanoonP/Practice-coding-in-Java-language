package lab5;



public class TestDate {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);  // 1 Jan

        for (int i = 0; i < 30; i++) {
            d.next();
        }
        System.out.println(d);  // 31 Jan


        d.next();
        System.out.println(d);  // 1 Feb

        for (int i = 0; i < 27; i++) {
            d.next();

        }
        System.out.println(d);  // 28 Feb

        d.next();
        System.out.println(d);  // 1 Mar

        for (int i = 0; i < 305; i++) {
            d.next();

        }
        System.out.println(d);  // 31 Dec

        d.next();
        System.out.println(d);  // 1 Jan'
    }
}

