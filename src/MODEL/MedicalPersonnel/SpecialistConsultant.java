package MODEL.MedicalPersonnel;

/**
 *
 * @author Karlo
 */
public class SpecialistConsultant extends MedicalPersonnel{
    private int IDSpecialistConsultant;
    private int MedicalPersonnelID;

    public SpecialistConsultant(int IDSpecialistConsultant, int MedicalPersonnelID, int IDMedicalPersonnel, int PersonID, int IDPerson, String FirstName, String MidleName, String Surname) {
        super(IDMedicalPersonnel, PersonID, IDPerson, FirstName, MidleName, Surname);
        this.IDSpecialistConsultant = IDSpecialistConsultant;
        this.MedicalPersonnelID = MedicalPersonnelID;
    }

    public int getIDSpecialistConsultant(){
        return IDSpecialistConsultant;
    }
    public int getMedicalPersonnelID(){
        return MedicalPersonnelID;
    }
    public void setIDSpecialistConsultant(int id){
        IDSpecialistConsultant=id;
    }
}
