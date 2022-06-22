package CourtRoom;
import java.io.*;
import java.util.*;

class removeCaseLib
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

	// Method 6
	// To remove the case from the library
	public cases checkOutCase()
	{
		System.out.println(
			"Enter Serial No of Case to be checked out.");
		int sNo = input.nextInt();

		int caseIndex = isAvailable(sNo);

		if (casesIndex != -1) {
			theCases[casesIndex].caseQtyCopy--;
			return theCases[casesIndex];
		}
		return null;
	}
}
