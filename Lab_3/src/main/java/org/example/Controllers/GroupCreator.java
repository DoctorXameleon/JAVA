package org.example.Controllers;
import org.example.Models.Group;
import org.example.Models.Human;
import org.example.Models.Student;
import java.util.ArrayList;
import java.util.Collection;

public class GroupCreator extends StudentCreator{
    public Group createGroup(String groupName, Human groupLeader, Collection<Student> students)
    {
        Group group = new Group();
        group.setGroupName(groupName);
        group.setGroupLeader(groupLeader);
        group.setStudents(students);

        return group;
    }
    public Group createDefaultGroup()
    {
        Group group = new Group();
        group.setGroupName("Назва групи");
        group.setGroupLeader(new HumanCreator().createDefault());
        group.setStudents(new StudentCreator().createDefaultStudentCollection());

        return group;
    }

    public Collection<Group> createDefaultGroupCollection()
    {
        Collection<Group> defaultGrouptCollection = new ArrayList<>();
        for (int i = 0; i < 4; i++) defaultGrouptCollection.add(createDefaultGroup());
        return defaultGrouptCollection;
    }

}
