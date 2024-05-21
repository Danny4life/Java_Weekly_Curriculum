package week_5.class_exercise_3A1;

import java.util.HashMap;

public class GradeTracker {
    HashMap<Integer, Double> gradeMap;

    public GradeTracker() {
        this.gradeMap = new HashMap<>();
    }

    public void addGrade(int studentId, double grade){
        gradeMap.put(studentId, grade);
    }

    public double getGrade(int studentId){

        if(gradeMap.containsKey(studentId)){
            return gradeMap.get(studentId);
        }else{
            return -1.0;
        }
    }
}
