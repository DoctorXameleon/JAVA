package org.example.Controllers;
import org.example.Models.Faculty;
import org.example.Models.Human;
import org.example.Models.University;
import java.util.Collection;

public class UniversityCreator extends FacultyCreator{
    public University createUniversity(String universityName, Human rector, Collection<Faculty> faculties)
    {
        University university = new University();
        university.setUniversityName(universityName);
        university.setRector(rector);
        university.setFaculties(faculties);

        return university;
    }

    public University createDefaultUniversity()
    {
        University university = new University();
        university.setUniversityName("Назва університету");
        university.setRector(new HumanCreator().createDefault());
        university.setFaculties(new FacultyCreator().createDefaultFacultyCollection());

        return university;
    }

}
