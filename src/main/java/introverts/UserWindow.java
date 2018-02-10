// Java II Project 3/4/5 for COP 2805C-10232 
// The goal of this project is to make a search engine that
// can search text documents that have been added using
// the administrator mode.
// Project created by team introverts:
// James Parker, Jessica Parker, Kritsia Figueroa

package introverts;

import introverts.AdminWindow;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class UserWindow extends Frame
	{
	   public UserWindow ()
	   {
	      setTitle("Search Engine");
	      setSize(800, 600);
	      setVisible(true);
	      setLocationRelativeTo(null);

	      addWindowListener(
	         new WindowAdapter()
	         {  public void windowClosing(WindowEvent e)
	            {  System.exit(0);
	            }
	         }
	      );
	   }

}
