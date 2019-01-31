package Console;

import BL.MiniRegFormHandler;
import BL.NextOfKinHandler;
import BL.PatientsHandler;
import MODEL.Mini.NextOfKin;
import MODEL.Patient.Patient;
import MODEL.Patient.Person;
import java.sql.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Karlo
 */
public class MiniRegFormConsole {
    PatientsHandler patientsHandler=new PatientsHandler();
    NextOfKinHandler nextOfKinHandler=new NextOfKinHandler();
    MiniRegFormHandler miniRegFormHandler=new MiniRegFormHandler(); 
    
    public void insertMiniRegForm() {
        int patientID=insertPatient();
        String briefStatementOfComplaints=getBriefStatementOfCOmplaint();
        String contactTelephone=getContactTelephone();
        int nextOfKinID=insertNextOFkin();
        Date timeNow = new Date(Calendar.getInstance().getTimeInMillis());
        
        MODEL.Mini.MiniRegForm miniRegForm=new MODEL.Mini.MiniRegForm(new Date(timeNow.getDate()), patientID, briefStatementOfComplaints, contactTelephone, nextOfKinID);
        miniRegFormHandler.insertMiniRegForm(miniRegForm);
    }

    
    private int insertPerson(){
        String FirstName,MidleName,SurName;
        Scanner in=new Scanner(System.in);
        System.out.println("\nMini Registration Form:");
        System.out.println("Name\nFirst name: ");
        FirstName=in.nextLine();
        System.out.println("\nMidle name: ");
        MidleName=in.nextLine();
        System.out.println("\nSurname: ");
        SurName=in.nextLine();
        Person p=new Person(FirstName, MidleName, SurName);
        
        return patientsHandler.insertPerson(p);
    }

    private int insertPatient() {
        String FirstName,MidleName,SurName;
        Scanner in=new Scanner(System.in);
        System.out.println("\nMini Registration Form:");
        System.out.println("Name\nFirst name: ");
        FirstName=in.nextLine();
        System.out.println("\nMidle name: ");
        MidleName=in.nextLine();
        System.out.println("\nSurname: ");
        SurName=in.nextLine();
        
        System.out.println("\nSex(M/F): ");
        String sex=in.nextLine();
        System.out.println("Date of Birth(dd/mm/yyyy): ");
        String date=in.nextLine();
        String[] dateList=date.split("/");
        Date birthDate=new Date(Integer.parseInt(dateList[2]), Integer.parseInt(dateList[1]), Integer.parseInt(dateList[0]));
        return patientsHandler.insertPatient(new Patient(sex, birthDate, FirstName, MidleName, SurName)); 
    }

    private String getBriefStatementOfCOmplaint() {
        Scanner in=new Scanner(System.in);
        System.out.println("\nBrief Statement of Complaints: ");
        return in.nextLine();
    }

    private String getContactTelephone() {
        Scanner in=new Scanner(System.in);
        System.out.println("\nContact Telephone Number: ");
        return in.nextLine();
    }

    private int insertNextOFkin() {
        String FirstName,MidleName,SurName,Relationship;
        Scanner in=new Scanner(System.in);
        System.out.println("\nMini Registration Form:");
        System.out.println("Name\nFirst name: ");
        FirstName=in.nextLine();
        System.out.println("\nMidle name: ");
        MidleName=in.nextLine();
        System.out.println("\nSurname: ");
        SurName=in.nextLine();
        System.out.println("Relationship to Outpatient: ");
        Relationship=in.nextLine();
        //NextOfKin nextOfKin=new NextOfKin(Relationship, FirstName, MidleName, SurName);
        return nextOfKinHandler.insertNextOfKin(new NextOfKin(Relationship, FirstName, MidleName, SurName));
    }
}
