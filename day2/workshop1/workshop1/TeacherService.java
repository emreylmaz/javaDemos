package workshop1;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    public  void add(Teacher teacher){
        System.out.println(teacher.getTeacherName()+" öğretmen Eklendi");
    }
    public  void update(Teacher teacher){
        System.out.println(teacher.getTeacherName()+" öğretmen güncellendi");

    }
    public  void delete(Teacher teacher){
        System.out.println(teacher.getTeacherName()+" Öğretmen deleted");

    }
    public List<Teacher> getAll(){

        return new ArrayList<Teacher>();
    }
}
