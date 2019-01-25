package MODEL.Patient;

import java.util.Date;

/**
 *
 * @author Karlo
 */
public class Patient extends Person{
    private int IDPatient;
    private int PersonID;
    private String Sex;
    private Date BirthDate;
    private int DoctorID;

    public Patient(String Sex, Date BirthDate, int DoctorID, String FirstName, String MidleName, String Surname) {
        super(FirstName, MidleName, Surname);
        this.Sex = Sex;
        this.BirthDate = BirthDate;
        this.DoctorID = DoctorID;
    }
    public int getIDPatient(){
        return IDPatient;
    }

    public int getPersonID(){
        return PersonID;
    }
    public String getSex(){
        return Sex;
    }
    public Date getBirthDate(){
        return BirthDate;
    }
    public int getDoctorID(){
        return DoctorID;
    }
    public void setIDPatient(int id){
        IDPatient=id;
    }
    
}
