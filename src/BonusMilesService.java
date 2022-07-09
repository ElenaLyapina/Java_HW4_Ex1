public class BonusMilesService {

    public int calculate(int cost){
        int amountRubForMile = 20;

        int amountMile = cost / amountRubForMile;

        return amountMile;
    }
}
