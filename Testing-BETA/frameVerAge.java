//package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameVerAge extends Frame
{
	Font f1;
	Label verName, verAge, verGender;
	Button buttonVerify;
	TextField txtName, txtAge, txtGender;
	MyActionListener ml = new MyActionListener(this);
	frameVerAge()
	{
		super("Age Verification");
		setLayout(null);
		setBounds(0,0,500,700);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		txtName=new TextField();
		txtAge=new TextField();
		txtGender=new TextField();
		buttonVerify=new Button("Verify");
		verName=new Label("Enter your name:");
		verAge=new Label("Enter your age:");
		verGender=new Label("Enter your gender:");
		
		add(txtName);
		add(txtAge);
		add(txtGender);
		add(buttonVerify);
		add(verName);
		add(verAge);
		add(verGender);
		
		verName.setFont(f1);
		verAge.setFont(f1);
		verGender.setFont(f1);
		
		txtName.setBounds(50,150,400,100);
		txtAge.setBounds(50,300,400,100);
		txtGender.setBounds(50,450,400,100);		
	
		buttonVerify.setBounds(100,570,300,100); 
		
		verName.setBounds(50,120,300,30);
		verAge.setBounds(50,270,300,30);
		verGender.setBounds(50,420,300,30);
		
		buttonVerify.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
			frameVerAge mf = new frameVerAge();
			mf.setVisible(true);
	}
}