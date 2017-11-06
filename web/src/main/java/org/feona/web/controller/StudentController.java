package org.feona.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student/")
public class StudentController {
    @RequestMapping("home")
    public String home(Model model) {
        model.addAttribute("menuSelected1", "home");
        return "student/home";
    }

    @RequestMapping("studentInfo")
    public String studentInfo(Model model) {
        model.addAttribute("menuSelected1", "studentInfo");
        return "student/studentInfo";
    }
}
