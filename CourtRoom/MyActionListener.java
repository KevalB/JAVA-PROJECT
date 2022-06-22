package CourtRoom;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	public String casename, casejudge, casecourt, id, pass, ruser, rpass;

	frameMaster mfm;
	frameSearch mf;
	frameVerAge mf2;
	frameUpdate mf3;
	frameDetails mf4;
	frameList mf5;
	frameLogin lf;

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

	MyActionListener(frameLogin a){
		this.lf = a;
	}
	
	boolean tOrf=false;
    public boolean logincheck(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
		try
		{
			char ch[] = new char[50];
			FileReader fr = new FileReader("creds.txt");
			fr.read(ch);
			fr.close();
			
			String records = new String(ch);
			String temp[]=records.split("#");
			if(temp[0].trim().equals(username) && temp[1].trim().equals(password))
			{
				tOrf=true;
			}
			else
			{
				tOrf=false;
			}	
		}
		catch(Exception iv)
		{}
		return tOrf;
	}
    /*String list = new String(ch);
    String cases[] = list.split("\n"); // To split to next line
    String[][] arrdata = new String[cases.length][3];
	for(int i = 0; i < cases.length-1; i++)
    {
        String attr[] = cases[i].split("#");
        for(int j=0;j<3;j++)
        {
            if(attr.length>1)
            {
                if(j==0)
                {
                    arrdata[i][j]=(attr[0]); // First attribute
				}
                else if(j==1)
                {
                    arrdata[i][j]=("#"+attr[1]); // Second attribute
                }
                else if(j==2)
                {
                    arrdata[i][j]=("#"+attr[2]); // Third attribute
                }
            }
        }
    }
*/
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
				FileWriter fw=new FileWriter("caserecords.txt", true);
				fw.write(","+casename+","+casejudge+","+casecourt+"\n");

				//casename=this.mf4.txtName.setText();
				//casejudge=this.mf4.txtJudge.setText();
				//casecourt=this.mf4.txtCourt.setText();

				System.out.println(casename);
				//System.out.println("\n");
				fw.close();
			} 
			catch(IOException ie) 
			{
				System.out.println(ie);
			}
		}

		if(e.getActionCommand().equals("Show"))	
		{
			try   
			{
				char ch[] = new char[1500];
				FileReader fr = new FileReader("caserecords.txt");
				fr.read(ch);
				fr.close();
				
				String records = new String(ch);
				String record[] = records.split("\n");
				for(int i=0;i<record.length;i++)
				{
					String attr[] = record[i].split(",");
					for(int k=0;k<3;k++)
					{
						if(attr.length>1)
						{
							if(k==0)
							{
								this.mf5.box[i][0].setText(attr[0]);	
							}
							else if(k==1)
							{
								this.mf5.box[i][1].setText(attr[1]);
							}
							else if(k==2)
							{
								this.mf5.box[i][2].setText(attr[2]);
							}
						}
					}
				}
				
			}   
			catch (IOException ioe)   
			{
				JOptionPane.showMessageDialog(null, ioe.toString(),"Exception" , JOptionPane.ERROR_MESSAGE);
			}
		}
		
		if(e.getActionCommand().equals("List"))
		{
			mf5 = new frameList();
			this.mf5.setVisible(true);
        }

		if(e.getActionCommand().equals("Update"))
		{

			/*int casefind= scan.nextInt();
			for(i=0; i < cases.length-1; i++)
			{
                String tempdata3 = (arrdata[i][1]).startsWith(",") ? (arrdata[i][1]).substring(1) : (arrdata[i][1]);
            	int numres = Integer.valueOf(tempdata3);
				if(numres == casefind)
				{
					System.out.println("found ");
					for(int j = 0; j < 3;j++)
                    {
                        System.out.print(arrdata[i][j]);   
                    }
                    System.out.println("");
					//System.out.println("Enter case name :- ");
					String avoid3= scan.nextLine();
					String casename= scan.nextLine();

					int numsame= scan.nextInt();

					//System.out.println("enter judge name :- ");
					String avoid4= scan.nextLine();
					String casejudge= scan.nextLine();
					for(int j=0; j < 3; j++) // Updating the entities
                    {
                        if(j==0)
                        {
                    	    arrdata[i][j]=(casename);
                        }
                        else if(j==1)
                        {
                            arrdata[i][j]=(","+casejudge);
                        }
                        else if(j==2)
                        {
                            arrdata[i][j]=(","+casecourt);
                        }
                    }
					ptr=1;
				}		
				else if(ptr!=1)
				{
					System.out.println("No record found");
				}
			}

            FileWriter fw = new FileWriter("caserecords.txt");
            for(i=0;i<cases.length-1;i++)
            {
                String temp=(arrdata[i][0]+arrdata[i][1]+arrdata[i][2]);
                fw.write(temp);
                fw.write("\n");
        	}
			fw.close();
			System.out.println(" ");
			System.out.println("Updated!");*/

			mf3 = new frameUpdate();
			this.mf3.setVisible(true);
        }
		if(e.getActionCommand().equals("Search"))
		{
            /*System.out.print("Enter number :- ");
            int num= scan.nextInt();
            ptr=0;
                    
            for(i=0; i < contacts.length-1; i++)
            {
                String tempdata2 = (arrdata[i][1]).startsWith(",") ? (arrdata[i][1]).substring(1).trim() : (arrdata[i][1]);
                int numres = Integer.valueOf(tempdata2);
				System.out.println("Name\tJudge\tCourt");
				if(numres == num)
                {
                    for(int j=0; j < 3; j++)
                    {
                        System.out.print(arrdata[i][j]);   
                    }
                    System.out.println("");
                }
                else
                {
                    ptr++;
                }
			}
            if(ptr==cases.length-1)
            {
                System.out.println("No record found");
			}*/
			mf = new frameSearch();
			this.mf.setVisible(true);
		}
		if(e.getActionCommand().equals("Exit"))
		{
			this.lf.setVisible(false);
		}
		if(e.getActionCommand().equals("Submit"))
		{
			id=this.lf.userid.getText();
			pass=this.lf.pass.getText();
			boolean forlogin = logincheck(id,pass);
			if(forlogin)
			{
				this.lf.next.setEnabled(true);	
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Username/Password incorrect","alert" , JOptionPane.ERROR_MESSAGE);
			}
		}
		if(e.getActionCommand().equals("Login"))
		{
			this.lf.setVisible(false);
			mfm = new frameMaster();
			this.mfm.setVisible(true);
			JOptionPane.showMessageDialog(null, "Login Successful!");
			System.out.println("Logged in!");
		}
		if(e.getActionCommand().equals("Logout"))
		{
			this.mfm.setVisible(false);
			this.lf.setVisible(true);

			JOptionPane.showMessageDialog(null, "Loggged out Successfully!");
			System.out.println("Logged out!");
		}
		if(e.getActionCommand().equals("Register"))
		{
			ruser=this.mf4.txtName.getText();
			rpass=this.mf4.txtJudge.getText();

			try 
			{
				FileWriter fw=new FileWriter("caserecords.txt", true);
				fw.write(ruser+","+rpass+","+"\n");

				//casename=this.mf4.txtName.setText();
				//casejudge=this.mf4.txtJudge.setText();
				//casecourt=this.mf4.txtCourt.setText();

				System.out.println(ruser);
				//System.out.println("\n");
				fw.close();
			} 
			catch(IOException ie) 
			{
				System.out.println(ie);
			}
		}
	}
}