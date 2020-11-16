
package ClassePrincipal;

import View.ViewPrincipal;
import conexoes.MySQL;

public class Classeprincipal {
    public static void main(String[] args) {
        ViewPrincipal menu = new ViewPrincipal();
        menu.setVisible(true);
              
        //MySQL novacon = new MySQL();
        //novacon.conectaBanco();
        //menu.setExtendedState(menu.MAXIMIZED_BOTH); 
        
    }
    
}
