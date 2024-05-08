package week_3.week_3_project.service.impl;

import week_3.week_3_project.model.Applicants;
import week_3.week_3_project.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {
    @Override
    public void displayApplicantData(Applicants applicants) {
        System.out.println("FullName : " + applicants.getName() + "\n" + "Age : " + applicants.getAge() + "\n" +
                "Gender : " + applicants.getGender());
    }

    @Override
    public void admitStudent(Applicants applicants) {
        if(applicants.getAge() >= 18){
            System.out.println("Congratulations!!! " + applicants.getName() + " you have been offer admission to learn Java");
        }else {
            System.out.println("Hi " + applicants.getName() + " we regret to inform you that you have been denied admission, try again when you clock 18");
        }
    }
}
