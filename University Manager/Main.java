import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        String choice;

        do {
            System.out.println("Enter your full name:");
            String name = input.nextLine();

            System.out.println("Enter your age:");
            int age = input.nextInt();

            System.out.println("Enter your GPA:");
            double gpa = input.nextDouble();
            input.nextLine();

            Student student = new Student(name, age, gpa);
            students.add(student);

            System.out.println("Do you want to add another student? (y/n):");
            choice = input.nextLine();

        } while(choice.equalsIgnoreCase("y"));

        System.out.println("\n===== All Students =====");
        for (Student s : students) {
            System.out.println(s);
            if(s.isPassed()) {
                System.out.println("✅ Passed");
            } else {
                System.out.println("❌ Failed");
            }
            System.out.println("----------------------------");
        }

        input.close();
    }
}
