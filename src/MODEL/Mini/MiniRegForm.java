package MODEL.Mini;

import java.sql.Date;


/**
 *
 * @author Karlo
 */
public class MiniRegForm {
    private int IDMiniRegForm;
    private Date RegDate;
    private int PatientID;
    private String BriefStatementOfComplaint;
    private String ContactTelephone;
    private int NextOfKinID;

    public MiniRegForm(Date RegDate, int PatientID, String BriefStatementOfComplaint, String ContactTelephone, int NextOfKinID) {
        this.RegDate = RegDate;
        this.PatientID = PatientID;
        this.BriefStatementOfComplaint = BriefStatementOfComplaint;
        this.ContactTelephone = ContactTelephone;
        this.NextOfKinID = NextOfKinID;
    }
    public int getIDMiniRegForm(){
        return IDMiniRegForm;
    }
    public Date getRegDate(){
        return RegDate;
    }
    public int getPatientID(){
        return PatientID;
    }
    public String getBriefStatementOfComplaint(){
        return BriefStatementOfComplaint;
    }
    public String getContactTelephone(){
        return ContactTelephone;
    }
    public int getNextOfKinID(){
        return NextOfKinID;
    }
    public void setIDMiniRegForm(int id){
        IDMiniRegForm=id;
    }
}
