package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class Consulting {
    private int IDConsulting;
    private String ConsultingName;
    private int SpecialistConsultantID;
    private int Cost;
    
    public Consulting(int IDConsulting, String ConsultingName, int SpecialistConsultantID, int Cost) {
        this.IDConsulting = IDConsulting;
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
    public int getCost(){
        return Cost;
    }
    public void setIDConsulting(int id){
        IDConsulting=id;
    }

    @Override
    public String toString() {
        return "Consulting{" + "ConsultingName=" + ConsultingName + ", Cost=" + Cost + '}';
    }
    
}
