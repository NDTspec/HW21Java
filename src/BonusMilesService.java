public class BonusMilesService {
    public int calculate(int price) {
        int milesRule = 20;
        int bonus = price / milesRule;
        int calculate;
        if ((bonus * milesRule) > price) {
            return calculate = bonus - 1;
        } else {
            return calculate = bonus;
        }
    }

}
