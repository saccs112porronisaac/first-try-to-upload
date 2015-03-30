package rockpapersissor;

import  javax.swing.JOptionPane;


public class Rock {

	public static void main(String[] args){
	int numberOfGamePlays = 1;
			
	
	while (numberOfGamePlays<4)
				{
					String userChoice1 = JOptionPane.showInputDialog("Lets play Rock, Paper, Scissors!\nChoose your move: ");
					numberOfGamePlays++;
		   	
		   		switch(userChoice1.toLowerCase())
		   		{
		   	
				case "rock":
		   			String message = String.format("The computer chose paper, you lose!");
		   			JOptionPane.showMessageDialog(null,message);
		   			break;
			
		   		case "paper":
		   			String message1 = String.format("The computer chose paper, it's a tie!");
		   			JOptionPane.showMessageDialog(null,message1);
		   			break;
		   			
		   		case "scissors":
		   			String message2= String.format("The computer chose paper, you win!");
		   			JOptionPane.showMessageDialog(null,message2);
		   			break;
		   			
		   		default:
		   		
		   			JOptionPane.showMessageDialog(null,"Invalid response!");  	
		   			}
		   		String userChoice2 = JOptionPane.showInputDialog("Do you want to play again?");
		   			
		   			switch (userChoice2.toLowerCase())
		   			{
		   			case "yes":
		   					String message = String.format("Glad to hear, try again");
		   					JOptionPane.showMessageDialog(null, message);
		   					break;
		   					
		   			case "no":
		   					String message1 = String.format("too bad try again");
		   					JOptionPane.showMessageDialog(null,message1);
		   					break;
		   					
		   			default:
		   				
   						JOptionPane.showMessageDialog(null,"Invalid response!");
		    }
	     }
	 }
}