/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;

/**
 *
 * @author J-Tron
 */
public class MessageService {
    
    private MessageInput input;
    private MessageOutput output;
    
    
    public MessageService(MessageInput input, MessageOutput output){
        this.input = input;
        this.output = output;
    }
    
    public void constructMessage(){
        String message = input.getMessageInput();
        output.produceMessageOutput(message);
    }
    
}


