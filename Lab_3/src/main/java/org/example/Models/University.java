package org.example.Models;
import java.util.Collection;

public class University {
    private Collection<Faculty> faculties;
    private Human rector;
    private String universityName;
    public Human getRector() {
        return rector;
    }
    public void setRector(Human rector) {
        this.rector = rector;
    }
    public String getUniversityName()
    {
        return universityName;
    }
    public void setUniversityName(String universityName)
    {
        this.universityName = universityName;
    }
    public Collection<Faculty> getFaculties()
    {
        return faculties;
    }
    public void setFaculties(Collection<Faculty> faculties)
    {
        this.faculties = faculties;
    }
}
