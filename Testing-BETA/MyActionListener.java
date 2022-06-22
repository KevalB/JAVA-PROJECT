//package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	public String casename, casejudge, casecourt;

	frameMaster mfm;
	frameSearch mf;
	frameVerAge mf2;
	frameUpdate mf3;
	frameDetails mf4;
	frameList mf5;

	MyActionListener(frameMaster a){
		this.mfm = a;
	}

	MyActionListener(frameSearch a){
		this.mf = a;
	}
	
	MyActionListener(frameVerAge a){
		this.mf2 = a;
	}
	
	MyActionListener(frameUpdate a){
		this.mf3 = a;
	}	
	
	MyActionListener(frameDetails a){
		this.mf4 = a;
	}

	MyActionListener(frameList a){
		this.mf5 = a;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Add"))
		{
			mf4 = new frameDetails();
			this.mf4.setVisible(true);
        }

		if(e.getActionCommand().equals("SAVE"))
		{
			casename=this.mf4.txtName.getText();
			casejudge=this.mf4.txtJudge.getText();
			casecourt=this.mf4.txtCourt.getText();
			try 
			{
				FileWriter fw=new FileWriter("caserecords.txt");
				fw.write(casename+","+casejudge+","+casecourt);
				System.out.println(casename);
				fw.close();
			} 
			catch(IOException ie) 
			{
				System.out.println(ie);
			}
		}	
		if(e.getActionCommand().equals("List"))
		{
			mf5 = new frameList();
			this.mf5.setVisible(true);
        }
		if(e.getActionCommand().equals("Update"))
		{
			mf3 = new frameUpdate();
			this.mf3.setVisible(true);
        }
		if(e.getActionCommand().equals("Search"))
		{
			mf = new frameSearch();
			this.mf.setVisible(true);
		}
	}
}