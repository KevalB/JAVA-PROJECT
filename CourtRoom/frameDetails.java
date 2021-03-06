package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

class frameDetails extends JFrame
{
	Font f1;
	JButton Save;
	JLabel JLabelName, JLabelJudge, JLabelCourt;
	JTextField txtName, txtJudge, txtCourt;

	ImageIcon backImage;
	JPanel background;
	JLabel imglabel;

	MyActionListener ml = new MyActionListener(this);
	frameDetails()
	{
		super("Case Details");
		setLayout(null);
		setBounds(0,0,600,600);
		
		backImage = new ImageIcon(getClass().getClassLoader().getResource("img/court2.jpg"));
		background = new JPanel();
		background.setBounds(0,0,600,600);
		
		imglabel = new JLabel();
		imglabel.setIcon(backImage);
		background.add(imglabel);

		f1 = new Font("Times",Font.BOLD,25);
		
		txtName=new JTextField();
		txtJudge=new JTextField();
		txtCourt=new JTextField();
		JLabelName=new JLabel("CASE NAME:");
		JLabelJudge=new JLabel("CASE JUDGE:");
		JLabelCourt=new JLabel("CASE COURT:");
		Save = new JButton("SAVE");
		
		add(txtName);
		add(txtJudge);
		add(txtCourt);
		add(JLabelName);
		add(JLabelJudge);
		add(JLabelCourt);
		add(Save);
		add(background);
		
		JLabelName.setFont(f1);
		JLabelCourt.setFont(f1);
		JLabelJudge.setFont(f1);

		txtName.setBounds(50,50,300,100);
		txtJudge.setBounds(50,200,300,100);
		txtCourt.setBounds(50,350,300,100);

		JLabelName.setBounds(50,20,500,30);
		JLabelJudge.setBounds(50,170,500,30);
		JLabelCourt.setBounds(50,320,500,30);

		JLabelName.setForeground(Color.WHITE);
		JLabelJudge.setForeground(Color.WHITE);
		JLabelCourt.setForeground(Color.WHITE);

		Save.setBounds(50,500,500,30);

		Save.addActionListener(ml);
		
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