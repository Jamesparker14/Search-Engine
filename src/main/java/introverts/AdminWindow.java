// Java II Project 3/4/5 for COP 2805C-10232 
// The goal of this project is to make a search engine that
// can search text documents that have been added using
// the administrator mode.
// Project created by team introverts:
// James Parker, Jessica Parker, Kritsia Figueroa



package introverts;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;


public class AdminWindow extends Frame
	{
	
	private JFrame f;
	private JPanel p;
	private JLabel title;
	private JButton addFiles;
	private JButton removeFiles;
	private JButton updateFiles;
	
	   public AdminWindow ()
	   {
		   
		  f = new JFrame("Admin Mode");
		  f.setVisible(true);
	      f.setSize(800, 600);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      title = new JLabel("Search Engine - Administrator", JLabel.CENTER);
	      title.setFont(new Font("Tahoma", Font.BOLD, 30));
		  title.setAlignmentX(0);
		  title.setAlignmentY(0);
		  f.add(title,BorderLayout.NORTH);

	      JPanel p = new JPanel(new GridBagLayout());
	      
	      JButton addFiles = new JButton("Add Files");
	      JButton removeFiles = new JButton("Remove Files");
	      JButton updateFiles = new JButton("Update Files");
	      
	      GridBagConstraints c = new GridBagConstraints();
	      
	      c.insets = new Insets(60,60,60,60);
	      c.gridx = 1;
	      c.gridy = 0;
	      p.add(addFiles, c);
	      
	      c.gridx = 2;
	      c.gridy = 0;
	      p.add(removeFiles, c);
	      
	      c.gridx = 3;
	      c.gridy = 0;
	      p.add(updateFiles, c);
	
	      f.add(p,BorderLayout.SOUTH);
	   }
	}
