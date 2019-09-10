import java.util.Scanner;

public class AverageScore {
    public static void main(String [] args) {
        int numStudents = 3;
        int sumTotal = 0;
        int userInt;
        double average;
        String userInput;
        Scanner key = new Scanner(System.in);

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grades: ");
            userInput = key.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.exit(0);
            }
            else {
                userInt = Integer.parseInt(userInput);
                sumTotal += userInt;
                // need to put in an error condition if the input
                // in not an integer
            }
        }

        average = sumTotal / numStudents;
        System.out.println("The average is: " + average);

    }
}
