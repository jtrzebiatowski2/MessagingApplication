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
public class GUIMessageInput implements MessageInput {

    private String message;
    
    @Override
    public String getMessageInput() {
        message = JOptionPane.showInputDialog("Enter Your Message", message);
        return message;
    
}
    
}
