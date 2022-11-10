
package latihan2_inheritance;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class person {
    protected String name;
    protected int age;
    
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void info(){
        System.out.println("Nama : " + this.name);
        System.out.println("Usia : " + this.age);
    }
}
