package week_3.week_3_project.model;

import week_3.week_3_project.enums.CourseOffer;

public class Course {
    private CourseOffer courseName;

    public Course(CourseOffer courseName) {
        this.courseName = courseName;
    }

    public CourseOffer getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName=" + courseName +
                '}';
    }
}
