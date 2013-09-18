/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package messagingapplication;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author J-Tron
 */
public class FileMessageInput implements MessageInput{
    private final String fileAddedMessage = "The file has been added";
    private String [] messageArray = new String[0];
    private File file;
    private int fileCount = 0;
    private final String fileNotFoundErrorMessage = "File not found";
    
    @Override
    public String getMessageInput() {
        Scanner inputFile;
        
        try{
            file = new File("TestMessage.Text");
            inputFile = new Scanner(file);
            
        while(inputFile.hasNext()){
            
        String [] temp = new String[messageArray.length+1];
        System.arraycopy(messageArray, 0, temp, 0, messageArray.length);
        messageArray=temp;
        messageArray[fileCount]=inputFile.nextLine();
        fileCount++;
        }
        
        inputFile.close();
        }
    
        catch(FileNotFoundException e){
            System.out.println(fileNotFoundErrorMessage);
        }
        
        return fileAddedMessage;
}
    
}
