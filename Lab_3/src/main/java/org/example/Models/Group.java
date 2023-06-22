package org.example.Models;
import java.util.Collection;

public class Group{
    private Collection<Student> students;
    private Human groupLeader;
    private String groupName;
    public  String getGroupName()
    {
        return  groupName;
    }
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }
    public  Human getGroupLeader()
    {
        return  groupLeader;
    }
    public void setGroupLeader(Human groupLeader)
    {
        this.groupLeader = groupLeader;
    }
    public int getStudentCount()
    {
        return students.size();
    }
    public Collection<Student> getStudents()
    {
        return students;
    }
    public void setStudents(Collection<Student> students)
    {
        this.students = students;
    }
    public void addStudent(Student student)
    {
        this.students.add(student);
    }
    public void deleteStudent(Student student)
    {
        this.students.remove(student);
    }
}
