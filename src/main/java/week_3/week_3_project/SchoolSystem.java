package week_3.week_3_project;

import week_3.week_3_project.enums.CourseOffer;
import week_3.week_3_project.enums.Gender;
import week_3.week_3_project.model.*;
import week_3.week_3_project.service.impl.ApplicantServiceImpl;
import week_3.week_3_project.service.impl.PrincipalServiceImpl;
import week_3.week_3_project.service.impl.StudentServiceImpl;
import week_3.week_3_project.service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {
        // step 1
        Teacher teacher1 = new Teacher("Segun Osiki", 135, Gender.MALE);
        Teacher teacher2 = new Teacher("Jane Day", 30, Gender.FEMALE);

        // step 2
        Student student1 = new Student("Rosemary Uroko", 20, Gender.FEMALE);
        Student student2 = new Student("Sani Dogo", 22, Gender.MALE);

        // step 1 $ 2
        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.NODE);

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        //step 3
        Principal principal1 = new Principal("John Hopkins", 60, Gender.MALE);
        PrincipalServiceImpl principalData = new PrincipalServiceImpl();
        StudentServiceImpl expelStudent = new StudentServiceImpl();

        //step 4
        Applicants applicants1 = new Applicants("Vivian Abner", 18, Gender.FEMALE);
        Applicants applicants2 = new Applicants("Henry Eze", 17, Gender.MALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();



        // step 1
        System.out.println("Teacher Data");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("********************");

        // step 1
        System.out.println("Teacher Data");
        teachableService2.teachCourse(teacher2, course2);
        System.out.println("********************");

        // step 2
        System.out.println("Student Data");
        teachableService1.takeCourse(student1, course1);
        System.out.println("********************");

        // step 2
        System.out.println("Student Data");
        teachableService1.takeCourse(student2, course2);
        System.out.println("********************");

        //step 3
        System.out.println("Principal Data");
        principalData.display(principal1);
        System.out.println("********************");

        //step 3
        System.out.println("Student Expelled Data");
        expelStudent.expelStudent(student2, principal1);
        System.out.println("********************");

        //step 4
        System.out.println("Applicants Data");
        applicantData.displayApplicantData(applicants1);
        applicantData.displayApplicantData(applicants2);
        System.out.println("********************");

        //step 4
        System.out.println("Successful Admission Data");
        applicantData.admitStudent(applicants1);
        System.out.println("********************");

        //step 4
        System.out.println("Admission Denied Data");
        applicantData.admitStudent(applicants2);

    }
}
