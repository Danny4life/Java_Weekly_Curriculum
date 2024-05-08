package week_3.week_3_project.service.impl;

import week_3.week_3_project.model.Principal;
import week_3.week_3_project.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void display(Principal principal) {
        System.out.println("FullName : " + principal.getName() + "\n" + "Gender : " + principal.getGender() + "\n"
                + "Age : " + principal.getAge());
    }
}
