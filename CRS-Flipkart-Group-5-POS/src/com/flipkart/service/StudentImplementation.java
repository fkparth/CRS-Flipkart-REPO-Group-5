package com.flipkart.service;
import java.util.*;

import com.flipkart.Dao.MockData;
<<<<<<< HEAD
=======
import com.flipkart.bean.RegisteredCourse;
>>>>>>> cbd1dfd0472877570fc3494eacfdb696d853d28f
import com.flipkart.bean.*;
public class StudentImplementation implements StudentInterface {

    @Override
<<<<<<< HEAD
    public void register(Student stud) {
        System.out.println("Give you primary preferences");
        Scanner sc=new Scanner(System.in);
        MockData data=MockData.getInstance();
        List courses = new ArrayList<Course>();
        List courses1 = new ArrayList<Course>();
        for (int i=0;i<4;i++){
            System.out.println("Enter course ID");
            int id=sc.nextInt();
            courses.add(data.course.get(id));
        }
        System.out.println("Give you alternative preferences");
        for (int i=0;i<2;i++){
            System.out.println("Enter course ID");
            int id=sc.nextInt();
            courses1.add(data.course.get(id));
        }
        data.registeredCourses.put(stud,courses);
        System.out.println("REGISTRATION SUCCESSFUL");
=======
    public void register() {

>>>>>>> cbd1dfd0472877570fc3494eacfdb696d853d28f
    }

    @Override
    public void addCourses() {

    }

    @Override
    public void dropCourses() {

    }

    @Override
    public void feePayment() {

    }

    @Override
    public void viewCourses(Student stud) {
        MockData data=MockData.getInstance();
        List<Course> name=new ArrayList<Course>();
        name=data.registeredCourses.get(stud);
        for(int i =0;i<name.size();i++){
            System.out.println(name.get(i).getCourseId());
        }
    }

    @Override
    public Student fetchStudentData(int id) {

        MockData data = MockData.getInstance();
        return data.student.get(id);
    }

    @Override
    public void viewGradesheet() {
        return ;

    }

    @Override
    public void viewCourseCatalogue() {
<<<<<<< HEAD

=======
        MockData data = MockData.getInstance();
        System.out.println("CourseID : CourseName");
        for (Course iter: data.course.values()){
            System.out.print(iter.getCourseId()+" ");
            System.out.println(iter.getCourseName());
        }
        return ;
>>>>>>> cbd1dfd0472877570fc3494eacfdb696d853d28f
    }
}
