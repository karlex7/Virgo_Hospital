package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class Consulting {
    private int IDConsulting;
    private String ConsultingName;
    private int SpecialistConsultantID;
    private char Cost;

    public Consulting(String ConsultingName, int SpecialistConsultantID, char Cost) {
        this.ConsultingName = ConsultingName;
        this.SpecialistConsultantID = SpecialistConsultantID;
        this.Cost = Cost;
    }
    public int getIDConsulting(){
        return IDConsulting;
    }
    public String getConsultingName(){
        return ConsultingName;
    }
    public int getSpecialistConsultantID(){
        return SpecialistConsultantID;
    }
    public char getCost(){
        return Cost;
    }
    public void setIDConsulting(int id){
        IDConsulting=id;
    }
}
