package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class frameMaster extends JFrame
{
	Font f0,f1;
	JLabel  title;
	JButton buttonAdd, buttonList, buttonSearch, buttonUpdate;
	JTextField txtName, txtAge, txtGender;
	MyActionListener ml = new MyActionListener(this);
	frameMaster()
	{
		super("Master Frame");
		setLayout(null);
		setBounds(0,0,900,700);
		
		f0 = new Font("Times",Font.BOLD,40);
		f1 = new Font("Times",Font.BOLD,25);
		
		title = new JLabel("COURT ROOM MANAGEMENT");
		buttonAdd = new JButton("Add");
		buttonList = new JButton("List");
		buttonSearch = new JButton("Search");
		buttonUpdate = new JButton("Update");
		
		//title.setOpaque(true);
		//title.setBackground(Color.BLUE);

		//frameMaster.getContentPane().setBackground(Color.BLACK);

		add(title);
		add(buttonAdd);
		add(buttonList);
		add(buttonSearch);
		add(buttonUpdate);
		
		title.setFont(f0);
		buttonAdd.setFont(f1);
		buttonList.setFont(f1);
		buttonSearch.setFont(f1);
		buttonUpdate.setFont(f1);
		
		title.setBounds(130, 0, 600, 100);
		buttonAdd.setBounds(100, 100, 200, 100);
		buttonList.setBounds(320, 100, 200, 100);
		buttonUpdate.setBounds(540, 100, 200, 100);
		buttonSearch.setBounds(320, 300, 200, 100);

		//buttonVerify.addActionListener(ml);
		
        buttonAdd.addActionListener(ml);
		buttonSearch.addActionListener(ml);
		buttonUpdate.addActionListener(ml);
		buttonList.addActionListener(ml);
		
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
			frameMaster mfm = new frameMaster();
			mfm.setVisible(true);
	}
}