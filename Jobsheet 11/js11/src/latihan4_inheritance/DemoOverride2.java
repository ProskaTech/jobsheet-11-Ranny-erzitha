
package latihan4_inheritance;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
public class DemoOverride2 {
    public static void main(String args[]){
        b obj = new b();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
