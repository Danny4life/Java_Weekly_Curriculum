package week_3.week_3_project.service;

import week_3.week_3_project.model.Course;
import week_3.week_3_project.model.Student;
import week_3.week_3_project.model.Teacher;

public interface CourseService {
    void teachCourse(Teacher teacher, Course course);

    void takeCourse(Student student, Course course);
}
