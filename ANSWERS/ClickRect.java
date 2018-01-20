/*Patrick Riley
*
*Coding Club Java Workshop for 5/19/17
*Places a message on the top of the window and
*adds a MouseListener that will wait for a mouse 
*click and then add a new shape where the click
*was located.
*
*/

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import javax.swing.*;

public class ClickRect extends JFrame{
   private JLabel header;
   private JPanel panel;
   
   public ClickRect(){
   
      //puts the message on the top bar of the window
      super("Click Somewhere in this Window to Create a Shape!");      
      
      //adds a MouseListener that looks for where a mouse is clicked
      addMouseListener(
         new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               //Tells where the mouse clicked in the window
               //System.out.printf("Clicked (%d, %d)\n",e.getX(),e.getY());
               //creates a new shape that is located at the click
               Rect r = new Rect(e.getX(),e.getY());
               //adds the shape to the frame
               add(r);
               r.revalidate();
               r.repaint();
               
            }
         } ); 
   
      
   }
}