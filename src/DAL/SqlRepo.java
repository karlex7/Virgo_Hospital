/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import MODEL.Adress.*;
import MODEL.Comprehensive.*;
import MODEL.MedicalPersonnel.*;
import MODEL.Mini.*;
import MODEL.Patient.*;
import MODEL.PatientWork.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

/**
 *
 * @author Karlo
 */
public class SqlRepo implements IRepo{
    private static final String INSERT_PERSON = "{ CALL InsertPerson (?,?,?,?) }";
    private static final String INSERT_PATIENT= "{ CALL InsertPatient (?,?,?,?,?,?) }";
    private static final String INSERT_NEXT_OF_KIN= "{ CALL InsertNextOfKin (?,?,?,?,?) }";
    private static final String INSERT_MINI_REG_FORM= "{ CALL InsertMiniRegForm (?,?,?,?,?,?) }";
    private static final String INSERT_ADRESS= "{ CALL InsertAdress (?,?,?,?,?) }";
    private static final String INSERT_ELECTRONIC_CONTACT= "{ CALL InsertElectronicContact (?,?,?,?,?,?) }";
    private static final String INSERT_CONTACT_DETAILS= "{ CALL InsertContactDetails (?,?,?,?) }";
    private static final String INSERT_CONTACT_NEXT_OF_KIN= "{ CALL InsertContactNextOfKin (?,?,?,?) }";
    private static final String INSERT_PERSONAL_DETAILS= "{ CALL InsertPersonalDetails (?,?,?,?,?,?) }";
    private static final String INSERT_PROFESSION_DETAILS= "{ CALL InsertProfessionDetails (?,?,?) }";
    private static final String INSERT_LIFE_STYLE= "{ CALL InsertLifeStyle (?,?,?,?,?,?,?,?,?,?,?) }";
    private static final String INSERT_BASIC_COMPLAINTS= "{ CALL InsertBasicComplaints (?,?,?,?) }";
    private static final String INSERT_IMPORTANT_MEDICAL_COMPLAINTS= "{ CALL InsertImportantMedicalComplaints (?,?,?,?,?,?,?,?,?,?,?,?) }";
    private static final String INSERT_COMPREHENSIVE_REG_FORM= "{ CALL InsertComprehensiveRegistrationForm (?,?,?,?,?,?,?,?,?) }";
    private static final String INSERT_DIAGNOSE= "{ CALL InsertDiagnose (?,?,?) }";
    private static final String INSERT_LAB_TEST_RECOMMENDED= "{ CALL InsertLabTestRecommended (?,?,?) }";
    private static final String INSERT_MEDICATIONS_PRESCRIBED= "{ CALL InsertMedicationsPrescribed (?,?,?) }";
    private static final String INSERT_CONSULTING_RECOMMENDED= "{ CALL InsertConsultingRecommended (?,?,?) }";
    private static final String INSERT_APPOINTMENT= "{ CALL InsertAppointment (?,?,?) }";
    
    
    private static final String GET_PERSON = "{ CALL GetPerson (?) }";
    private static final String GET_PATIENT = "{ CALL GetPatient (?) }";
    private static final String GET_NEXT_OF_KIN = "{ CALL GetNextOfKin (?) }";
    private static final String GET_MINI_REG_FORM = "{ CALL GetMiniRegForm (?) }";
    private static final String GET_ADRESS = "{ CALL GetAdress (?) }";
    private static final String GET_STATE = "{ CALL GetStates (?) }";
    private static final String GET_CITY = "{ CALL GetCity (?) }";
    private static final String GET_STREET = "{ CALL GetStreet (?) }";
    private static final String GET_ELECTRONIC_CONTACT = "{ CALL GetElectronicContact (?) }";
    private static final String GET_CONTACT_DETAILS = "{ CALL GetContactDetails (?) }";
    private static final String GET_CONTACT_NEXT_OF_KIN = "{ CALL GetContactNextOfKin (?) }";
    private static final String GET_PERSONAL_DETAILS = "{ CALL GetPersonalDetails (?) }";
    private static final String GET_PROFESSION_DETAILS = "{ CALL GetProfessionDetails (?) }";
    private static final String GET_LIFE_STYLE = "{ CALL GetLifeStyle (?) }";
    private static final String GET_BASIC_COMPLAINTS = "{ CALL GetBasicComplaints (?) }";
    private static final String GET_IMPORTANT_MEDICAL_COMPLAINTS = "{ CALL GetImportantMedicalComplaints (?) }";
    private static final String GET_COMPREHENSIVE_REG_FOMR = "{ CALL GetComprehensiveRegForm (?) }";
    private static final String GET_ALL_DIAGNOSE = "{ CALL GetAllDiagnose (?) }";
    private static final String GET_ALL_LAB_TESTS = "{ CALL GetAllLabTests (?) }";
    private static final String GET_ALL_MEDICATIONS_PRESCRIBED = "{ CALL GetAllMedicationsPrescribed (?) }";
    private static final String GET_ALL_CONSULTING_RECOMMENDED = "{ CALL GetAllConsultingRecommended (?) }";
    private static final String GET_ALL_APPOINTMENTS = "{ CALL GetAllAppointments (?) }";
    private static final String GET_MEDICAL_PERSONNEL = "{ CALL GetMedicalPersonnel (?) }";
    private static final String GET_DOCTOR = "{ CALL GetDoctor (?) }";
    private static final String GET_SPECIALIST_CONSULTANT = "{ CALL GetSpecialistConsultant (?) }";
    private static final String GET_PATIENTS_BY_DOCTOR = "{ CALL GetPatientsByDoctor (?) }";
    private static final String GET_PATIENTS = "{ CALL GetPatients (?) }";
    private static final String GET_DIAGNOSE = "{ CALL GetDiagnose (?) }";
    private static final String GET_LAB_TEST_RECOMMENDED = "{ CALL GetLabTestRecommended (?) }";
    private static final String GET_MEDICATION_PRESCRIBED = "{ CALL GetMedicationPresciribed (?) }";
    private static final String GET_CONSULTING_RECOMMENDED = "{ CALL GetConsultiongRecommended (?) }";
    private static final String GET_APPOINTMENT = "{ CALL GetAppointment (?) }";
    private static final String GET_MEDICATION = "{ CALL GetMedication (?) }";
    private static final String GET_LAB_TEST = "{ CALL GetLabTest (?) }";
    private static final String GET_CONSULTING = "{ CALL GetConsulting (?) }";
    private static final String GET_ALL_MEDICATION = "{ CALL GetAllMedication }";
    private static final String GET_ALL_LAB_TEST = "{ CALL GetAllLabTest }";
    private static final String GET_ALL_CONSULTING = "{ CALL GetALLConsulting }";
    private static final String GET_ALL_STATES = "{ CALL GetAllStates }";
    private static final String GET_ALL_CITY = "{ CALL GetAllCity }";
    private static final String GET_ALL_STREET = "{ CALL GetAllStreet }";
    private static final String GET_CITYID_BY_NAME = "{ CALL GetCityIDByName (?) }";
    private static final String GET_STREETID_BY_NAME = "{ CALL GetStreetIDByName (?) }";
    private static final String GET_STATEID_BY_NAME = "{ CALL GetStateIDByName (?) }";
    private static final String GET_ALL_DOCTORS = "{ CALL GetAllDoctors }";
    
    private static final String ASSIGN_DOCTOR_TO_PATIENT = "{ CALL AsignDoctorToPatient (?),(?) }";
    private static final String PAY_LAB_TEST = "{ CALL PayLabTest (?) }";
    private static final String PAY_MEDICATION = "{ CALL PayMedication (?) }";
    private static final String PAY_CONSULTING = "{ CALL PayConsulting (?) }";
    
    
    
    
    
    @Override
    public int insertPerson(Person p) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_PERSON)) {
            stmt.setString(1,p.getFirstName());
            stmt.setString(2,p.getMidleName());
            stmt.setString(3,p.getSurname());
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(4);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertPatient(Patient p) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_PATIENT)) {
            stmt.setString(1,p.getFirstName());
            stmt.setString(2,p.getMidleName());
            stmt.setString(3,p.getSurname());
            stmt.setString(4,p.getSex());
            stmt.setDate(5,p.getBirthDate());
            stmt.registerOutParameter(6, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(6);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertNextOfKin(NextOfKin nextOfKin) {
    DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_NEXT_OF_KIN)) {
            stmt.setString(1,nextOfKin.getFirstName());
            stmt.setString(2,nextOfKin.getMidleName());
            stmt.setString(3,nextOfKin.getSurname());
            stmt.setString(4,nextOfKin.getRelationShip());
            stmt.registerOutParameter(5, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(5);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertMiniRegForm(MiniRegForm miniRegForm) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_MINI_REG_FORM)) {
            stmt.setDate(1,miniRegForm.getRegDate());
            stmt.setInt(2,miniRegForm.getPatientID());
            stmt.setString(3,miniRegForm.getBriefStatementOfComplaint());
            stmt.setString(4,miniRegForm.getContactTelephone());
            stmt.setInt(5,miniRegForm.getNextOfKinID());
            stmt.registerOutParameter(6, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(6);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertAdress(Adress adress) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_ADRESS)) {
            stmt.setInt(1,adress.getStateID());
            stmt.setInt(2,adress.getCityID());
            stmt.setInt(3,adress.getStreetID());
            stmt.setString(4,adress.getDoorNo());
            stmt.registerOutParameter(5, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(5);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertElectronicContact(ElectronicContact electronicContact) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_ELECTRONIC_CONTACT)) {
            stmt.setString(1,electronicContact.getTelephone());
            stmt.setString(2,electronicContact.getMobile());
            stmt.setString(3,electronicContact.getPager());
            stmt.setString(4,electronicContact.getFax());
            stmt.setString(5,electronicContact.getEmail());
            stmt.registerOutParameter(6, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(6);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertContactDetails(ContactDetails contactDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_CONTACT_DETAILS)) {
            stmt.setInt(1,contactDetails.getAdressPresentID());
            stmt.setInt(2,contactDetails.getAdressPermenantID());
            stmt.setInt(3,contactDetails.getElectronicContactID());
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(4);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertContactNextOfKin(ContactNextOfKin contactNextOfKin) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_CONTACT_NEXT_OF_KIN)) {
            stmt.setInt(1,contactNextOfKin.getNextOfKinID());
            stmt.setInt(2,contactNextOfKin.getAdressID());
            stmt.setInt(3,contactNextOfKin.getElectronicContactID());
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(4);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertPersonalDetails(PersonalDetails personalDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_PERSONAL_DETAILS)) {
            stmt.setBoolean(1,personalDetails.getMartialStatusID());
            stmt.setInt(2,personalDetails.getNoOfDependets());
            stmt.setInt(3,personalDetails.getHeightPerson());
            stmt.setInt(4,personalDetails.getWeightPerson());
            stmt.setString(5,personalDetails.getBloodTypeID());
            stmt.registerOutParameter(6, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(6);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertProfessionDetails(ProfessionDetails professionDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_PROFESSION_DETAILS)) {
            stmt.setString(1,professionDetails.getOccupation());
            stmt.setInt(2,professionDetails.getGrossAnnualIncome());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertLifeStyleDetails(LifeStyle lifeStyle) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_LIFE_STYLE)) {
            stmt.setBoolean(1,lifeStyle.getVegetarian());
            stmt.setBoolean(2,lifeStyle.getSmoker());
            stmt.setBoolean(3,lifeStyle.getConsumeAlcohol());
            stmt.setBoolean(4,lifeStyle.getUseStimulants());
            stmt.setInt(5,lifeStyle.getConsumptionOfCoffeTeaPerDay());
            stmt.setInt(6,lifeStyle.getConsumptionOfSoftDrinksPerDay());
            stmt.setBoolean(7,lifeStyle.getRegularMeals());
            stmt.setBoolean(8,lifeStyle.getEatHomePredominantly());
            stmt.setInt(9,lifeStyle.getCigaretsPerDay());
            stmt.setInt(10,lifeStyle.getDrinksPerDay());
            stmt.registerOutParameter(11, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(11);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertBasicDetails(BasicComplaints basicComplaints) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_BASIC_COMPLAINTS)) {
            stmt.setString(1,basicComplaints.getStateOfComplaints());
            stmt.setString(2,basicComplaints.getHistoryOfPreviouseTreatment());
            stmt.setString(3,basicComplaints.getHospitalLastTreated());
            stmt.registerOutParameter(4, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(4);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertImportantMedicalComplaints(ImportantMedicalComplaints importantMedicalComplaints) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_IMPORTANT_MEDICAL_COMPLAINTS)) {
            stmt.setBoolean(1,importantMedicalComplaints.getDiabetic());
            stmt.setBoolean(2,importantMedicalComplaints.getHypertensive());
            stmt.setBoolean(3,importantMedicalComplaints.getCardiacCondition());
            stmt.setBoolean(4,importantMedicalComplaints.getRespiratoryCondition());
            stmt.setBoolean(5,importantMedicalComplaints.getDigestiveCondition());
            stmt.setBoolean(6,importantMedicalComplaints.getOrthopedicCondition());
            stmt.setBoolean(7,importantMedicalComplaints.getMuscularCondition());
            stmt.setBoolean(8,importantMedicalComplaints.getNeurologicalCondition());
            stmt.setString(9,importantMedicalComplaints.getKnownAlergies());
            stmt.setString(10,importantMedicalComplaints.getKnownReactionToDrugs());
            stmt.setString(11,importantMedicalComplaints.getMajorSurgeries());
            stmt.registerOutParameter(12, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(12);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertComprehensiveRegForm(ComprehensiveRegistrationForm comprehensiveRegistrationForm) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_COMPREHENSIVE_REG_FORM)) {
            stmt.setInt(1,comprehensiveRegistrationForm.getPatientID());
            stmt.setInt(2,comprehensiveRegistrationForm.getContactDetailsID());
            stmt.setInt(3,comprehensiveRegistrationForm.getContactNextOfKinID());
            stmt.setInt(4,comprehensiveRegistrationForm.getPersonalDetailsID());
            stmt.setInt(5,comprehensiveRegistrationForm.getProfessionDetailsID());
            stmt.setInt(6,comprehensiveRegistrationForm.getLifeStyleID());
            stmt.setInt(7,comprehensiveRegistrationForm.getBasicComplaintsID());
            stmt.setInt(8,comprehensiveRegistrationForm.getImportantMedicalComplaintsID());
            stmt.registerOutParameter(9, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(9);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertDiagnose(Diagnose diagnose) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_DIAGNOSE)) {
            stmt.setInt(1,diagnose.getPatientID());
            stmt.setString(2,diagnose.getNote());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertLabTestRecommended(LabTestRecommended labTestRecommended) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_LAB_TEST_RECOMMENDED)) {
            stmt.setInt(1,labTestRecommended.getLabTestID());
            stmt.setInt(2,labTestRecommended.getPatientID());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertMedicationPrescribed(MedicationsPrescribed medicationsPrescribed) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_MEDICATIONS_PRESCRIBED)) {
            stmt.setInt(1,medicationsPrescribed.getMedicationID());
            stmt.setInt(2,medicationsPrescribed.getPatientID());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertConsultingRecommended(ConsultingRecommended consultingRecommended) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_CONSULTING_RECOMMENDED)) {
            stmt.setInt(1,consultingRecommended.getConsultingID());
            stmt.setInt(2,consultingRecommended.getPatientID());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public int insertAppointment(Appointment appointment) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con=dataSource.getConnection();
                CallableStatement stmt=con.prepareCall(INSERT_APPOINTMENT)) {
            stmt.setInt(1,appointment.getPatientID());
            stmt.setDate(2,appointment.getAppointmentDate());
            stmt.registerOutParameter(3, Types.INTEGER);
            
            stmt.executeUpdate();
            return stmt.getInt(3);
        } catch (SQLException ex) {
            Logger.getLogger(SqlRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    @Override
    public Person getPerson(int IDPerson) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PERSON)){
                stmt.setInt(1, IDPerson);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Person(
                                resultSet.getInt("IDPerson"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MidleName"),
                                resultSet.getString("Surname"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Patient getPatient(int IDPatient) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATIENT)){
                stmt.setInt(1, IDPatient);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Patient(
                                resultSet.getInt("IDPatient"),
                                resultSet.getInt("PersonID"),
                                resultSet.getString("Sex"),
                                resultSet.getDate("BirthDate"),
                                resultSet.getInt("DoctorID"),
                                resultSet.getInt("IDPerson"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MidleName"),
                                resultSet.getString("Surname"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public NextOfKin getNextOfKin(int IDNextOfKin) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_NEXT_OF_KIN)){
                stmt.setInt(1, IDNextOfKin);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new NextOfKin(
                                resultSet.getInt("IDNextOfKin"),
                                resultSet.getInt("PersonID"),
                                resultSet.getString("Relationship"),
                                resultSet.getInt("IDPerson"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MidleName"),
                                resultSet.getString("Surname"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MiniRegForm getMiniRegForm(int IDPatient) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MINI_REG_FORM)){
                stmt.setInt(1, IDPatient);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new MiniRegForm(
                                resultSet.getInt("IDMiniRegForm"),
                                resultSet.getDate("RegDate"),
                                resultSet.getInt("PatientID"), 
                                resultSet.getString("BriefStatementOfComplaint"),
                                resultSet.getString("ContactTelephone"),
                                resultSet.getInt("NextOfKinID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Adress getAdress(int IDAdress) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ADRESS)){
                stmt.setInt(1, IDAdress);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Adress(
                                resultSet.getInt("IDAdress"),
                                resultSet.getInt("StatesID"),
                                resultSet.getInt("CityID"),
                                resultSet.getInt("StreetID"),
                                resultSet.getString("DoorNo"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public States getStates(int IDStates) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_STATE)){
                stmt.setInt(1, IDStates);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new States(
                                resultSet.getInt("IDStates"),
                                resultSet.getString("StateName"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public City getCity(int IDCity) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CITY)){
                stmt.setInt(1, IDCity);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new City(
                                resultSet.getInt("IDCity"),
                                resultSet.getString("CityName"),
                                resultSet.getInt("StatesID"),
                                resultSet.getString("ZipCode"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Street getStreet(int IDStreet) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_STREET)){
                stmt.setInt(1, IDStreet);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Street(
                                resultSet.getInt("IDStreet"),
                                resultSet.getString("StreetName"),
                                resultSet.getInt("CityID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ElectronicContact getElectronicContact(int IDElectronicContact) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ELECTRONIC_CONTACT)){
                stmt.setInt(1, IDElectronicContact);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ElectronicContact(
                                resultSet.getInt("IDElectronicContact"),
                                resultSet.getString("Telephone"),
                                resultSet.getString("Mobile"),
                                resultSet.getString("Pager"),
                                resultSet.getString("Fax"),
                                resultSet.getString("Email"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ContactDetails getContactDetails(int IDContactDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CONTACT_DETAILS)){
                stmt.setInt(1, IDContactDetails);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ContactDetails(
                                resultSet.getInt("IDContactDetails"),
                                resultSet.getInt("AdressPresentID"),
                                resultSet.getInt("AdressPermanentID"),
                                resultSet.getInt("ElectronicContactID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public ContactNextOfKin getContactNextOfKin(int IDContactNextOfKin) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CONTACT_NEXT_OF_KIN)){
                stmt.setInt(1, IDContactNextOfKin);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ContactNextOfKin(
                                resultSet.getInt("IDContactNextOfKin"),
                                resultSet.getInt("NextOfKinID"),
                                resultSet.getInt("AdressID"),
                                resultSet.getInt("ElectronicContactID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public PersonalDetails getPersonalDetails(int IDPersonalDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PERSONAL_DETAILS)){
                stmt.setInt(1, IDPersonalDetails);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new PersonalDetails(
                                resultSet.getInt("IDPersonalDetails"),
                                resultSet.getBoolean("MartialStatus"),
                                resultSet.getInt("NoOfDependents"),
                                resultSet.getInt("HeightPerson"),
                                resultSet.getInt("WeightPerson"),
                                resultSet.getString("BloodType"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ProfessionDetails getProfessionDetails(int IDProfessionDetails) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PROFESSION_DETAILS)){
                stmt.setInt(1, IDProfessionDetails);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ProfessionDetails(
                                resultSet.getInt("IDProfessionDetails"),
                                resultSet.getString("Occupation"),
                                resultSet.getInt("GrossAnnualIncome"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public LifeStyle getLifeStyle(int IDLifeStyle) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_LIFE_STYLE)){
                stmt.setInt(1, IDLifeStyle);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new LifeStyle(
                                resultSet.getInt("IDLifeStyle"),
                                resultSet.getBoolean("Vegetarian"),
                                resultSet.getBoolean("Smoker"),
                                resultSet.getBoolean("ConsumeAlcohol"),
                                resultSet.getBoolean("UseStimulants"),
                                resultSet.getInt("ConsumptionOfCoffeTeaPerDay"),
                                resultSet.getInt("ConsumptionOfSoftDrinksPerDay"),
                                resultSet.getBoolean("RegularMeals"),
                                resultSet.getBoolean("EatHomePredominantly"),
                                resultSet.getInt("CigarettesPerDay"),
                                resultSet.getInt("DrinksPerDay"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public BasicComplaints getBasicComplaints(int IDBasicComplaints) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_BASIC_COMPLAINTS)){
                stmt.setInt(1, IDBasicComplaints);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new BasicComplaints(
                                resultSet.getInt("IDBasicComplaints"),
                                resultSet.getString("StateOfComplaint"),
                                resultSet.getString("HistoryOfPreviouseTreatment"),
                                resultSet.getString("HospitalLastTreated"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ImportantMedicalComplaints getImportantMedicalComplaints(int IDImportantMedicalComplaints) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_IMPORTANT_MEDICAL_COMPLAINTS)){
                stmt.setInt(1, IDImportantMedicalComplaints);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ImportantMedicalComplaints(
                                resultSet.getInt("IDImportantMedicalComplaints"),
                                resultSet.getBoolean("Diabetic"),
                                resultSet.getBoolean("Hypertensive"),
                                resultSet.getBoolean("CardiacCondition"),
                                resultSet.getBoolean("RespiratoryCondition"),
                                resultSet.getBoolean("DigestiveCondition"),
                                resultSet.getBoolean("OrthopedicCondition"),
                                resultSet.getBoolean("MuscularCondition"),
                                resultSet.getBoolean("NeurologicalCondition"),
                                resultSet.getString("KnownAlergies"),
                                resultSet.getString("KnownReactionToDrugs"),
                                resultSet.getString("MajorSurgeries"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ComprehensiveRegistrationForm getComprehensiveRegistrationForm(int IDComprehensiveRegistrationForm) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_COMPREHENSIVE_REG_FOMR)){
                stmt.setInt(1, IDComprehensiveRegistrationForm);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new ComprehensiveRegistrationForm(
                                resultSet.getInt("IDComprehensiveRegistrationForm"),
                                resultSet.getInt("PatientID"),
                                resultSet.getDate("RegDate"),
                                resultSet.getInt("ContactDetailsID"),
                                resultSet.getInt("ContactNextOfKinID"),
                                resultSet.getInt("PersonalDetailsID"),
                                resultSet.getInt("ProfessionDetailsID"),
                                resultSet.getInt("LifeStyleID"),
                                resultSet.getInt("BasicComplaintsID"),
                                resultSet.getInt("ImportantMedicalComplaintsID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public MedicalPersonnel getMedicalPersonnel(int IDMedicalPersonnel) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MEDICAL_PERSONNEL)){
                stmt.setInt(1, IDMedicalPersonnel);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new MedicalPersonnel(
                                resultSet.getInt("IDMedicalPersonnel"),
                                resultSet.getInt("PersonID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public Doctor getDoctor(int IDDoctor) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DOCTOR)){
                stmt.setInt(1, IDDoctor);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getInt("MedicalPersonnelID"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public SpecialistConsultant getSpecialistConsultant(int IDScepicalistConsultant) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_SPECIALIST_CONSULTANT)){
                stmt.setInt(1, IDScepicalistConsultant);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new SpecialistConsultant(
                                resultSet.getInt("IDSpecialistConsultant"),
                                resultSet.getInt("MedicalPersonnelID"),
                                resultSet.getInt("IDMedicalPersonnel"),
                                resultSet.getInt("PersonID"),
                                resultSet.getInt("IDPerson"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MidleName"),
                                resultSet.getString("Surname"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Patient> getPatientsByDoctor(int DoctorID) {
        List<Patient> patients = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_PATIENTS_BY_DOCTOR)) {
            stmt.setInt(1, DoctorID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    patients.add(
                            new Patient(
                                resultSet.getInt("IDPatient"),
                                resultSet.getInt("PersonID"),
                                resultSet.getString("Sex"),
                                resultSet.getDate("BirthDate"),
                                resultSet.getInt("DoctorID"),
                                resultSet.getInt("IDPerson"),
                                resultSet.getString("FirstName"), 
                                resultSet.getString("MidleName"),
                                resultSet.getString("Surname")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return patients;
    }

    @Override
    public List<Diagnose> getDiagnosesForPatient(int PatientID) {
        List<Diagnose> diagnoses = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_DIAGNOSE)) {
            stmt.setInt(1, PatientID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    diagnoses.add(
                            new Diagnose(
                                resultSet.getInt("IDDiagnose"),
                                resultSet.getInt("PatientID"),
                                resultSet.getString("Note")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return diagnoses;
    }
    

    @Override
    public List<LabTestRecommended> getLabTestRecommendedsForPatient(int PatientID) {
        List<LabTestRecommended> labTestRecommendeds = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_LAB_TESTS)) {
            stmt.setInt(1, PatientID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    labTestRecommendeds.add(
                            new LabTestRecommended(
                                resultSet.getInt("IDLabtestRecommended"),
                                resultSet.getInt("LabTestID"),
                                resultSet.getInt("PatientID"),
                                resultSet.getBoolean("Paid")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return labTestRecommendeds;
    }

    
    @Override
    public List<MedicationsPrescribed> getMedicationsPrescribedsForPatient(int PatientID) {
        List<MedicationsPrescribed> medicationsPrescribeds = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_MEDICATIONS_PRESCRIBED)) {
            stmt.setInt(1, PatientID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    medicationsPrescribeds.add(
                            new MedicationsPrescribed(
                                resultSet.getInt("IDMedicationsPrescribed"),
                                resultSet.getInt("MedicationID"),
                                resultSet.getInt("PatientID"),
                                resultSet.getBoolean("Paid")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return medicationsPrescribeds;
    }
    
    

    @Override
    public List<ConsultingRecommended> getConsultingRecommendedsForPatient(int PatientID) {
        List<ConsultingRecommended> consultingRecommendeds = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_CONSULTING_RECOMMENDED)) {
            stmt.setInt(1, PatientID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    consultingRecommendeds.add(
                            new ConsultingRecommended(
                                resultSet.getInt("IDConsultingRecommended"),
                                resultSet.getInt("ConsultingID"),
                                resultSet.getInt("PatientID"),
                                resultSet.getBoolean("Paid")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return consultingRecommendeds;
    }
    
    @Override
    public List<Appointment> getAppointmentsForPatient(int PatientID) {
        List<Appointment> appointments = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_APPOINTMENTS)) {
            stmt.setInt(1, PatientID);
           try(ResultSet resultSet = stmt.executeQuery()) {
                while (resultSet.next()) {
                    appointments.add(
                            new Appointment(
                                resultSet.getInt("IDAppointment"),
                                resultSet.getInt("PatientID"),
                                resultSet.getDate("AppointmentDate")));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
        return appointments;
    }
    
    

    @Override
    public List<Medication> getMedications() {
        List<Medication> medications = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_MEDICATION);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        medications.add(
                                new Medication(
                                resultSet.getInt("IDMedication"),
                                resultSet.getString("MedicationName"),
                                resultSet.getInt("Cost")));
                    }
            return medications;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medications;
    }

    @Override
    public List<LabTest> getLabTests() {
        List<LabTest> labTests = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_LAB_TEST);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        labTests.add(
                                new LabTest(
                                resultSet.getInt("IDLabTest"),
                                resultSet.getString("LabTestName"),
                                resultSet.getInt("Cost")));
                    }
            return labTests;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return labTests;
    }

    @Override
    public List<Consulting> getConsultings() {
        List<Consulting> consultings = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_CONSULTING);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        consultings.add(
                                new Consulting(
                                resultSet.getInt("IDConsulting"),
                                resultSet.getString("ConsultingName"),
                                resultSet.getInt("SpecialistConsultantID"),
                                resultSet.getInt("Cost")));
                    }
            return consultings;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return consultings;
    }

    @Override
    public void asignDoctorToPatient(int PatientID, int DoctorID) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(ASSIGN_DOCTOR_TO_PATIENT)) {
            stmt.setInt(1, PatientID);
            stmt.setInt(2, DoctorID);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public void payLabTest(int LabTestRecommended) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(PAY_LAB_TEST)) {
            stmt.setInt(1, LabTestRecommended);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public void payMedication(int MedicationPrescribed) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(PAY_MEDICATION)) {
            stmt.setInt(1, MedicationPrescribed);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public void payConsulting(int ConsultingRecommended) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try(Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(PAY_CONSULTING)) {
            stmt.setInt(1, ConsultingRecommended);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }

    @Override
    public LabTest getLabTest(int IDLabtest) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_LAB_TEST)){
                stmt.setInt(1, IDLabtest);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new LabTest(
                                resultSet.getInt("IDLabTest"),
                                resultSet.getString("LabTestName"),
                                resultSet.getInt("Cost"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Medication getMedication(int IDMedication) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_MEDICATION)){
                stmt.setInt(1, IDMedication);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Medication(
                                resultSet.getInt("IDMedication"),
                                resultSet.getString("MedicationName"),
                                resultSet.getInt("Cost"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Consulting getConsulting(int IDConsulting) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CONSULTING)){
                stmt.setInt(1, IDConsulting);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Consulting(
                                resultSet.getInt("IDConsulting"),
                                resultSet.getString("ConsultingName"),
                                resultSet.getInt("SpecialistConsultantID"),
                                resultSet.getInt("Cost"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Appointment getAppointment(int IDAppointment) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_APPOINTMENT)){
                stmt.setInt(1, IDAppointment);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Appointment(
                                resultSet.getInt("IDAppointment"),
                                resultSet.getInt("PatientID"),
                                resultSet.getDate("AppointmentDate"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Diagnose getDiagnose(int IDDiagnose) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_DIAGNOSE)){
                stmt.setInt(1, IDDiagnose);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Diagnose(
                                resultSet.getInt("IDDiagnose"),
                                resultSet.getInt("PatientID"),
                                resultSet.getString("Note"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<States> getAllStateses() {
        List<States> states = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_STATES);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        states.add(
                                new States(
                                resultSet.getInt("IDStates"),
                                resultSet.getString("StateName")));
                    }
            return states;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return states;
    }

    @Override
    public List<City> getAllCity() {
        List<City> citys = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_CITY);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        citys.add(
                                new City(
                                resultSet.getInt("IDCity"),
                                resultSet.getString("CityName"),
                                resultSet.getInt("StatesID"),
                                resultSet.getString("ZipCode")));
                    }
            return citys;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return citys;
    }

    @Override
    public List<Street> getAllStreets() {
        List<Street> streets = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_STREET);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        streets.add(
                                new Street(
                                resultSet.getInt("IDStreet"),
                                resultSet.getString("StreetName"),
                                resultSet.getInt("CityID")));
                    }
            return streets;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return streets;
    }

    @Override
    public int getCityIdByName(String CityName) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_CITYID_BY_NAME)){
                stmt.setString(1, CityName);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Integer(resultSet.getInt("IDCity"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int getStreetIdByName(String StreetName) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_STREETID_BY_NAME)){
                stmt.setString(1, StreetName);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Integer(resultSet.getInt("IDStreet"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int getStateIdByName(String StateName) {
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_STATEID_BY_NAME)){
                stmt.setString(1, StateName);
            try(ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    return new Integer(resultSet.getInt("IDStates"));
                }
            }   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        List<Doctor> doctors = new ArrayList<>();
        DataSource dataSource = (DataSource) SQLConnection.getInstance();
        try (Connection con = dataSource.getConnection();
                CallableStatement stmt = con.prepareCall(GET_ALL_DOCTORS);
                ResultSet resultSet = stmt.executeQuery()){
                    while (resultSet.next()) {
                        doctors.add(
                                new Doctor(
                                resultSet.getInt("IDDoctor"),
                                resultSet.getInt("MedicalPersonnelID")));
                    }
            return doctors;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

    

    

    

    
    
}
