package MODEL.PatientWork;

import java.util.Date;

/**
 *
 * @author Karlo
 */
public class Appointment {
    private int IDAppointment;
    private int PatientID;
    private Date AppointmentDate;

    public Appointment(int PatientID, Date AppointmentDate) {
        this.PatientID = PatientID;
        this.AppointmentDate = AppointmentDate;
    }
    public int getIDAppointment(){
        return IDAppointment;
    }
    public int getPatientID(){
        return PatientID;
    }
    public Date getAppointmentDate(){
        return AppointmentDate;
    }
    public void setIDAppointment(int id){
        IDAppointment=id;
    }
}
