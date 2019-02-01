package BL;

import MODEL.MedicalPersonnel.*;
import java.util.List;

/**
 *
 * @author Karlo
 */
public class MedicalPersonnelHandler extends HandlerBase{
    
    public MedicalPersonnel getMedicalPersonnel(int IDMedicalPersonnel){
        return repo.getMedicalPersonnel(IDMedicalPersonnel);
    }
    public Doctor getDoctor(int IDDoctor){
        return repo.getDoctor(IDDoctor);
    }
    public List<Doctor> getAllDoctors(){
        return repo.getAllDoctors();
    }
    public SpecialistConsultant getSpecialistConsultant(int IDSpecialistConsultant){
        return repo.getSpecialistConsultant(IDSpecialistConsultant);
    }
}
