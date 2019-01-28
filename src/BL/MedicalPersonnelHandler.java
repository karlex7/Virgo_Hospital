package BL;

import MODEL.MedicalPersonnel.*;

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
    public SpecialistConsultant getSpecialistConsultant(int IDSpecialistConsultant){
        return repo.getSpecialistConsultant(IDSpecialistConsultant);
    }
}
