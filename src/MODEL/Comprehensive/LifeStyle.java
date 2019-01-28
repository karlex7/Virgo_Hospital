package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class LifeStyle {
    private int IDLifeStyle;
    private boolean Vegetarian;
    private boolean Smoker;
    private boolean ConsumeAlcohol;
    private boolean UseStimulants;
    private int ConsumptionOfCoffeTeaPerDay;
    private int ConsumptionOfSoftDrinksPerDay;
    private boolean RegularMeals;
    private boolean EatHomePredominantly;
    private int CigaretsPerDay;
    private int DrinksPerDay;

    public LifeStyle(int IDLifeStyle, boolean Vegetarian, boolean Smoker, boolean ConsumeAlcohol, boolean UseStimulants, int ConsumptionOfCoffeTeaPerDay, int ConsumptionOfSoftDrinksPerDay, boolean RegularMeals, boolean EatHomePredominantly, int CigaretsPerDay, int DrinksPerDay) {
        this.IDLifeStyle = IDLifeStyle;
        this.Vegetarian = Vegetarian;
        this.Smoker = Smoker;
        this.ConsumeAlcohol = ConsumeAlcohol;
        this.UseStimulants = UseStimulants;
        this.ConsumptionOfCoffeTeaPerDay = ConsumptionOfCoffeTeaPerDay;
        this.ConsumptionOfSoftDrinksPerDay = ConsumptionOfSoftDrinksPerDay;
        this.RegularMeals = RegularMeals;
        this.EatHomePredominantly = EatHomePredominantly;
        this.CigaretsPerDay = CigaretsPerDay;
        this.DrinksPerDay = DrinksPerDay;
    }

    public int getIDLifeStyle(){
        return IDLifeStyle;
    }
    
    public boolean getVegetarian(){
        return Vegetarian;
    }
    public boolean getSmoker(){
        return Smoker;
    }
    public boolean getConsumeAlcohol(){
        return ConsumeAlcohol;
    }
    public boolean getUseStimulants(){
        return UseStimulants;
    }
    public int getConsumptionOfCoffeTeaPerDay(){
        return ConsumptionOfCoffeTeaPerDay;
    }
    public int getConsumptionOfSoftDrinksPerDay(){
        return ConsumptionOfSoftDrinksPerDay;
    }
    public boolean getRegularMeals(){
        return RegularMeals;
    }
    public boolean getEatHomePredominantly(){
        return EatHomePredominantly;
    }
    public int getCigaretsPerDay(){
        return CigaretsPerDay;
    }
    public int getDrinksPerDay(){
        return DrinksPerDay;
    }
    public void setIDLifeStyle(int id){
        IDLifeStyle=id;
    }
}
