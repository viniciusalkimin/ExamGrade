import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class NotesExam {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Enter the name of student:");
		student.name = sc.nextLine();

		System.out.println();
		System.out.print("Grade1:");
		student.grade1 = sc.nextDouble();
		System.out.println();
		System.out.print("Grade 2:");
		student.grade2 = sc.nextDouble();
		System.out.println();
		System.out.print("Grade 3:");
		student.grade3 = sc.nextDouble();

		System.out.println();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

		if (student.finalGrade() > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Failed");
			System.out.printf("Missing : %.2f Points.%n", student.missingPoints());
		}
		sc.close();
	}
}
