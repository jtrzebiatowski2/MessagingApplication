/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;

/**
 *
 * @author J-Tron
 */
public class ConsoleMessageOutput implements MessageOutput{

    @Override
    public void produceMessageOutput(String message) {
      System.out.println(message);
      
    }
    
}
