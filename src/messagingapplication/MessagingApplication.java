/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;

/**
 *
 * @author J-Tron
 */
public class MessagingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MessageInput testInput = new ConsoleMessageInput();
        MessageOutput testOutput = new GUIMessageOutput();
        
        MessageService testMessageService = new MessageService(testInput, testOutput);
        
        testMessageService.constructMessage();
        
        MessageInput testInput2 = new GUIMessageInput();
        MessageOutput testOutput2 = new ConsoleMessageOutput();
        
        MessageService testMessageService2 = new MessageService(testInput2, testOutput2);
        
        testMessageService2.constructMessage();
    }
}
