/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;

/**
 *
 * @author CS-KU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Anthony");
        p.insert();
        System.out.println(p.getId());

        p.setName("Batman");
        p.insert();
        System.out.println(p.getId());

        p.setName("Catalina");
        p.insert();
        System.out.println(p.getId());

        p.setName("Dogba");
        p.insert();
        System.out.println(p.getId());

        p.setName("Drogba");
        p.update();

        Person q = Person.selectByName("Catalina");
        q.delete();
    }

}
