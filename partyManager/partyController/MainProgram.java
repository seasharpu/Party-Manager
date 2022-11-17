/*
Alexander Zetterström
M11P1163
MPP(valbar kurs)
*/
package partyController;

import javax.swing.*;

public class MainProgram
{
    public static void main(String[] args)
    {
        String userInput = null;

        while(userInput == null){
            userInput = JOptionPane.showInputDialog("max amount of guests?");
            if(userInput == null){
                JOptionPane.showMessageDialog(null, "Invalid Input\nPlease Try Again", "Cannot Cancel", JOptionPane.ERROR_MESSAGE);
            }
        }



        int maxNbrOfGuests = Integer.parseInt(userInput);

        while(maxNbrOfGuests <= 0){
            try{
                maxNbrOfGuests = Integer.parseInt(JOptionPane.showInputDialog("needs to be above zero, try again"));
            }catch(NumberFormatException E){
                maxNbrOfGuests = 0;
            }
        }

        // Change this line later. Only using 10 as a default value to make compilations possible.
        /* Write code to read max number of guests from the user by using one of
         - JOptionPane
         - Scanner and prompt
        */

        Controller controller = new Controller(maxNbrOfGuests);
    }
}
