public class Main {
    public static void main(String[] args) {
        int cost = 10039;
        int milesrule = 20;
        int bonus = cost / milesrule;
        if ((bonus * milesrule) > cost) {
            System.out.println(bonus - 1);
        }
        System.out.println("Ваш бонус:");
        System.out.println(bonus);
        System.out.println("руб.");
    }
}