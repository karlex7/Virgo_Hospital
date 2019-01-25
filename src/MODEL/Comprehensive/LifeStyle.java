package MODEL.Comprehensive;

/**
 *
 * @author Karlo
 */
public class LifeStyle {
    private int IDLifeStyle;
    private char Vegetarian;
    private char Smoker;
    private char ConsumeAlcohol;
    private char UseStimulants;
    private int ConsumptionOfCoffeTeaPerDay;
    private int ConsumptionOfSoftDrinksPerDay;
    private char RegularMeals;
    private char EatHomePredominantly;
    private int CigaretsPerDay;
    private int DrinksPerDay;

    public LifeStyle(char Vegetarian, char Smoker, char ConsumeAlcohol, char UseStimulants, int ConsumptionOfCoffeTeaPerDay, int ConsumptionOfSoftDrinksPerDay, char RegularMeals, char EatHomePredominantly, int CigaretsPerDay, int DrinksPerDay) {
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
    
    public char getVegetarian(){
        return Vegetarian;
    }
    public char getSmoker(){
        return Smoker;
    }
    public char getConsumeAlcohol(){
        return ConsumeAlcohol;
    }
    public char getUseStimulants(){
        return UseStimulants;
    }
    public int getConsumptionOfCoffeTeaPerDay(){
        return ConsumptionOfCoffeTeaPerDay;
    }
    public int getConsumptionOfSoftDrinksPerDay(){
        return ConsumptionOfSoftDrinksPerDay;
    }
    public char getRegularMeals(){
        return RegularMeals;
    }
    public char getEatHomePredominantly(){
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
