//	package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class frameDetails extends JFrame
{
	Font f1;
	JButton Save;
	JLabel JLabelName, JLabelDetails;
	JTextField txtName, txtDetails;
	MyActionListener ml = new MyActionListener(this);
	frameDetails()
	{
		super("Case Details");
		setLayout(null);
		setBounds(0,0,600,600);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		txtName=new JTextField();
		txtDetails=new JTextField();
		JLabelName=new JLabel("CASE NAME:");
		JLabelDetails=new JLabel("CASE DETAIL:");
		Save = new JButton("SAVE");
		
		add(txtName);
		add(txtDetails);
		add(JLabelName);
		add(JLabelDetails);
		add(Save);
		
		JLabelName.setFont(f1);
		JLabelDetails.setFont(f1);
		
		txtName.setBounds(50,150,500,100);
		txtDetails.setBounds(50,350,500,100);
		
		JLabelName.setBounds(50,100,500,30);
		JLabelDetails.setBounds(50,300,500,30);

		Save.setBounds(50,500,500,30);
		
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
			frameDetails mf4 = new frameDetails();
			mf4.setVisible(false);
	}
}