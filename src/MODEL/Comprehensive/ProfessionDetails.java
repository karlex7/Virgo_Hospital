package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class ProfessionDetails {
    private int IDProfessionDetails;
    private String Occupation;
    private int GrossAnnualIncome;

    public ProfessionDetails(String Occupation, int GrossAnnualIncome) {
        this.Occupation = Occupation;
        this.GrossAnnualIncome = GrossAnnualIncome;
    }
    public int getIDProfessionDetails(){
        return IDProfessionDetails;
    }
    public String getOccupation(){
        return Occupation;
    }
    public int getGrossAnnualIncome(){
        return GrossAnnualIncome;
    }
    public void setIDProfessionDetails(int id){
        IDProfessionDetails=id;
    }
}
