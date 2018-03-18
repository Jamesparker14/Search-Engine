// Java II Project 3/4/5 for COP 2805C-10232 
// The goal of this project is to make a search engine that
// can search text documents that have been added using
// the administrator mode.
// Project created by team introverts:
// James Parker, Jessica Parker, Kritsia Figueroa

package introverts;

import introverts.AdminWindow;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class UserWindow extends Frame
	{

	   public UserWindow ()
	   {

		   JFrame f = new JFrame ("Search Engine");
		   
		   JLabel name;
		   name = new JLabel ("Search Engine");
		   name.setFont (new Font ("SansSerif", Font.BOLD, 25) );
		   name.setBounds (315, 10, 200, 90);
		   f.add (name);
		   
		   JLabel searchTerms;
		   searchTerms = new JLabel ("Search Terms:");
		   searchTerms.setBounds (50, 63, 100, 100);
		   f.add (searchTerms);
		   
		   JLabel numFiles;
		   numFiles = new JLabel ("Number of files indexed: ");
		   numFiles.setBounds (330, 430, 200, 200);
		   f.add (numFiles);
		   
		   JTextField t1;
		   t1 = new JTextField ("Please enter the file name.");
		   t1.setBounds (140, 101, 500, 25);
		   f.add (t1);
		   
		   //Might need to be changed later for the files that are indexed.
		   JTextArea area = new JTextArea ("");
		   area.setBounds (10, 163, 765, 340);
		   f.add (area);
		   
		   JButton search = new JButton ("Search");
		   search.setBounds (650, 100, 75, 25);
		   f.add (search);
		   
		   JButton about = new JButton ("About");
		   about.setBounds (690, 515, 70, 30);
	       f.add (about);
	       
	       JButton maintenance = new JButton ("Maintenance");
	       maintenance.setBounds (20, 515, 110, 30);
	       f.add (maintenance);
	       
           JRadioButton optionOne = new JRadioButton ("All search terms");
           optionOne.setBounds (145, 130, 120, 30);
           f.add (optionOne);
           
           JRadioButton optionTwo = new JRadioButton ("Any of the search terms");
           optionTwo.setBounds (275, 130, 170, 30);
           f.add (optionTwo);
           
           JRadioButton optionThree = new JRadioButton ("Exact Phrase");
           optionThree.setBounds (445, 130, 150, 30);
           f.add (optionThree);
           
           ButtonGroup bg = new ButtonGroup();
           bg.add (optionOne);
           bg.add (optionTwo);
           bg.add (optionThree);
           
		   f.setSize (800, 600);
		   f.setLayout (null);
		   f.setVisible (true);
		   f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	      addWindowListener(
	         new WindowAdapter()
	         {  public void windowClosing(WindowEvent e)
	            {  System.exit(0);
	            }
	         }
	      );
	   }


public static void main ( String args[] )
{
   UserWindow i = new UserWindow(); 
 
}
}

