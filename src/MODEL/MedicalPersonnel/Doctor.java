package MODEL.MedicalPersonnel;

/**
 *
 * @author Karlo
 */
public class Doctor extends MedicalPersonnel{
    private int IDDoctor;
    private int MedicalPersonnelID;

    public Doctor(int IDDoctor, int MedicalPersonnelID, int IDMedicalPersonnel, int PersonID, int IDPerson, String FirstName, String MidleName, String Surname) {
        super(IDMedicalPersonnel, PersonID, IDPerson, FirstName, MidleName, Surname);
        this.IDDoctor = IDDoctor;
        this.MedicalPersonnelID = MedicalPersonnelID;
    }

    public Doctor(int IDDoctor, int MedicalPersonnelID) {
        this.IDDoctor = IDDoctor;
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

    @Override
    public String toString() {
        return "Doctor{" + "IDDoctor=" + IDDoctor + ", MedicalPersonnelID=" + MedicalPersonnelID + '}';
    }
    
}
