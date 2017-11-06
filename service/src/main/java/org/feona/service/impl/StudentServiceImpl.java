package org.feona.service.impl;

import org.feona.dao.StudentDao;
import org.feona.model.Student;
import org.feona.model.utils.ResultVo;
import org.feona.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentDao studentDao;

    public Boolean addStudent(Student student) {
        return studentDao.insert(student);
    }

    public Boolean deleteStudentById(Integer id) {
        Student student = new Student();
        student.setId(id);
        return studentDao.delete(student);
    }

    public Boolean updateStudentById(Student student) {
        return studentDao.update(student);
    }

    public ResultVo findAllStudent(Student student) {
        ResultVo resultVo = new ResultVo();
        List<Student> list = studentDao.select(student);
        if (list.size() > 0) {
            resultVo.setResult(list);
            resultVo.isSuccess(true);
        } else {
            resultVo.setMessage("没有找到相关信息");
        }
        return resultVo;
    }
}
