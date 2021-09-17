
import JFrameLogin.JFIngreso;
import javax.swing.UIManager;



/**
 *
 * @author erick
 */
public class Main {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        System.out.println("HOla");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
           JFIngreso jfIngresoMain = new JFIngreso();
           jfIngresoMain.setVisible(true);
    }
    
}
