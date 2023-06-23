public class Student {
    private int id;
    private String name;
    private String lastName;
    private String fatherName;
    private String birthday;
    private String documentNumber;

    @Override
    public String toString(){
        return "Студент "+"id:"+id+
                "/ Ім'я:"+name+
                "/ Прізвище:"+lastName+
                "/ По-батькові:"+fatherName+
                "/ День народження:"+birthday+
                "/ Залікова книжка:"+documentNumber;
    }
    public Student(){

    }

    public Student(int id, String name, String lastName, String fatherName, String birthday, String documentNumber){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.documentNumber = documentNumber;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.name = lastName;
    }
    public String getFatherName(){
        return fatherName;
    }
    public void setFatherName(String fatherName){
        this.name = fatherName;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.name = birthday;
    }
    public String getDocumentNumber(){
        return documentNumber;
    }
    public void setDocumentNumber(String documentNumber){
        this.name = documentNumber;
    }
}


