import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
 
public class AiTest extends JFrame {
 
    
    private JTextField UserInput = new JTextField(); //this one is the typing area which allow user input
   
    
    private JTextArea ChatArea = new JTextArea(); //this is the area that show the chat
   
    public AiTest() {
        
    	//this is the size of the JFrame
        this.setSize(600, 600);
        this.setVisible(true);								//Make JFrame visible
        this.setLayout(null);
        this.setTitle("Java AI");
       
       
        UserInput.setLocation(2, 530);						//TextBox size
        UserInput.setSize(580, 30);
        
        ChatArea.setLocation(15, 5);						//ChatArea Size
        ChatArea.setSize(560, 510);
        ChatArea.setEditable(false);
       
       
        //without this, the action in the block cannot be performed.
        UserInput.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
                String Text = UserInput.getText();
                ChatArea.append("You: " + Text + "\n");
               
                if(Text.contains("hi")){
                	smartAi("Hello there!");
                }
                else if(Text.contains("Bing Hao")){
                	smartAi("Hello");
            }
            else if(Text.contains("Dog")){
            	smartAi("Bow Bow");
            }
            else if(Text.contains("Cat")){
            	smartAi("Meow Meow");
            }
            else
            {
            	smartAi(new StringBuilder(Text).reverse().toString());  //use to reverse the string that user key in
            }
                UserInput.setText("");								//initial run is emfhpty, no text
            }
        });
       
       
       
     
        this.add(UserInput);
        this.add(ChatArea);
    }
   
    public void smartAi(String s){
    	ChatArea.append("AI: " + s + "\n");
    }
   
    public static void main(String[] args){
        new AiTest();
    }
 
}