package org.example.Models;
import java.util.Collection;

public class Faculty {
    private String facultyName;
    private Human dean;
    private Collection<Department> departments;
    public String getFacultyName()
    {
        return facultyName;
    }
    public void setFacultyName(String facultyName)
    {
        this.facultyName = facultyName;
    }
    public Human getDean()
    {
        return dean;
    }
    public void setDean(Human dean)
    {
        this.dean = dean;
    }
    public Collection<Department> getDepartments()
    {
        return departments;
    }
    public void setDepartments(Collection<Department> departments)
    {
        this.departments = departments;
    }
    public void addDepartment(Department department)
    {
        this.departments.add(department);
    }
    public void deleteDepartment(Department department)
    {
        this.departments.remove(department);
    }
}
