package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class ConsultingRecommended {
    private int IDConsultingRecommended;
    private int ConsultingID;
    private int PatientID;
    private char Paid;

    public ConsultingRecommended(int ConsultingID, int PatientID, char Paid) {
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
    public char getPaid(){
        return Paid;
    }
    public void setIDConsultingRecommended(int id){
        IDConsultingRecommended=id;
    }
}
