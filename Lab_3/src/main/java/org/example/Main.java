package org.example;
import org.example.Controllers.*;
import org.example.Models.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public University createTypicalUniversity()
    {
        University university = new University();
        UniversityCreator universityCreator = new UniversityCreator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Бажаєте створити університет за замовчуванням? (Так/Ні): ");

        String method = scanner.nextLine();

        if (Objects.equals(method, "Так")) {
            university = universityCreator.createDefaultUniversity();

        } else if (Objects.equals(method, "Ні")) {
            Collection<Student> students = createStudents(universityCreator);
            Collection<Group> groups = new ArrayList<Group>();
            Collection<Department> departments = new ArrayList<Department>();
            Collection<Faculty> faculties = new ArrayList<Faculty>();
            Group testGroup1, testGroup2 = new Group();
            testGroup1 = universityCreator.createGroup("124-20-1", getHead(), students);
            testGroup2 = universityCreator.createGroup("124-20-2", getHead(), students);
            groups.add(testGroup1);
            groups.add(testGroup2);

            Department department = universityCreator.createDepartment("Кафедра системного аналізу та управління", getHead(), groups);
            departments.add(department);

            Faculty faculty = universityCreator.createFaculty("ФІТ", getHead(), departments);
            faculties.add(faculty);

            university = universityCreator.createUniversity("НТУ 'Дніпровська політехніка'", getHead(), faculties);
        }
        else {
            System.out.println("Помилка. Потрібно обрати 'так' або 'ні'");
        }

        return university;

    }
    private Human createHuman() {
        System.out.println("Введіть інформацію про людину: Ім'я, Прізвище, Ім'я по-батькові, Стать (1/2) ");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String fatherName = scan.nextLine();
        int gender = scan.nextInt() - 1;
        Human human = new Human();
        human.setFirstName(firstName);
        human.setSecondName(secondName);
        human.setFatherName(fatherName);
        human.setGender(Gender.values()[gender]);

        return human;
    }
    private Collection<Human> getHumans() {
        Collection<Human> humans = new ArrayList<Human>();
        System.out.println("Введіть кількість людей: ");
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            humans.add(createHuman());
        }

        return humans;
    }
    private Human getHead() {
        Human human = new Human();
        human = createHuman();
        return human;
    }
    private Collection<Student> createStudents(UniversityCreator universityCreator) {
        Collection<Student> students = new ArrayList<Student>();
        Collection<Human> humans = getHumans();
        for (Human human: humans) {
            students.add(universityCreator.create(
                    human.getFirstName(),
                    human.getSecondName(),
                    human.getFatherName(),
                    human.getGender()
            ));
        }

        return students;
    }
}