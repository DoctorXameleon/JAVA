package org.example.Controllers;
import org.example.Models.Gender;
import org.example.Models.Human;
import java.util.ArrayList;
import java.util.Collection;

public class HumanCreator implements IHumanCreatable<Human> {

    public Human create(String firstName, String secondName, String fatherName, Gender gender)
    {
        Human human = new Human();
        human.setFirstName(firstName);
        human.setSecondName(secondName);
        human.setFatherName(fatherName);
        human.setGender(gender);

        return human;
    }

    public Human createDefault()
    {
        Human human = new Human();
        human.setFirstName("Ім'я");
        human.setSecondName("Прізвище");
        human.setFatherName("По-батькові");
        human.setGender(Gender.MALE);

        return human;
    }

    public Collection<Human> createDefaultStudentCollection()
    {
        Collection<Human> defaultStudentCollection = new ArrayList<>();
        for (int i = 0; i < 15; i++) defaultStudentCollection.add(createDefault());
        return defaultStudentCollection;
    }
}
