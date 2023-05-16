package employeeexam.domain;

import employeeexam.EmployeeApplication;
import employeeexam.domain.DepartmentAdd;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Department_table")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        DepartmentAdd departmentAdd = new DepartmentAdd(this);
        departmentAdd.publishAfterCommit();
    }

    public static DepartmentRepository repository() {
        DepartmentRepository departmentRepository = EmployeeApplication.applicationContext.getBean(
            DepartmentRepository.class
        );
        return departmentRepository;
    }
}
