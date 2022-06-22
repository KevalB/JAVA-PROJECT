package CourtRoom;
import java.io.*;
import java.util.*;

class compareCase
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

	// Method 1
	// To compare cases
	public int compareCaseObjects(cases c1, cases c2)
	{
		if (c1.casesName.equalsIgnoreCase(c2.casesName)) {

			// Printing cases exists
			System.out.println(
				"Case of this name already exists!");
			return 0;
		}

		// if case serial matches
		if (c1.sNo == c2.sNo) {

			// Print case exists
			System.out.println(
				"Case of this Serial No already exists!");

			return 0;
		}
		return 1;
	}
}
