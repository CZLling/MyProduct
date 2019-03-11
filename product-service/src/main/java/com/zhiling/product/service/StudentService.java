package com.zhiling.product.service;
import com.zhiling.product.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public List<Student> getAllStudent();

    public Student queryStudentById(Integer id);

    public List<Student> selectByIds(List<Integer> list);

    public void addStudent(Student student);

    public int deleteStudent(Integer id,Integer status);

    public void updateStudent(Student student);


}
