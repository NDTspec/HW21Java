public class Main {
    public static void main(String[] args) {
        int cost = 10039;
        int MilesRule = 20;
        int bonus = cost / MilesRule;
        if ((bonus * MilesRule) > cost) {
            System.out.println(bonus - 1);
        }
        System.out.println(bonus);
    }
}