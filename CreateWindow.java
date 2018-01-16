/**
*
*  Author: Patrick Riley  
*  This file will allow you to draw a Window on the screen
*  and then add your shapes to it
*  5/18/17
*
*/

import javax.swing.JFrame;

public class CreateWindow {

	public static void main(String[] args) {
		
      JFrame frame = new JFrame("This is Drawing Window!");
      DrawStuffInHere dr = new DrawStuffInHere();
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,300);
      frame.add(dr);
      frame.setVisible(true);

	}

}