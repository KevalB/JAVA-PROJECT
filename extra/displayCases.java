package CourtRoom;
import java.io.*;
import java.util.*;

class displayCase
{
	public void getCaseFile(String s) throws Exception
	{
		char ch[] = new char[1000];
		FileReader fr = new FileReader(s);
		fr.read(ch);
		fr.close();
	}

	cases theCases[] = new cases[50];
	public static int count;

	Scanner input = new Scanner(System.in);

	// Method 5
	// To display all books
	public void showAllCases()
	{

		System.out.println("\t\t\t\tSHOWING ALL CASES\n");
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
				theCases[i].sNo + "\t\t"
				+ theCases[i].caseName + "\t\t"
				+ theCases[i].authorName + "\t\t"
				+ theCases[i].casesQtyCopy + "\t\t"
				+ theCases[i].casesQty);
		}
	}
}