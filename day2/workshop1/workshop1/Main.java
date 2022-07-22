package workshop1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Eğitmen
        Teacher t1 = new Teacher();
        t1.setId(1);
        t1.setTeacherName("Engin DEMIROG");
        t1.setAge(25);
        t1.setTeacherDescription("Yazılımdaki en iyi hoca");

        //Kategori
        Category category = new Category();
        category.setId(1);
        category.setName("Programming");

        //Kurslar
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course course4 = new Course();





        //1. Kurs Bilgileri giriş
        course1.setCategory(category);
        course1.setTeacher(t1);
        course1.setCourseName("Yazilim Gelistirici Java Kampi (JavaScript)");
        course1.setCourseDescription("1.5 ay surecek ...");
        course1.setCourseDuration(50);
        course1.setId(1);
        course1.setCoursePrice(0);



        //2. Kurs Bilgileri giriş
        course2.setCategory(category);
        course2.setTeacher(t1);
        course2.setCourseName("Yazilim Gelistirici Java Kampi (C# + Angular)");
        course2.setCourseDescription("2 ay surecek...");
        course2.setCourseDuration(70);
        course2.setId(2);
        course2.setCoursePrice(0);

        //3. Kurs Bilgileri giriş
        course3.setCategory(category);
        course3.setTeacher(t1);
        course3.setCourseName("Yazilim Gelistirici Java Kampi (JAVA + REACT)");
        course3.setCourseDescription("1.5 ay surecek ...");
        course3.setCourseDuration(125);
        course3.setId(3);
        course3.setCoursePrice(0);

        //4. Kurs Bilgileri giriş
        course4.setCategory(category);
        course4.setTeacher(t1);
        course4.setCourseName("Programlamaya Giris icin Temel Kurs");
        course4.setCourseDescription("PYTHON, JAVA VS. gibi dilleri goreceginiz ....");
        course4.setCourseDuration(90);
        course4.setId(4);
        course4.setCoursePrice(0);

        //Ogrenci tanimlama
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        Student s1 = new Student();
        s1.setId(1);
        s1.setStudentName("Emre Yilmaz");
        s1.setCourses(courses);

        System.out.println("///////////////////////////");
        System.out.println("Kurs ismi: " +course1.getCourseName());
        System.out.println("Kurs Aciklamasi: " + course1.getCourseDescription());
        System.out.println("Kurs Egitmeni: " + course1.getTeacher().getTeacherName());
        System.out.println("Kurs Fiyati: " + course1.getCoursePrice() + "TL");
        System.out.println("///////////////////////////");

        System.out.println("Kurs ismi: " +course2.getCourseName());
        System.out.println("Kurs Aciklamasi: " + course2.getCourseDescription());
        System.out.println("Kurs Egitmeni: " + course2.getTeacher().getTeacherName());
        System.out.println("Kurs Fiyati: " + course2.getCoursePrice() + "TL");
        System.out.println("///////////////////////////");

        System.out.println("Kurs ismi: " +course3.getCourseName());
        System.out.println("Kurs Aciklamasi: " + course3.getCourseDescription());
        System.out.println("Kurs Egitmeni: " + course3.getTeacher().getTeacherName());
        System.out.println("Kurs Fiyati: " + course3.getCoursePrice() + "TL");
        System.out.println("///////////////////////////");

        System.out.println("Kurs ismi: " +course4.getCourseName());
        System.out.println("Kurs Aciklamasi: " + course4.getCourseDescription());
        System.out.println("Kurs Egitmeni: " + course4.getTeacher().getTeacherName());
        System.out.println("Kurs Fiyati: " + course4.getCoursePrice() + "TL");
        System.out.println("///////////////////////////");

        System.out.println("Ogrenci ismi: " + s1.getStudentName());
        System.out.println("Ogrencinin sahip oldugu kurs sayisi: " + s1.getCourses().size());
        CourseService courseService = new CourseService();
        CategoryService categoryService = new CategoryService();
        StudentService studentService = new StudentService();
        TeacherService teacherService = new TeacherService();

        courseService.add(course1);
        courseService.add(course2);
        courseService.add(course3);
        courseService.add(course4);
        categoryService.add(category);
        studentService.add(s1);

    }
}