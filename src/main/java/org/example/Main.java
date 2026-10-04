package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
               StudentDAO dao = new StudentDAO();
               Scanner sc = new Scanner(System.in);

               while (true) {
                   System.out.println("\n--- Student Management ---");
                   System.out.println("1. Add student");
                   System.out.println("2. View all students");
                   System.out.println("3. Update course");
                   System.out.println("4. Delete student");
                   System.out.println("5. Exit");
                   System.out.print("Choose: ");
                   int choice = sc.nextInt();
                   sc.nextLine();

                   switch (choice) {
                       case 1 -> {
                           System.out.print("Name: ");
                           String name = sc.nextLine();
                           System.out.print("Email: ");
                           String email = sc.nextLine();
                           System.out.print("Course: ");
                           String course = sc.nextLine();
                           dao.addStudent(name, email, course);
                       }
                       case 2 -> {
                           for (Student s : dao.getAllStudents()) {
                               System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getCourse());
                           }
                       }
                       case 3 -> {
                           System.out.print("Student id: ");
                           int id = sc.nextInt();
                           sc.nextLine();
                           System.out.print("New course: ");
                           dao.updateCourse(id, sc.nextLine());
                       }
                       case 4 -> {
                           System.out.print("Student id: ");
                           dao.deleteStudent(sc.nextInt());
                       }
                       case 5 -> {
                           System.out.println("Bye!");
                           return;
                       }
                       default -> System.out.println("Please choose 1 to 5.");
                   }
               }
           }
       }
