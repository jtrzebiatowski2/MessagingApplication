/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;
import java.util.Scanner;
/**
 *
 * @author J-Tron
 */
public class ConsoleMessageInput implements MessageInput{

    Scanner keyboard = new Scanner(System.in);
    private String message;
    
    @Override
    public String getMessageInput() {
        System.out.println("Enter your message");
        message = keyboard.nextLine();
        
        if (message == null){
            throw new IllegalArgumentException();
        }
        return message;
        }
    
    
}
