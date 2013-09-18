/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author J-Tron
 */
public class FileMessageOutput implements MessageOutput{
    /*This code creates a reader that reads from a file, turns it into a string and then displays
    the message to the console
    */
    /*
    BufferedReader in = new BufferedReader(new FileReader("C:\Users\J-Tron\Desktop\Documents\NetBeansProjects\MessagingApplication\TestMessage.Text"));
    String line = in.readLine();
    while(line != null)
    {
    System.out.println(line);
    line = in.readLine();
    }
    in.close();
    */

    @Override
    public void produceMessageOutput(String message) {
        System.out.println(message);
    }
    
}
