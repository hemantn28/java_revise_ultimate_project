package keywords;

class Student{

    String name;
    static String school;
}

public class Static {

    public static void main(String[] args) {

        Student.school="ABC";
        Student student=new Student();
        student.name="Aman";
        System.out.println(Student.school);
    }
}
