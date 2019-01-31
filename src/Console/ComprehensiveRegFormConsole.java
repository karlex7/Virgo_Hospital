package Console;

import BL.PatientsHandler;
import MODEL.Patient.Patient;
import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author Karlo
 */
public class ComprehensiveRegFormConsole {
    PatientsHandler patientsHandler=new PatientsHandler();
    
    public void insertComprehensiveRegForm(){
        int idPatient=insertPatient();
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

    
}
