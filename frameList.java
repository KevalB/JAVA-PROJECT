//	package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameList extends JFrame
{
	Font f1;
	JLabel labelList;
	JButton buttonList;
	JTextField txtList;
	MyActionListener ml = new MyActionListener(this);
	frameList()
	{
		super("List record");
		setLayout(null);
		setBounds(0,0,900,900);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		txtList=new JTextField();
		buttonList=new JButton("List");
		labelList=new JLabel("Click button to show all cases:");
		
		add(txtList);
		add(buttonList);
		add(labelList);
		
		labelList.setFont(f1);
		
		txtList.setBounds(100,150,600,550);
	
		buttonList.setBounds(300,720,200,100); 
		
		labelList.setBounds(100,100,600,30);
		
		buttonList.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					dispose();
				}
			});
	}
	public static void main(String args[])
	{
			frameList mf5 = new frameList();
			mf5.setVisible(false);
	}
}