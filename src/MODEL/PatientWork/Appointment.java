package MODEL.PatientWork;

import java.sql.Date;


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
    

    public Appointment(int IDAppointment, int PatientID, Date AppointmentDate) {
        this.IDAppointment = IDAppointment;
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

    @Override
    public String toString() {
        return "Appointment{" + "AppointmentDate=" + AppointmentDate + '}';
    }
    
}
