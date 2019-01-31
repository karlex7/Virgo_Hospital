package MODEL.Patient;

import java.sql.Date;



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

    
    public Patient() {
    }

    public Patient(String Sex, Date BirthDate, String FirstName, String MidleName, String Surname) {
        super(FirstName, MidleName, Surname);
        this.Sex = Sex;
        this.BirthDate = BirthDate;
    }
    
    
    public Patient(int PersonID, String Sex, Date BirthDate) {
        this.PersonID = PersonID;
        this.Sex = Sex;
        this.BirthDate = BirthDate;
    }

    public Patient(int IDPatient, int PersonID, String Sex, Date BirthDate, int DoctorID, int IDPerson, String FirstName, String MidleName, String Surname) {
        super(IDPerson, FirstName, MidleName, Surname);
        this.IDPatient = IDPatient;
        this.PersonID = PersonID;
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

    @Override
    public String toString() {
        return "Patient{" + "IDPatient=" + IDPatient + ", PersonID=" + PersonID + ", Sex=" + Sex + ", BirthDate=" + BirthDate + ", DoctorID=" + DoctorID + '}';
    }
    
    
}
