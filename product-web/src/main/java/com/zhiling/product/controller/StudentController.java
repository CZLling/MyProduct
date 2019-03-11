package com.zhiling.product.controller;
import com.alibaba.fastjson.JSON;
import com.zhiling.product.model.Student;
import com.zhiling.product.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/Student")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/get",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public String get(HttpServletRequest request,HttpServletRequest response) {
        return "views/showStudentInfo";
    }

    @RequestMapping(value = "/getAllStudent",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getAllStudent(HttpServletRequest request,HttpServletRequest response) {
    List<Student> students;
    try {
        students = studentService.getAllStudent();
    } catch (Exception e) {
        logger.error("getStudent error",e);
        return JSON.toJSONString("查询失败");
    }
    return JSON.toJSONString(students);
    }

    @RequestMapping(value = "/getStudent",method =RequestMethod.POST,produces ="application/json;charset=utf-8")
    @ResponseBody
    public String getStudent(@RequestParam(value = "id") Integer id){
        if(id ==null){
            return JSON.toJSONString("id is null");
        }
        Student student;
        try{
            student =studentService.queryStudentById(id);
        }catch(Exception e){
            logger.error("getStudent error",e);
            return JSON.toJSONString("查询失败");
        }
        return JSON.toJSONString(student);
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.POST,produces="application/json; charset=utf-8")
    @ResponseBody
    public String deleteStudent(@RequestParam("id") Integer id,@RequestParam("status") Integer status){
        if(Objects.isNull(id)){
            return JSON.toJSONString("id is null");
        }
        if(Objects.isNull(status)){
            return JSON.toJSONString("status is null");
        }
        int updateCount =0;
        try{
            updateCount =studentService.deleteStudent(id, status);
        }catch(Exception e){
            logger.error("deleteStudent error",e);
            return JSON.toJSONString("删除失败");
        }
        return JSON.toJSONString("success");
    }


}
