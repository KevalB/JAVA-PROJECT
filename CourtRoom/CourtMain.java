package CourtRoom;

import java.io.*;
import java.util.*;

public class CourtMain
{
    int cID;
    String cName, jName, vName, dOHearing;

    public int getcID()
    {
        return cID;
    }

    public void setcID(int id)
    {
        cID = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String casename) {
        this.cName = cName;
    }    

    public String getjName() {
        return jName;
    }

    public void setjName(String judgename) {
        this.jName = jName;
    }    

    public String getvName() {
        return vName;
    }

    public void setvName(String victimname) {
        this.vName = vName;
    }    

    public String getdOHearing() {
        return dOHearing;
    }

    public void setdOHearing(String hearing) {
        this.dOHearing = dOHearing;
    }    

    public String toString() 
    {
        return this.cID + "," + this.cName + "," + this.jName + "," + this.vName+ "," + this.dOHearing+ ",";
    }

    public CourtMain(int cID, String cName, String jName, String vName, String dOHearing)
    {
        this.cID = cID;
        this.cName = cName;
        this.jName = jName;
        this.vName = vName;
        this.dOHearing = dOHearing;
    }

    // Convert array to string
    public static String arrayToString(CourtMain s[]) {
        String returnString = new String("");
        for (int i = 0; i < s.length; i++) {
            if (s.length == 1) {
                returnString += "\n" + s[i].toString();
            } else {
                if (i != s.length - 1) {
                    returnString += s[i].toString() + "\n";
                } else {
                    returnString += s[i].toString();
                }
            }
        }
        return returnString;

    }

    // Write case details into file
    public static void writefile(CourtMain s[], String fileName) throws IOException {
        String rtString = CourtMain.arrayToString(s);
        FileWriter fw = new FileWriter(fileName);
        fw.write(rtString);
        fw.close();
    }

    // Read the file
    public static char[] readfile(char c[], String fileName) throws IOException {

        FileReader fr = new FileReader(fileName);
        fr.read(c);
        fr.close();

        return c;
    }

    //Data from file converted to Object
    public static CourtMain[] toObjectCourt(String fileName) throws IOException 
    {
        char ch[] = new char[50000];
        CourtMain.readfile(ch, fileName);
        String records = new String(ch);
        String record[] = records.split("\n");
        CourtMain ob[] = new CourtMain[record.length];
        for (int i = 0; i < record.length; i++) {
            String attr[] = record[i].split(",");

            ob[i] = new CourtMain(Integer.parseInt((attr[0].trim())), (attr[1]).trim(), (attr)[2].trim(),
                    (attr[3]).trim(), (attr[4]).trim());

        }
        return ob;
    }

    //Get new data of the case
    public static CourtMain[] getInput(int caseid, String caname, String jdname, String vmname, String dhear) throws IOException {
        int ID=caseid;
        String CANAME=caname, JUNAME=jdname, VINAME=vmname, DOHEAR=dhear;

        CourtMain st[] = new CourtMain[1];

        st[0] = new CourtMain(ID, CANAME, JUNAME, VINAME, DOHEAR);

        String rtString = CourtMain.arrayToString(st);

        FileWriter fw = new FileWriter("/path", true);
        fw.write(rtString);
        fw.close();

        return st;

    }

   public static void printDET(CourtMain o) {

        System.out.println("Case name: " + o.getcName());
        System.out.println("Case ID: " + o.getcID());
        System.out.println("Judge Name: " + o.getjName());
        System.out.println("Victime Name: " + o.getvName());
        System.out.println("Date of hearing: " + o.getdOHearing());

    }

    // Search case details in a file
    public static void search() throws IOException {
        int parameter;
        Scanner sc = new Scanner(System.in);
        parameter = sc.nextInt();
        String desiredcName = "";
        
        int desiredcID = 0;

        CourtMain ob[] = CourtMain.toObjectCourt("caserecords.txt");

        int c = 0;
        for (int i = 0; i < ob.length; i++) {
            if (parameter == 1) {
                if (ob[i].getcName().equals(desiredcName)) {
                    c = 1;
                    printDET(ob[i]);

                }
            } else if (parameter == 2) {
                if (ob[i].getcID() == (desiredcID)) {
                    c = 1;
                    printDET(ob[i]);

                }
            }
        }
        if (c == 0) {
            System.out.println("No such record found.");
        }

        sc.close();
    }

}

