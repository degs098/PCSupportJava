
package mensajes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class FondoGris extends JFrame{
    
    private Dimension dim;
    
    public FondoGris(){
        dim = super.getToolkit().getScreenSize();
        super.setSize(dim);
        super.setBackground(Color.BLACK);
        super.setUndecorated(true);
        super.setOpacity(0.6f);        
        super.setVisible(true);
    }
}
