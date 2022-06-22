package CourtRoom;
import java.io.*;
import java.util.*;

class searchCase
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

	// Method 3
	// To search case by serial number
	public void searchBySno()
	{
		int sNo;
		System.out.println("Enter Serial No of Case:");
		sNo = input.nextInt();

		int flag = 0;
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {
			if (sNo == theCases[i].sNo) {
				System.out.println(
					theCases[i].sNo + "\t\t"
					+ theCases[i].caseName + "\t\t"
					+ theCases[i].authorName + "\t\t"
					+ theCases[i].bookQtyCopy + "\t\t"
					+ theCases[i].bookQty);
				flag++;
				return;
			}
		}
		if (flag == 0)
			System.out.println("No Case for Serial No "
							+ sNo + " Found.");
	}

	// Method 4
	// To search author by name
	public void searchByAuthorName()
	{

		// Display message
		System.out.println(
			"\t\t\t\tSEARCH BY AUTHOR'S NAME");

		input.nextLine();

		System.out.println("Enter Author Name:");
		String authorName = input.nextLine();

		int flag = 0;

		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			// if author matches any of its book
			if (authorName.equalsIgnoreCase(
					theCases[i].authorName)) {

				// Print below corresponding credentails
				System.out.println(
					theCases[i].sNo + "\t\t"
					+ theCases[i].caseName + "\t\t"
					+ theCases[i].authorName + "\t\t"
					+ theCases[i].bookQtyCopy + "\t\t"
					+ theCases[i].bookQty);
				flag++;
			}
		}

		// Else no book matches for author
		if (flag == 0)
			System.out.println("No Cases of " + authorName
							+ " Found.");
	}
}