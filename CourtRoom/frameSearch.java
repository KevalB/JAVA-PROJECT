package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameSearch extends JFrame
{
	Font f1;
	JLabel labelSearch, labelResult;
	JButton buttonSearch;
	JTextField txtSearch, resSearch;

	ImageIcon backImage;
	JPanel background;
	JLabel imglabel;

	MyActionListener ml = new MyActionListener(this);
	frameSearch()
	{
		super("Search record");
		setLayout(null);
		setBounds(0,0,600,600);
		
		backImage = new ImageIcon(getClass().getClassLoader().getResource("img/court3.jpg"));
		background = new JPanel();
		background.setBounds(0,0,600,600);

		imglabel = new JLabel();
		imglabel.setIcon(backImage);
		background.add(imglabel);

		f1 = new Font("Times",Font.BOLD,25);
		
		txtSearch=new JTextField();
		resSearch=new JTextField();
		buttonSearch=new JButton("SEARCH");
		labelSearch=new JLabel("Enter the case name to search:");
		labelResult=new JLabel("Result:");
		
		add(txtSearch);
		add(resSearch);
		add(buttonSearch);
		add(labelSearch);
		add(labelResult);
		add(background);
		
		labelSearch.setFont(f1);
		labelResult.setFont(f1);

		txtSearch.setBounds(20,150,530,100);

		resSearch.setBounds(20,400,530,100);
	
		buttonSearch.setBounds(150,270,300,50); 
		
		labelSearch.setBounds(100,50,600,30);

		labelResult.setBounds(100,330,530,100);
		
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