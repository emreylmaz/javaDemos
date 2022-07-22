package workshop1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public  void add(Student student){
        System.out.println(student.getStudentName()+" öğrenci Eklendi");
    }
    public  void update(Student student){
        System.out.println(student.getStudentName()+" öğrenci silindi");

    }
    public  void delete(Student student){
        System.out.println(student.getStudentName()+" öğrenci deleted");

    }
    public List<Student>getAll(){

        return new  ArrayList<Student>();
    }
}
