package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class MedicationsPrescribed {
    private int IDMedicationsPrescribed;
    private int MedicationID;
    private int PatientID;
    private boolean Paid;

    public MedicationsPrescribed(int IDMedicationsPrescribed, int MedicationID, int PatientID, boolean Paid) {
        this.IDMedicationsPrescribed = IDMedicationsPrescribed;
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
    public boolean getPaid(){
        return Paid;
    }
    public void setID(int id){
        IDMedicationsPrescribed=id;
    }
}
