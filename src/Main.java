public class Main {
    public static void main(String[] args) {
        int cost = 10039;
        int milesRule = 20;
        int bonus = cost / milesRule;
        if ((bonus * milesRule) > cost) {
            System.out.println(bonus - 1);
        }
        System.out.println("Ваш бонус:");
        System.out.println(bonus);
        System.out.println("руб.");
    }
}