import entity.Address;
import entity.Department;
import entity.Student;
import entity.Subject;
import repository.DepartmentRepository;
import repository.StudentRepository;
import repository.SubjectRepository;
import util.HibernateConnectionUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        DepartmentRepository dr = new DepartmentRepository();
        StudentRepository sr = new StudentRepository();
        SubjectRepository sur = new SubjectRepository();

//        <------------------------------------------DEPARTMENTS-------------------------------------------->

        Department CITHM = new Department();
        CITHM.setDepartmentName("College of International Tourism and Hospitality Management");
        dr.addDepartment(CITHM);

        Department COT = new Department();
        COT.setDepartmentName("College of Technology");
        //dr.addDepartment(COT);

        Department CAS = new Department();
        CAS.setDepartmentName("College of Arts and Sciences");
        //dr.addDepartment(CAS);

        Department CIR = new Department();
        CIR.setDepartmentName("College of International Relations");
        //dr.addDepartment(CIR);

        Department CBA = new Department();
        CBA.setDepartmentName("College of Business Administration");
        //dr.addDepartment(CBA);


//        <------------------------------------------SUBJECTS-------------------------------------------->

        //CITHM SUBJECTS
        Subject ITH1 = new Subject();
        ITH1.setSubjectId(1);
        ITH1.setSubjectName("Introduction to Hospitality Management");
        ITH1.setInTime(LocalTime.of(7,00,00));
        ITH1.setOutTime(LocalTime.of(8,00,00));
        ITH1.setDepartment(CITHM);
        //sur.addSubject(ITH1);

        Subject ITH2 = new Subject();
        ITH2.setSubjectId(2);
        ITH2.setSubjectName("Introduction to Hospitality Mangement 2");
        ITH2.setInTime(LocalTime.of(8,00,00));
        ITH2.setOutTime(LocalTime.of(9,00,00));
        ITH2.setDepartment(CITHM);
        //sur.addSubject(ITH2);

        Subject FNB1 = new Subject();
        FNB1.setSubjectId(3);
        FNB1.setSubjectName("Food and Beverage 1");
        FNB1.setInTime(LocalTime.of(9,00,00));
        FNB1.setOutTime(LocalTime.of(10,00,00));
        FNB1.setDepartment(CITHM);
        //sur.addSubject(FNB1);

        Subject PIT1 = new Subject();
        PIT1.setSubjectId(4);
        PIT1.setSubjectName("Principles of International Tourism 1");
        PIT1.setInTime(LocalTime.of(10,00,00));
        PIT1.setOutTime(LocalTime.of(11,00,00));
        PIT1.setDepartment(CITHM);
        //sur.addSubject(PIT1);

        Subject PIT2 = new Subject();
        PIT2.setSubjectId(5);
        PIT2.setSubjectName("Principles of International Tourism 2");
        PIT2.setInTime(LocalTime.of(11,00,00));
        PIT2.setOutTime(LocalTime.of(12,00,00));
        PIT2.setDepartment(CITHM);
        //sur.addSubject(PIT2);

        //COT SUBJECTS
        Subject ITI1 = new Subject();
        ITI1.setSubjectId(6);
        ITI1.setSubjectName("Introduction to ICT 1");
        ITI1.setInTime(LocalTime.of(12,00,00));
        ITI1.setOutTime(LocalTime.of(1,00,00));
        ITI1.setDepartment(COT);
        //sur.addSubject(ITI1);

        Subject ITI2 = new Subject();
        ITI2.setSubjectId(7);
        ITI2.setSubjectName("Introduction to ICT 2");
        ITI2.setInTime(LocalTime.of(1,00,00));
        ITI2.setOutTime(LocalTime.of(2,00,00));
        ITI2.setDepartment(COT);
        //sur.addSubject(ITI2);

        Subject NET1 = new Subject();
        NET1.setSubjectId(8);
        NET1.setSubjectName("Network Technology 1");
        NET1.setInTime(LocalTime.of(2,00,00));
        NET1.setOutTime(LocalTime.of(3,00,00));
        NET1.setDepartment(COT);
        //sur.addSubject(NET1);

        Subject HCI1 = new Subject();
        HCI1.setSubjectId(9);
        HCI1.setSubjectName("Human Computer Interaction 1");
        HCI1.setInTime(LocalTime.of(3,00,00));
        HCI1.setOutTime(LocalTime.of(4,00,00));
        HCI1.setDepartment(COT);
        //sur.addSubject(HCI1);

        Subject HCI2 = new Subject();
        HCI2.setSubjectId(10);
        HCI2.setSubjectName("Human Computer Interaction 2");
        HCI2.setInTime(LocalTime.of(4,00,00));
        HCI2.setOutTime(LocalTime.of(5,00,00));
        HCI2.setDepartment(COT);
        //sur.addSubject(HCI2);

        //College of Arts and Sciences
        Subject PSY1 = new Subject();
        PSY1.setSubjectId(11);
        PSY1.setSubjectName("Psychology 1");
        PSY1.setInTime(LocalTime.of(7,00,00));
        PSY1.setOutTime(LocalTime.of(8,00,00));
        PSY1.setDepartment(CAS);
        //sur.addSubject(PSY1);

        Subject PSY2 = new Subject();
        PSY2.setSubjectId(12);
        PSY2.setSubjectName("Psychology 2");
        PSY2.setInTime(LocalTime.of(8,00,00));
        PSY2.setOutTime(LocalTime.of(9,00,00));
        PSY2.setDepartment(CAS);
        //sur.addSubject(PSY2);

        Subject RIZ1 = new Subject();
        RIZ1.setSubjectId(13);
        RIZ1.setSubjectName("Rizal 1");
        RIZ1.setInTime(LocalTime.of(9,00,00));
        RIZ1.setOutTime(LocalTime.of(10,00,00));
        RIZ1.setDepartment(CAS);
        //sur.addSubject(RIZ1);

        Subject RIZ2 = new Subject();
        RIZ2.setSubjectId(14);
        RIZ2.setSubjectName("Rizal 2");
        RIZ2.setInTime(LocalTime.of(10,00,00));
        RIZ2.setOutTime(LocalTime.of(11,00,00));
        RIZ2.setDepartment(CAS);
        //sur.addSubject(RIZ2);

        Subject FIL1 = new Subject();
        FIL1.setSubjectId(15);
        FIL1.setSubjectName("Filipino 1");
        FIL1.setInTime(LocalTime.of(11,00,00));
        FIL1.setOutTime(LocalTime.of(12,00,00));
        FIL1.setDepartment(CAS);
        //sur.addSubject(FIL1);

        //CIR
        Subject ITC1 = new Subject();
        ITC1.setSubjectId(16);
        ITC1.setSubjectName("Introduction to Constitution 1");
        ITC1.setInTime(LocalTime.of(12,00,00));
        ITC1.setOutTime(LocalTime.of(1,00,00));
        ITC1.setDepartment(CIR);
        //sur.addSubject(ITC1);

        Subject ITC2 = new Subject();
        ITC2.setSubjectId(17);
        ITC2.setSubjectName("Introduction to Consitution 2");
        ITC2.setInTime(LocalTime.of(1,00,00));
        ITC2.setOutTime(LocalTime.of(2,00,00));
        ITC2.setDepartment(CIR);
        //sur.addSubject(ITC2);

        Subject MDR1 = new Subject();
        MDR1.setSubjectId(18);
        MDR1.setSubjectName("Mandarin 1");
        MDR1.setInTime(LocalTime.of(2,00,00));
        MDR1.setOutTime(LocalTime.of(3,00,00));
        MDR1.setDepartment(CIR);
        //sur.addSubject(MDR1);

        Subject MDR2 = new Subject();
        MDR2.setSubjectId(19);
        MDR2.setSubjectName("Mandarin 2");
        MDR2.setInTime(LocalTime.of(3,00,00));
        MDR2.setOutTime(LocalTime.of(4,00,00));
        MDR2.setDepartment(CIR);
        //sur.addSubject(MDR2);

        Subject NHG1 = new Subject();
        NHG1.setSubjectId(20);
        NHG1.setSubjectName("Nihonggo 1");
        NHG1.setInTime(LocalTime.of(4,00,00));
        NHG1.setOutTime(LocalTime.of(5,00,00));
        NHG1.setDepartment(CIR);
        //sur.addSubject(NHG1);

        //CBA SUBJECTS
        Subject IBM1 = new Subject();
        IBM1.setSubjectId(21);
        IBM1.setSubjectName("Introduction to Business Management 1");
        IBM1.setInTime(LocalTime.of(7,00,00));
        IBM1.setOutTime(LocalTime.of(8,00,00));
        IBM1.setDepartment(CBA);
        //sur.addSubject(IBM1);

        Subject IBM2 = new Subject();
        IBM2.setSubjectId(22);
        IBM2.setSubjectName("Introduction to Business Management 2");
        IBM2.setInTime(LocalTime.of(8,00,00));
        IBM2.setOutTime(LocalTime.of(9,00,00));
        IBM2.setDepartment(CBA);
        //sur.addSubject(IBM2);

        Subject PNT1 = new Subject();
        PNT1.setSubjectId(23);
        PNT1.setSubjectName("Principles of Taxation 1");
        PNT1.setInTime(LocalTime.of(9,00,00));
        PNT1.setOutTime(LocalTime.of(10,00,00));
        PNT1.setDepartment(CBA);
        //sur.addSubject(PNT1);

        Subject PNT2 = new Subject();
        PNT2.setSubjectId(24);
        PNT2.setSubjectName("Principles of Taxation 2");
        PNT2.setInTime(LocalTime.of(10,00,00));
        PNT2.setOutTime(LocalTime.of(11,00,00));
        PNT2.setDepartment(CBA);
        //sur.addSubject(PNT2);

        Subject ENT1 = new Subject();
        ENT1.setSubjectId(25);
        ENT1.setSubjectName("Entrepreneurship 1");
        ENT1.setInTime(LocalTime.of(11,00,00));
        ENT1.setOutTime(LocalTime.of(12,00,00));
        ENT1.setDepartment(CBA);
        //sur.addSubject(ENT1);

//        <------------------------------------------STUDENTS-------------------------------------------->

        Student christian = new Student();
        christian.setStudentId(1);
        christian.setFirstName("Christian Albert");
        christian.setMiddleName("Francisco");
        christian.setLastName("Soriano");
        christian.setAge(22);
        christian.setDateOfBirth(LocalDate.of(1995,5,12));

        Address add2 = new Address();
        add2.setCity("Cavite");
        add2.setCountry("Philippines");
        add2.setProvince("NCR");
        add2.setStreet("Westpoint");
        add2.setZipCode("1407");
        christian.setAddress(add2);

        //sr.addStudent(christian);

        Student ronald = new Student();
        ronald.setStudentId(2);
        ronald.setFirstName("Ronald Bo");
        ronald.setMiddleName("Prestado");
        ronald.setLastName("Tecson");
        ronald.setAge(22);
        ronald.setDateOfBirth(LocalDate.of(1995,11,20));

        Address add1 = new Address();
        add1.setCity("Cavite");
        add1.setCountry("Philippines");
        add1.setProvince("NCR");
        add1.setStreet("Montreal");
        add1.setZipCode("1407");
        ronald.setAddress(add1);

        //sr.addStudent(ronald);

//        <------------------------------------------ENROLL HERE-------------------------------------------->

        sr.enrollStudent(christian,ITH1);
        sr.enrollStudent(christian,ITH2);
        sr.enrollStudent(christian,FNB1);
        sr.enrollStudent(christian,PIT1);
        sr.enrollStudent(christian,PIT2);
        //sr.enrollStudent(christian,ITI1);
        //sr.enrollStudent(christian,ITI2);
        //sr.enrollStudent(christian,NET1);
        //sr.enrollStudent(christian,HCI1);
        //sr.enrollStudent(christian,HCI2);

        //sr.enrollStudent(ronald,PSY1);
        //sr.enrollStudent(ronald,PSY2);
        //sr.enrollStudent(ronald,RIZ1);
        //sr.enrollStudent(ronald,RIZ2);
        //sr.enrollStudent(ronald,FIL1);
        //sr.enrollStudent(ronald,ITC1);
        //sr.enrollStudent(ronald,ITC2);
        //sr.enrollStudent(ronald,MDR1);
        //sr.enrollStudent(ronald,MDR2);
        //sr.enrollStudent(ronald,NHG1);


//        <------------------------------------------OUTPUT-------------------------------------------->

//        Get All Students
//        System.out.println("\nAll Students Enrolled");
//        for(Student student : sr.getAllStudents()){
//            System.out.println(student+"\n");
//            System.out.println(student.getAddress()+"\n");
//        }

//        Get Student By Subject
//        System.out.println("\nAll Students Enrolled in ITH1");
//        System.out.println("\n");
//        for(Student student : sr.getStudentsBySubject(ITH1)){
//            System.out.println(student+"\n");
//        }

//        Get Student By City
//        System.out.println("\nAll Students Lived in the City of Cavite");
//        for(Student student : sr.getStudentByCity("Cavite")){
//            System.out.println(student+"\n");
//        }

//        Get Subjects Time Out 12nn
//        System.out.println("\nAll Subjects Scheduled 7AM - 12PM");
//        System.out.println("\nOut Time : 12nn");
//        for(Subject subject : sur.getSubjectsByOutTime12nn()){
//            System.out.println(subject+"\n");
//        }

//        Get Subjects Time In 12nn
//        System.out.println("\nAll Subjects Scheduled 12PM - 5PM");
//        System.out.println("\nIn time : 12nn");
//        for(Subject subject : sur.getSubjectsByIntTime12nn())
//        {
//            System.out.println(subject+"\n");
//        }

        //Get Subject by Student
//        System.out.println("\nAll Subjects of Christian");
//        for(Subject subject : sr.getSubjectByStudent(christian)){
//            System.out.println(subject.getSubjectName());
//        }

        List<Subject> forDroppingSubjects = new ArrayList<>();

        //Subjects Enrolled by Christian
        forDroppingSubjects.add(sur.getSubjectById(1));
        forDroppingSubjects.add(sur.getSubjectById(2));
        //Subject not enrolled by Christian
        forDroppingSubjects.add(sur.getSubjectById(6));
        sr.dropSubject(1,forDroppingSubjects);

        System.out.println("\nAll Subjects of Christian");
        for(Subject subject : sr.getSubjectByStudent(christian)){
            System.out.println(subject.getSubjectName());
        }

//        for(Student student : sr.getStudentsBySubject(ITH1)){
//            System.out.println(student.getFirstName()+"\n");
//        }



        HibernateConnectionUtil.shutdown();
    }
}
