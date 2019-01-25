package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class MedicationsPrescribed {
    private int IDMedicationsPrescribed;
    private int MedicationID;
    private int PatientID;
    private char Paid;

    public MedicationsPrescribed(int MedicationID, int PatientID, char Paid) {
        this.MedicationID = MedicationID;
        this.PatientID = PatientID;
        this.Paid = Paid;
    }
    public int getIDMedicationsPrescribed(){
        return IDMedicationsPrescribed;
    }
    public int getMedicationID(){
        return MedicationID;
    }
    public int getPatientID(){
        return PatientID;
    }
    public char getPaid(){
        return Paid;
    }
    public void setID(int id){
        IDMedicationsPrescribed=id;
    }
}
