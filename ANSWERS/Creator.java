/**Patrick Riley
*
*Coding Club Java Workshop for 5/19/17
*This program allows the user to click a location in the window and then
*draw a circle on the location of the click
*This was created for demonstration purpose at the Java Graphics Workshop
*
*/

import javax.swing.*;
import java.awt.*;

public class Creator{

   public static void main(String[] args){
     
      ClickRect cr = new ClickRect();
      
      cr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //sets size of window
      cr.setSize(900,700);
      cr.setVisible(true);   
      cr.setBackground(Color.BLUE);
   }
}