package employeeexam.common;

import employeeexam.EmployeeApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { EmployeeApplication.class })
public class CucumberSpingConfiguration {}
