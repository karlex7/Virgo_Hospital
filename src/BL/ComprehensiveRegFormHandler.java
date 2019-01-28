package BL;

import MODEL.Comprehensive.ComprehensiveRegistrationForm;

/**
 *
 * @author Karlo
 */
public class ComprehensiveRegFormHandler extends HandlerBase{

    public void insertComprehensiveRegForm(ComprehensiveRegistrationForm comprehensiveRegistrationForm){
        repo.insertComprehensiveRegForm(comprehensiveRegistrationForm);
    }
    public ComprehensiveRegistrationForm getComprehensiveRegistrationForm(int IDComprehensiveRegForm){
        return repo.getComprehensiveRegistrationForm(IDComprehensiveRegForm);
    }
}
