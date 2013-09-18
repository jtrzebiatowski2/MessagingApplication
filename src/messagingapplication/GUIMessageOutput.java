/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package messagingapplication;

import javax.swing.JOptionPane;
/**
 *
 * @author J-Tron
 */
public class GUIMessageOutput implements MessageOutput{

    @Override
    public void produceMessageOutput(String message) {
       JOptionPane.showMessageDialog(null,message);
    }
    
}
