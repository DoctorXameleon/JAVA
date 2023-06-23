import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowStudents {
    public static List<Student> getStudentData(String query){
        List<Student> students = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String fatherName = rs.getString("fatherName");
                String birthday = rs.getString("birthday");
                String documentNumber = rs.getString("documentNumber");
                students.add(new Student(id, name, lastName, fatherName, birthday, documentNumber));
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return students;
    }
}
