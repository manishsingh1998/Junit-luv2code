package com.luv2code.test;

import com.luv2code.component.MvcTestingExampleApplication;
import com.luv2code.component.models.CollegeStudent;
import com.luv2code.component.models.StudentGrades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = MvcTestingExampleApplication.class)
public class StudentTest {

    @Autowired
    private CollegeStudent collegeStudent;

    @Autowired
    private StudentGrades studentGrades;

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
      //  CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.setFirstname("manish");
        collegeStudent.setLastname("Adhikari");
        collegeStudent.setEmailAddress("adhikarimanish15@gmail.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(45.77,78.88,90.88,76.59)));
        collegeStudent.setStudentGrades(studentGrades);
    }

    @Test
    public void testAddGradeResultsForSingleClass(){

        Assertions.assertEquals(292.12,studentGrades.addGradeResultsForSingleClass(collegeStudent.getStudentGrades()
                .getMathGradeResults()));
    }
}
