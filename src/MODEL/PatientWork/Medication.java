package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class Medication {
    private int IDMedication;
    private String MedicationName;
    private int Cost;

    public Medication(String MedicationName, int Cost) {
        this.MedicationName = MedicationName;
        this.Cost = Cost;
    }
    public int getIDMedication(){
        return IDMedication;
    }
    public String getMedicationName(){
        return MedicationName;
    }
    public int getCost(){
        return Cost;
    }
    public void setIDMedication(int id){
        IDMedication=id;
    }
}
