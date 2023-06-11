import java.util.Scanner;
public class StudentGradeCalculator {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double total = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the grade for subject " + i + ": ");
            double grade = scanner.nextDouble();
            total += grade;
        }

        double average = total / numSubjects;
        System.out.println("Average grade: " + average);

        scanner.close();
    }
}









