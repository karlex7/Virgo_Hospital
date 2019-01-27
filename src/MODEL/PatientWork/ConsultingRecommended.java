package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class ConsultingRecommended {
    private int IDConsultingRecommended;
    private int ConsultingID;
    private int PatientID;
    private boolean Paid;

    public ConsultingRecommended(int ConsultingID, int PatientID, boolean Paid) {
        this.ConsultingID = ConsultingID;
        this.PatientID = PatientID;
        this.Paid = Paid;
    }
    public int getIDConsultingRecommended(){
        return IDConsultingRecommended;
    }
    public int getConsultingID(){
        return ConsultingID;
    }
    public int getPatientID(){
        return PatientID;
    }
    public boolean getPaid(){
        return Paid;
    }
    public void setIDConsultingRecommended(int id){
        IDConsultingRecommended=id;
    }
}
