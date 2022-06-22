package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameList extends JFrame
{
	int row=9,column=3;
	Label[][] box = new Label [row][column];
	Font f1;
	JLabel labelList;
	JButton buttonList;
	MyActionListener ml = new MyActionListener(this);
	frameList()
	{
		super("List record");
		setLayout(null);
		setBounds(0,0,900,900);
		
		f1 = new Font("Times",Font.BOLD,25);
		
		buttonList=new JButton("Show");
		labelList=new JLabel("Click button to show all cases:");

		JPanel panel =new JPanel();
		panel.setLayout(new GridLayout(row,column));
		
		f1 = new Font("Arial",Font.BOLD,30);
		
		for(int i1=0;i1<row;i1++)
		{
			for(int i2=0;i2<column;i2++)
			{
				box[i1][i2] = new Label();
				box[i1][i2].setFont(f1);
				panel.add(box[i1][i2]);
			}
		}

		add(panel);
		add(buttonList);
		add(labelList);
		
		labelList.setFont(f1);
	
		buttonList.setBounds(300,720,200,100); 
		labelList.setBounds(100,100,600,30);
		panel.setBounds(10,50,580,600);
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