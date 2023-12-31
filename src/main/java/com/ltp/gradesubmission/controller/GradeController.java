package com.ltp.gradesubmission.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ltp.gradesubmission.Grade;



@Controller
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        Grade grade = new Grade("Harry", "Potions","C-");
        model.addAttribute("grade", grade);
        return "grades";
    }
    
   
    
}
