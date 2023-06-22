package org.example.Models;
import java.util.Collection;

public class Department{
    private String departmentName;
    private Human headOfDepartment;
    private Collection<Group> groups;
    public String getDepartmentName()
    {
        return departmentName;
    }
    public void setDepartmentName(String departmentName)
    {
        this.departmentName = departmentName;
    }
    public Human getHeadOfDepartment()
    {
        return headOfDepartment;
    }
    public void setHeadOfDepartment(Human headOfDepartment)
    {
        this.headOfDepartment = headOfDepartment;
    }
    public Collection<Group> getGroups ()
    {
        return groups;
    }
    public void setGroups (Collection<Group> groups)
    {
        this.groups = groups;
    }
    public void addGroup(Group group)
    {
        this.groups.add(group);
    }
    public void deleteGroup(Group group)
    {
        this.groups.remove(group);
    }
}
