package MODEL.MedicalPersonnel;

/**
 *
 * @author Karlo
 */
public class SpecialistConsultant extends MedicalPersonnel{
    private int IDSpecialistConsultant;
    private int MedicalPersonnelID;

    public SpecialistConsultant(int PersonID, String FirstName, String MidleName, String Surname) {
        super(PersonID, FirstName, MidleName, Surname);
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
