public class CommitCafe {

<<<<<<< HEAD
    private static String barista = "Aaron"; 
    private static String nickname = "Senior barista";
=======
    private static String barista = "John"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
>>>>>>> main

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
