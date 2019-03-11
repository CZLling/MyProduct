package com.zhiling.product.service;
import com.zhiling.product.dao.StudentDao;
import com.zhiling.product.model.Student;
import com.zhiling.product.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public Student queryStudentById(Integer id) {
        return studentDao.queryStudentById(id);
    }

    @Override
    public List<Student> selectByIds(List<Integer> list) {
        return studentDao.selectByIds(list);
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    @Override
    public int deleteStudent(Integer id, Integer status) {
        if(id ==null || status ==null){
           throw new NullPointerException("param is null");
        }
           return studentDao.deleteStudent(id, status);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
