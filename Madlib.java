import java.util.Scanner;

class Madlib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get first, second, and third nouns
        System.out.println("Enter the first noun: ");
        String noun1 = scanner.nextLine();
        System.out.println("Enter the second noun: ");
        String noun2 = scanner.nextLine();
        System.out.println("Enter the third noun: ");
        String noun3 = scanner.nextLine();

        // Get the first, second and third verbs
        System.out.println("Enter the first verb: ");
        String verb1 = scanner.nextLine();
        System.out.println("Enter the second verb: ");
        String verb2 = scanner.nextLine();
        System.out.println("Enter the third verb: ");
        String verb3 = scanner.nextLine();

        //Get the first, second, and third adjectives
        System.out.println("Enter the first adjective: ");
        String adjective1 = scanner.nextLine();
        System.out.println("Enter the second adjective: ");
        String adjective2 = scanner.nextLine();
        System.out.println("Enter the third adjective: ");
        String adjective3 = scanner.nextLine();

        // Combine everything togheter into the final madlib
        System.out.println("Ayush livied in a " + noun1 + " which was filled with " + adjective1 + " " + noun2 + " which " + verb1 + " really fast. He also owned a " + noun3 + " which was " + adjective2 + " and " + adjective3 + " all the time. Ayush loves to " + verb2 + " and " + verb3);

    }
}