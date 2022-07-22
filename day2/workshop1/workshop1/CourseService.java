package workshop1;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public void add(Course course){
        System.out.println(course.getCourseName()+ "Eklendi");
    }

    public void update(Course course){

        System.out.println(course.getCourseName()+ "güncellendi");
    }

    public void delete(Course course){


        System.out.println(course.getCourseName()+ "silindi");
    }

    public List<Course> getAll(){
        return new ArrayList<Course>();
    }
}
