/*
*
*  Author: Patrick Riley
*  This file will allow you to create and object
*  that will draw shapes and lines on a window
*  5/18/17
*
*/

import javax.swing.*;
import java.awt.*;

public class DrawStuffInHere extends JPanel{

   public void paintComponent(Graphics g){
      super.paintComponent(g);
      setBackground(Color.WHITE);
      
      g.setColor(Color.BLACK);
      
      
   // Replace the data type and variable name pairs with numeric arguments!      
   //
   //       //Draws a line
   //       g.drawLine(int x1, int y1, int x2, int y2);
   //      
   //       //Draws a Rectangle or square
          g.drawRect(100,100 , 50, 25);
   //       
   //       //Draws a rectangle with rounded edges
   //       g.drawRoundRect(int x, int y, int width, int length, int arcWidth, int arcLength);
   //       
   //       //Draws an oval or circle
   //       g.drawOval(int x, int y, int width, int length);
   //       
   //       //Draws an Arc 
   //       g.drawArc(int x, int y, int width, int length, int startAngle, int arcAngle);
   //       
   //       //Draws a String
   //       g.drawString(String str, int x, int y);
      
   
         /*****CHALLENGE!!!!!!!*****/
        
        // smileyFace(g);
        // snowman(g);
            
   }

   public void smileyFace(Graphics g){
      //fill in how to draw a smiley face here!
   }
   
   public void snowman(Graphics g){
      //fill in how to draw a snowman here!
   }

}