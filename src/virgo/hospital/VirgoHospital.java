/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virgo.hospital;

import BL.PatientsHandler;
import DAL.SqlRepo;
import MODEL.Patient.Patient;
import MODEL.Patient.Person;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class VirgoHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Patient p=new Patient("M", new Date(0, 0, 0), 1, "Jurica", null, "Juric");
        //SqlRepo s=new SqlRepo();
        //System.out.println(s.getPatient(1));
        PatientsHandler patientsHandler=new PatientsHandler();
        //System.out.println(patientsHandler.getPatient(1));
        //patientsHandler.insertPatient(new Patient("M", new Date(1,03,02), 1, "Filip", null, "Filipovic"));
        List<Patient> list=patientsHandler.getPatientsByDoctor(1);
        for (Patient p : list) {
            System.out.println(p);
        }
    }
    
}
