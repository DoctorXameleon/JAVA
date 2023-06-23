import java.util.List;
import java.util.Scanner;

public class Main {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введіть місяць (число від 1 до 12): ");
         int month = scanner.nextInt();

         List<Student> students = ShowStudents.getStudentData("SELECT * FROM students WHERE MONTH(birthday) = " + month);
         for (Student student : students) {
             System.out.println(student.toString());
         }
     }
}
