package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class Diagnose {
    private int IDDiagnose;
    private int PatientID;
    private String Note;

    public Diagnose(int PatientID, String Note) {
        this.PatientID = PatientID;
        this.Note = Note;
    }
    public int getIDDiagnose(){
        return IDDiagnose;
    }
    public int getPatientID(){
        return PatientID;
    }
    public String getNote(){
        return Note;
    }
    public void setIDDiagnose(int id){
        IDDiagnose=id;
    }
}
