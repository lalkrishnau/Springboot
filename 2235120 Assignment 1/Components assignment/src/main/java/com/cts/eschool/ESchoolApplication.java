package com.cts.eschool;

import com.cts.eschool.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ESchoolApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ss = SpringApplication.run(ESchoolApplication.class, args);
		StudentService s = ss.getBean(StudentService.class);
		s.addNewStudentDetail(101, "Lal", 82);
		s.addNewStudentDetail(102, "Josh", 95);
		s.addNewStudentDetail(103, "Simon", 67);

		s.getAllStudentDetails();
		s.getStudentDetailsById(101);
		s.updateStudentScore(101,85);
		s.deleteStudentDetails(102);
		s.getAllStudentDetails();
	}

}
