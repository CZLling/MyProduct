package com.zhiling.product.service;

import com.zhiling.product.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void getStudentByID( ) {
            int stuID = 110928;
            Student student = studentService.queryStudentById(stuID);
            if (student != null) {
                System.out.println(student.getId() + ";" + student.getStuName() + ";" + student.getStuAddress());
            }
    }

    @Test
    public void selectByIds(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(140201);
        list.add(140928);
        List<Student> stulist = studentService.selectByIds(list);
        for (Student item:stulist) {
            System.out.println(item.getStuName());
        }
    }



    @Test
    public void addStudent() {
        Student student = new Student();
        student.setId(130122);
        student.setStuName("陈晨");
        student.setStuClassid(1306);
        student.setStuScoreid(43097);
        student.setStuGender(0);
//        student.setStuScid(2);
//        student.setStuAge(19);
//        student.setStuAddress("place");
//        student.setStuTel("1342087511");
//        student.setStuCreatetime("2018-09-29");
//        student.setStuCreateuser("张三");
        studentService.addStudent(student);
    }


    @Test
    public void deleteStudent( ) {
        int stuID = 130122;
        int status =1;
        studentService.deleteStudent(stuID,status);

    }

    @Test
    public void updateStudent() {
        Student student1 = new Student();
        student1.setId(130122);
        student1.setStuName("王诚实");
        student1.setStuClassid(1709);
        student1.setStuScoreid(43097);
        student1.setStuGender(0);
        student1.setStuScid(2);
        student1.setStuAge(10);
        student1.setStuAddress("place2");
        student1.setStuTel("1342087511");
        student1.setStuCreatetime("2018-09-29");
        student1.setStuCreateuser("王华");
        studentService.updateStudent(student1);
    }

}



