	//package p1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener
{
	frameMaster mfm;
	frameSearch mf;
	frameVerAge mf2;
	frameUpdate mf3;
	frameDetails mf4;
	frameList mf5;
	
	/*//Defining attributes
	String cName;
	int mNo;
	String cAddr;
	
	//To display the records in a specific manner
	public String toString()
	{
		return this.cName +"#"+this.mNo +"#"+this.cAddr+"\n";
	}
	
	//Contructor
	MyActionListener(String n, int m, String a)
	{
		this.cName = n;
		this.mNo = m;
		this.cAddr = a;
	}	

	char ch[] = new char[1000];

	try{
		FileReader fr = new FileReader("phonebookfile.txt");
	}
	catch(IOException){
		System.out.println(e);
	}

    String list = new String(ch);
    String cases[] = list.split("\n"); // To split to next line
	String[][] arrdata = new String[cases.length][3];

	Scanner scan = new Scanner(System.in);*/

	MyActionListener(frameMaster a){
		this.mfm = a;
	}

	MyActionListener(frameSearch a){
		/*int i;
		System.out.print("Enter name :- ");
		String avoid= scan.nextLine();// To get getting string random
		String nameTemp= scan.nextLine();
		nameTemp = nameTemp.toLowerCase();
		int ptr=0;
		System.out.println("Case\tNumber\tCity");
		for(i=0;i<cases.length-1;i++)
		{
             String compName = String.valueOf(arrdata[i][0]);

			int nameres =(compName).compareTo(nameTemp); // Comparing the input string if it matches with any one in the list
			if(nameres==0)
			{
				for(int j=0;j<3;j++)
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
		/*//Printing all the records
        System.out.println("");
		System.out.println("Case\tNumber\tCity");
		for(int i=0;i < cases.length-1; i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arrdata[i][j]);   
            }
        	System.out.println("");
        }	*/
		this.mf5 = a;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Add"))
		{
			mf4 = new frameDetails();
			this.mf4.setVisible(true);
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