package MODEL.MedicalPersonnel;

/**
 *
 * @author Karlo
 */
public class Doctor extends MedicalPersonnel{
    private int IDDoctor;
    private int MedicalPersonnelID;

    public Doctor(int MedicalPersonnelID, int PersonID, String FirstName, String MidleName, String Surname) {
        super(PersonID, FirstName, MidleName, Surname);
        this.MedicalPersonnelID = MedicalPersonnelID;
    }
    public int getIDDoctor(){
        return IDDoctor;
    }
    public int getMedicalPersonnelID(){
        return MedicalPersonnelID;
    }
    public void setIDDoctor(int id){
        IDDoctor=id;
    }
}
