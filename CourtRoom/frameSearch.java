package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameSearch extends JFrame
{
	Font f1;
	JLabel labelSearch;
	JButton buttonSearch;
	JTextField txtSearch;
	MyActionListener ml = new MyActionListener(this);
	frameSearch()
	{
		super("Search record");
		setLayout(null);
		setBounds(0,0,600,600);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		txtSearch=new JTextField();
		buttonSearch=new JButton("SEARCH");
		labelSearch=new JLabel("Enter the case name to search:");
		
		add(txtSearch);
		add(buttonSearch);
		add(labelSearch);
		
		labelSearch.setFont(f1);
		
		txtSearch.setBounds(20,150,530,100);
	
		buttonSearch.setBounds(200,300,200,100); 
		
		labelSearch.setBounds(100,50,600,30);
		
		buttonSearch.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					//System.exit(0);
					dispose();
				}
			});
	}
	public static void main(String args[])
	{
			frameSearch mf = new frameSearch();
			mf.setVisible(false);
	}
}