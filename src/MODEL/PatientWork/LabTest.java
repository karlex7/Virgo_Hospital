package MODEL.PatientWork;

/**
 *
 * @author Karlo
 */
public class LabTest {
    private int IDLabTest;
    private String LabTestName;
    private int Cost;

    public LabTest(String LabTestName, int Cost) {
        this.LabTestName = LabTestName;
        this.Cost = Cost;
    }
    public int getIDLabTest(){
        return IDLabTest;
    }
    public String getLabTestName(){
        return LabTestName;
    }
    public int getCost(){
        return Cost;
    }
    public void setIDLabTest(int id){
        IDLabTest=id;
    }
}
