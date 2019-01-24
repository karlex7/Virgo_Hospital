package MODEL;

/**
 *
 * @author Karlo
 */
public class Person {
    private int ID;
    private String FirstName;
    private String MidleName;
    private String Surname;
    
    public Person(String firstname,String midlename,String surname){
        FirstName=firstname;
        MidleName=midlename;
        Surname=surname;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    public String getMidleName(){
        return MidleName;
    }
    public String getSurname(){
        return Surname;
    }
}
