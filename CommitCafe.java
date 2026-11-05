public class CommitCafe {

    private static String barista = "Aaron"; 
    private static String nickname = "Senior barista";

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println("There are " + cups + "cups.");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}