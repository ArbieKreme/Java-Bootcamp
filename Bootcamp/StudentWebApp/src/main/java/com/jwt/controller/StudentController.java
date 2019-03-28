package com.jwt.controller;

import com.jwt.model.Subject;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Student;
import com.jwt.service.StudentService;

import javax.servlet.http.HttpServletRequest;
import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


@Controller
public class StudentController {

    private static final Logger logger = Logger
            .getLogger(StudentController.class);

    public StudentController(){
        System.out.println("StudentController()");
    }

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/")
    public ModelAndView home(ModelAndView model)throws IOException {
        model.setViewName("home");
        return model;
    }

    @RequestMapping(value = "/studentList")
    public ModelAndView listStudent(ModelAndView model)throws IOException {
        List<Student> studentList = studentService.getAllStudents();
        model.addObject("listStudent",studentList);
        model.setViewName("StudentList");
        return model;
    }

    @RequestMapping(value = "/newStudent", method = RequestMethod.GET)
    public ModelAndView newStudent(ModelAndView model){
        Student student = new Student();
        model.addObject("student", student);
        model.setViewName("StudentForm");
        return model;
    }

    @RequestMapping(value = "/saveStudent",method = RequestMethod.POST)
    public ModelAndView saveStudent(@ModelAttribute Student student){
        if(student.getStudentId()==0){
            studentService.addStudent(student);
        }else{
            studentService.updateStudent(student);
        }
        return new ModelAndView("redirect:/StudentList");
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.GET)
    public ModelAndView deleteStudent(HttpServletRequest request){
        long studentId = Long.parseLong(request.getParameter("studentId"));
        studentService.deleteStudent(studentId);
        return new ModelAndView("redirect:/StudentList");
    }

    @RequestMapping(value = "/editStudent",method = RequestMethod.GET)
    public ModelAndView editStudent(HttpServletRequest request){
        long studentId = Long.parseLong(request.getParameter("studentId"));
        Student student = studentService.getStudent(studentId);
        ModelAndView model = new ModelAndView("EditStudent");
        model.addObject("student",student);
        return model;
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        CustomDateEditor editor = new CustomDateEditor(dateFormat,true);
        binder.registerCustomEditor(Date.class, editor);
    }
}
