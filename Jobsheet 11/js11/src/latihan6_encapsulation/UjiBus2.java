
package latihan6_encapsulation;

/**
 *
 * @author Ranny Erzitha-21343013
 */
public class UjiBus2 {
    public static void main(String args[]){
        bus2 busBesar = new bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
}
