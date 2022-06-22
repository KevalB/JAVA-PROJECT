package CourtRoom;
import java.io.*;
import java.util.*;

class addCase
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

	// Method 2
	// To add case
	public void addCase(cases c)
	{

		for (int i = 0; i < count; i++) {

			if (this.compareCaseObjects(c, this.theCases[i]) == 0)
				return;
		}

		if (count < 50) {

			theCases[count] = c;
			count++;
		}
		else {
			System.out.println(
				"No space to add more cases.");
		}
	}
}