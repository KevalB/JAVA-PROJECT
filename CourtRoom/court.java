package CourtRoom;
import java.util.Scanner;

class cases
{
	cases theCases[] = new cases[50];
	public static int count;

	Scanner input = new Scanner(System.in);

	// Method 1
	// To compare cases
	public int compareCaseObjects(cases c1, cases c2)
	{
		if (c1.caseName.equalsIgnoreCase(c2.caseName)) {

			// Printing cases exists
			System.out.println(
				"Case of this name already exists!");
			return 0;
		}

		// if book serial matches
		if (c1.sNo == c2.sNo) {

			// Print book exists
			System.out.println(
				"Case of this Serial No already exists!");

			return 0;
		}
		return 1;
	}

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

	// Method 5
	// To display all books
	/*public void showAllCases()
	{

		System.out.println("\t\t\t\tSHOWING ALL CASES\n");
		System.out.println(
			"S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

		for (int i = 0; i < count; i++) {

			System.out.println(
				theCases[i].sNo + "\t\t"
				+ theCases[i].caseName + "\t\t"
				+ theCases[i].authorName + "\t\t"
				+ theCases[i].bookQtyCopy + "\t\t"
				+ theCases[i].bookQty);
		}
	}*/

	/*// Method 6
	// To search the court room
	public int isAvailable(int sNo)
	{

		for (int i = 0; i < count; i++) {
			if (sNo == theCases[i].sNo) {
				if (theCases[i].bookQtyCopy > 0) {

					System.out.println(
						"Case is Available.");
					return i;
				}
				System.out.println("Case is Unavailable");
				return -1;
			}
		}

		System.out.println("No Case of Serial Number "
						+ " Available in Court.");
		return -1;
	}*/

	// Method 9
	// To remove the book from the library
	public cases checkOutCase()
	{
		System.out.println(
			"Enter Serial No of Case to be checked out.");
		int sNo = input.nextInt();

		int caseIndex = isAvailable(sNo);

		if (caseIndex != -1) {
			theCases[caseIndex].caseQtyCopy--;
			return theCases[caseIndex];
		}
		return null;
	}

	// Method 10
	// To add the Book to the Library
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
