package com.jwt.controller;

import com.jwt.model.Subject;
import com.jwt.service.SubjectService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SubjectController {


    private static final Logger logger = Logger
            .getLogger(SubjectController.class);

    public SubjectController(){
        System.out.println("SubjectController()");
    }

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/subjectList")
    public ModelAndView listSubject(ModelAndView model)throws IOException {
        List<Subject> subjectList = subjectService.getAllSubjects();
        model.addObject("listSubject",subjectList);
        model.setViewName("SubjectList");
        return model;
    }

    @RequestMapping(value = "/newSubject", method = RequestMethod.GET)
    public ModelAndView newSubject(ModelAndView model){
        Subject subject = new Subject();
        model.addObject("subject", subject);
        model.setViewName("SubjectForm");
        return model;
    }

    @RequestMapping(value = "/saveSubject",method = RequestMethod.POST)
    public ModelAndView saveSubject(@ModelAttribute Subject subject){
        if(subject.getSubjectId()==0){
            subjectService.addSubject(subject);
        }else{
            subjectService.updateSubject(subject);
        }
        return new ModelAndView("redirect:/SubjectList");
    }

    @RequestMapping(value = "/deleteSubject",method = RequestMethod.GET)
    public ModelAndView deleteSubject(HttpServletRequest request){
        long subjectId = Long.parseLong(request.getParameter("subjectId"));
        subjectService.deleteSubject(subjectId);
        return new ModelAndView("redirect:/SubjectList");
    }

    @RequestMapping(value = "/editSubject",method = RequestMethod.GET)
    public ModelAndView editSubject(HttpServletRequest request){
        long subjectId = Long.parseLong(request.getParameter("subjectId"));
        Subject subject = subjectService.getSubject(subjectId);
        ModelAndView model = new ModelAndView("EditSubject");
        model.addObject("subject",subject);
        return model;
    }
}
