package MODEL.Patient;

/**
 *
 * @author Karlo
 */
public class Person {
    private int IDPerson;
    private String FirstName;
    private String MidleName;
    private String Surname;

    public Person() {
    }

    public Person(String FirstName, String MidleName, String Surname) {
        this.FirstName = FirstName;
        this.MidleName = MidleName;
        this.Surname = Surname;
    }
    

    public Person(int IDPerson, String FirstName, String MidleName, String Surname) {
        this.IDPerson = IDPerson;
        this.FirstName = FirstName;
        this.MidleName = MidleName;
        this.Surname = Surname;
    }

    
    public int getIDPerson(){
        return IDPerson;
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
    public void setIDPerson(int id){
        IDPerson=id;
    }

    @Override
    public String toString() {
        return "Person{" + "FirstName=" + FirstName + ", MidleName=" + MidleName + ", Surname=" + Surname + '}';
    }
    
}
