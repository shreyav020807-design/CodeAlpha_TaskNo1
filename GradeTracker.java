import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("=== Student Grade Tracker ===");
        while (true) {
            System.out.print("Enter a student grade (or type -1 to finish): ");
            double input = scanner.nextDouble();
            
            // Check for exit condition
            if (input == -1) {
                break;
            }
            
            // Validate grade bounds before adding
            if (input < 0 || input > 100) {
                System.out.println("Invalid entry. Please enter a grade between 0 and 100.");
            } else {
                grades.add(input);
            }
        }
        if (grades.isEmpty()) {
            System.out.println("No grades were entered. Exiting program.");
            scanner.close();
            return;
        }
        // Calculate Summary Statistics
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);

        // Display Summary Report
        System.out.println("\n===== SUMMARY REPORT =====");
        System.out.println("Total Students Tracked: " + grades.size());
        System.out.printf("Average Score:          %.2f\n", average);
        System.out.println("Highest Score:          " + highest);
        System.out.println("Lowest Score:           " + lowest);
        System.out.println("==========================");
        
        scanner.close();
    }
}
