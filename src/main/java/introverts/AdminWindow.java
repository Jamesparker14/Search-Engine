
// Java II Project 3/4/5 for COP 2805C-10232 
// The goal of this project is to make a search engine that
// can search text documents that have been added using
// the administrator mode.
// Project created by team introverts:
// James Parker, Jessica Parker, Kritsia Figueroa

package introverts;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class AdminWindow extends Frame
 {
 
 private JFrame f;
 private JLabel title;
 
    public AdminWindow ()
    {
     
    	f = new JFrame("Admin Mode");
    	f.setSize(800, 600);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    	JPanel jp = new JPanel();
    	f.add(jp);
    	jp.setLayout(new BorderLayout());
    	
    	title = new JLabel("Search Engine - Administrator", JLabel.CENTER);
    	title.setFont(new Font("Tahoma", Font.BOLD, 30));
    	title.setAlignmentX(0);
    	title.setAlignmentY(0);
    	jp.add(title,BorderLayout.NORTH);
    		
    	//JTable where files and status will show up
    	String[] columns = {"File Name", "Status"};
    	String[][] data = {  
    		{"File1.txt", "Open"},
    		{"File2.txt", "Closed"},
    		{"File3.txt", "Closed"}
    		};
    
    	JTable jt = new JTable(data, columns);
    	jt.setPreferredScrollableViewportSize(new Dimension(400,63));
    	jt.setFillsViewportHeight(true);
    	
    	//Scroll pane to scroll through results
    	JScrollPane jps = new JScrollPane(jt);
    	jp.add(jps, BorderLayout.CENTER);
    
    	JPanel p = new JPanel(new GridBagLayout());
    	
    	//Buttons to add, remove, and update files
    	JButton addFiles = new JButton("Add Files");
    	JButton removeFiles = new JButton("Remove Files");
    	JButton updateFiles = new JButton("Update Files");
       
    	GridBagConstraints c = new GridBagConstraints();
       
    	//Button location and spacing
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
 
    	jp.add(p, BorderLayout.SOUTH);
    	
    	f.setVisible(true);  
    }
 }