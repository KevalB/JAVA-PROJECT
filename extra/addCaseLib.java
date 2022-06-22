package CourtRoom;
import java.io.*;
import java.util.*;

class addCaseLib
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
	// Method 7
	// To add the case to the Library
	public void checkInCase(cases c)
	{
		for (int i = 0; i < count; i++) {
			if (c.equals(theCases[i])) {
				theCases[i].caseQtyCopy++;
				return;
			}
		}
	}
}
