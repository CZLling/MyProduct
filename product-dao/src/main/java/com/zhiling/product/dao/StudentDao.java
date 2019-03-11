package com.zhiling.product.dao;


import com.zhiling.product.model.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudent();

    public Student queryStudentById(Integer id);

    public List<Student> selectByIds(@Param("list") List<Integer> list);

    public void addStudent(Student student);

    public int deleteStudent(@Param("id") Integer id, @Param("status") Integer status);

    public void updateStudent(Student student);


}
