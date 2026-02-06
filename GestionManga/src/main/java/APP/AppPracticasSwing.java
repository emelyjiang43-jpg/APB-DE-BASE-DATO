/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package APP;

import vista.FrmPrincipal;
import java.util.ArrayList;

/**
 *
 * @author Ernesto Robles
 */
public class AppPracticasSwing {
    
    //variable global
    public static ArrayList<String> clientes = new ArrayList<>();
    
    public static void main(String[] args) {
        
        FrmPrincipal frmprincipal=new FrmPrincipal();
        frmprincipal.setVisible(true);
    }
}
