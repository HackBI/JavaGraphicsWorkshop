import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rect extends JPanel{
   //fields for the position of the shape
   int x,y;
   
   public Rect(int xx, int yy){
      x = xx;
      y = yy;
      revalidate();
      repaint();
   }
   
   private void drawShape(Graphics g) {  
      //sets the color of the shape to a random color
      int r=(int)(Math.random()*255);
      int gr=(int)(Math.random()*255);
      int b=(int)(Math.random()*255);
      int rand = (int)(Math.random()*4);      
      g.setColor(new Color(r, gr, b)); 
      
      //Creates a new shape that is centered on the click
      switch(rand){
         case 0:
            g.fillOval(x-90,y-150,150,150);
            break;
         case 1:
            g.fillRect(x-50,y-25,100,50);
            break;
         case 2:
            g.fillOval(x-45,y-75,100,75);
            break;
         default:
            g.fillRect(x-100,y-100,200,200);           
      }
   }
   
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      //draws the shape
      drawShape(g);   
   }
}