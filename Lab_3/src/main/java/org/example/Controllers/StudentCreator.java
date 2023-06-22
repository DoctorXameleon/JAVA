package org.example.Controllers;
import org.example.Models.Gender;
import org.example.Models.Student;
import java.util.ArrayList;
import java.util.Collection;

public class StudentCreator implements IHumanCreatable<Student> {

    public Student create(String firstName, String secondName, String fatherName, Gender gender)
    {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setFatherName(fatherName);
        student.setGender(gender);

        return student;
    }

    public Student createDefault()
    {
        Student student = new Student();
        student.setFirstName("Ім'я");
        student.setSecondName("Прізвище");
        student.setFatherName("По-батькові");
        student.setGender(Gender.MALE);

        return student;
    }

    public Collection<Student> createDefaultStudentCollection()
    {
        Collection<Student> defaultStudentCollection = new ArrayList<>();
        for (int i = 0; i < 15; i++) defaultStudentCollection.add(createDefault());
        return defaultStudentCollection;
    }
}
