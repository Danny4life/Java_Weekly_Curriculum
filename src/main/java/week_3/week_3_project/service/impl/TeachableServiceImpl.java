package week_3.week_3_project.service.impl;

import week_3.week_3_project.model.Course;
import week_3.week_3_project.model.Student;
import week_3.week_3_project.model.Teacher;
import week_3.week_3_project.service.CourseService;

public class TeachableServiceImpl implements CourseService {
    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("FullName : " + teacher.getName() + "\n" + "Gender : " + teacher.getGender() + "\n"
                + "Age : " + teacher.getAge() + "\n" + "Course taught : " + course.getCourseName());
    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("FullName : " + student.getName() + "\n" + "Gender : " + student.getGender() + "\n"
                + "Age : " + student.getAge() + "\n" + "Course taken : " + course.getCourseName());
    }
}
