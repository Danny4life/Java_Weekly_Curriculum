package week_3.week_3_project.service.impl;

import week_3.week_3_project.model.Principal;
import week_3.week_3_project.model.Student;
import week_3.week_3_project.service.PrincipalService;
import week_3.week_3_project.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student FullName : " + student.getName() + "\n" + "Expulsion Durration : "+ "2 WEEKS" + "\n" + "Expelled By : " + "Principal " + principal.getName());

    }
}
