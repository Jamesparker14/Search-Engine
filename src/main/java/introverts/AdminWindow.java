
// Java II Project 3/4/5 for COP 2805C-10232 
// The goal of this project is to make a search engine that
// can search text documents that have been added using
// the administrator mode.
// Project created by team introverts:
// James Parker, Jessica Parker, Kritsia Figueroa

package introverts;
import java.awt.*;
import javax.swing.*;

public class AdminWindow extends Frame
 {
 

    public AdminWindow ()
    {

        JFrame f;
        f = new JFrame ("Search Engine Maintenance");
       	f.setSize (800, 600);
     	f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    	       
    	JPanel jp = new JPanel ();
    	f.add (jp);
       	jp.setLayout (new BorderLayout () );
    	    	
    	JLabel title;
     	title = new JLabel ("Search Engine - Index Maintenance", JLabel.CENTER);
     	title.setFont (new Font ("SansSerif", Font.BOLD, 25) );
     	title.setAlignmentX (0);
    	title.setAlignmentY (0);
    	jp.add (title,BorderLayout.NORTH);
    	    		
    	//JTable where files and status will show up
    	String[] columns = {"File Name", "Status"};
    	Object[][] data = {  
    	    		      };
    	    
    	JTable jt = new JTable (data, columns);
    	jt.setPreferredScrollableViewportSize (new Dimension(400,63));
    	jt.setFillsViewportHeight (true);
    	    	
    	//Scroll pane to scroll through results
    	JScrollPane jps = new JScrollPane (jt);
    	jp.add (jps, BorderLayout.CENTER);
    	    
    	JPanel p = new JPanel(new GridBagLayout());
    	    	
    	//Buttons to add, remove, and update files
    	JButton addFiles = new JButton ("Add Files");
    	JButton removeFiles = new JButton ("Remove Selected Files");
    	JButton updateFiles = new JButton ("Update Files");
    	JButton resetWindows = new JButton ("Reset Window");
    	
    	JLabel numFiles = new JLabel ("Number of files indexed: ");
    	JLabel currVersion = new JLabel ("Search Engine Version");
    	
    	GridBagConstraints c = new GridBagConstraints();
    	       
    	//Button location and spacing
    	c.insets = new Insets (30,30,10,30);
    	c.gridx = 1;
    	c.gridy = 0;
    	p.add (addFiles, c);
    	       
    	c.gridx = 2;
    	c.gridy = 0;
    	p.add (removeFiles, c);
    	       
    	c.gridx = 3;
    	c.gridy = 0;
    	p.add (updateFiles, c);
    	
    	c.gridx = 1;
    	c.gridy = 1;
    	p.add (resetWindows, c);
    	
    	c.gridx = 2;
    	c.gridy = 1;
    	p.add (numFiles, c);
    	
    	c.gridx = 3;
    	c.gridy = 1;
    	p.add (currVersion, c);
    	 
    	jp.add (p, BorderLayout.SOUTH);
    	    	
    	f.setVisible (true); 
      }
    }