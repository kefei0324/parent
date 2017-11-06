package org.feona.web.controller;

import org.feona.model.Student;
import org.feona.model.utils.ResultVo;
import org.feona.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/studentApi/")
public class StudentApiController {
    @Resource
    private StudentService studentService;

    @RequestMapping("findAllStudentInfo")
    public @ResponseBody
    ResultVo findAllStudentInfo(@RequestParam("id") String id) {
        Student student = new Student();
        //不做过多验证判断
        if ("0".equals(id)) {
            student = null;
        } else {
            student.setId(new Integer(id));
        }
        return studentService.findAllStudent(student);
    }
}
