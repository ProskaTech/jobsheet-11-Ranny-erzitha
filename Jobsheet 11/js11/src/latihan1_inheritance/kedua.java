
package latihan1_inheritance;

/**
 *
 * @author ranny erzitha-21343013
 */
public class kedua extends pertama {
    private int b = 8;
    
    protected void BacaSuper(){
        System.out.println("Nilai b = " + b);
        terprotek();
        info();
    }
}
