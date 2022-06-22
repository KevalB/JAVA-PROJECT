package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.lang.*;
import javax.swing.*;
public class frameLogin extends JFrame
{	
	JButton next,back,check,register;
    JTextField userid,pass;
	JLabel lg, pw;
	ImageIcon nextbt,backbt,checkbt;
	MyActionListener ml = new MyActionListener(this);
	
	frameLogin()
	{	
		super("Login");
		setLayout(null);
		setBounds(500,150,430,400);
		
		//Initialized Components
		userid = new JTextField("");
        pass = new JTextField("");

		lg = new JLabel("Username:");
		pw = new JLabel("Password:");
		
		next = new JButton("Login");
		next.setOpaque(false);
		next.setContentAreaFilled(false);
		next.setBorderPainted(false);

		register = new JButton("New registration");
		register.setOpaque(false);
		register.setContentAreaFilled(false);
		register.setBorderPainted(false);
		
		back = new JButton("Exit");
		back.setOpaque(false);
		back.setContentAreaFilled(false);
		back.setBorderPainted(false);

		check = new JButton("Submit");
		check.setOpaque(false);
		check.setContentAreaFilled(false);
		check.setBorderPainted(false);
		
		userid.setBounds(170,100,200,40);
		lg.setBounds(50,100,200,40);
		pass.setBounds(170,180,200,40);
		pw.setBounds(50,180,200,40);
		back.setBounds(20,292,100,50);
		check.setBounds(140,292,100,50);
		next.setBounds(270,292,100,50);
		register.setBounds(190,230,200,40);

		Font f1 = new Font("Arial",Font.BOLD,20);
		
		userid.setFont(f1);
		pass.setFont(f1);
		back.setFont(f1);
		check.setFont(f1);
		next.setFont(f1);
		lg.setFont(f1);
		pw.setFont(f1);
		register.setFont(f1);

		add(userid);add(pass);
		add(next);add(check);add(back);
		add(lg);add(pw);
		add(register);
		next.setEnabled(false);
		
		userid.addActionListener(ml);
		pass.addActionListener(ml);
		back.addActionListener(ml);
		check.addActionListener(ml);
		next.addActionListener(ml);
		register.addActionListener(ml);
		
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we) 
				{
					//System.exit(0);
					setVisible(false);
				}
			});
	}
	public static void main(String args[])
	{
			frameLogin lf = new frameLogin();
			lf.setVisible(true);
	}

}