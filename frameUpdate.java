//	package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameUpdate extends JFrame
{
	Font f1;
	JLabel oldCase, newCase, updatedCase;
	JButton buttonUpdate;
	JTextField txtOld, txtNew, txtUpdated;
	MyActionListener ml = new MyActionListener(this);
	frameUpdate()
	{
		super("Case Update");
		setLayout(null);
		setBounds(0,0,500,700);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		txtOld=new JTextField();
		txtNew=new JTextField();
		txtUpdated=new JTextField();
		buttonUpdate=new JButton("Update");
		oldCase=new JLabel("Enter the case to update:");
		newCase=new JLabel("Enter new name for the case:");
		updatedCase=new JLabel("Updated to:");
		
		add(txtOld);
		add(txtNew);
		add(txtUpdated);
		add(buttonUpdate);
		add(oldCase);
		add(newCase);
		add(updatedCase);
		
		oldCase.setFont(f1);
		newCase.setFont(f1);
		updatedCase.setFont(f1);
		
		txtOld.setBounds(50,50,400,100);
		txtNew.setBounds(50,200,400,100);
		txtUpdated.setBounds(50,350,400,100);		
	
		buttonUpdate.setBounds(100,470,300,100); 
		
		oldCase.setBounds(50,20,300,30);
		newCase.setBounds(50,170,400,30);
		updatedCase.setBounds(50,320,300,30);
		
		buttonUpdate.addActionListener(ml);
		
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
			frameUpdate mf3 = new frameUpdate();
			mf3.setVisible(false);
	}
}