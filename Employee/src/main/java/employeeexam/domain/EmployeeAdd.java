package employeeexam.domain;

import employeeexam.domain.*;
import employeeexam.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EmployeeAdd extends AbstractEvent {

    private Long id;
    private String userName;
    private String userId;

    public EmployeeAdd(Employee aggregate) {
        super(aggregate);
    }

    public EmployeeAdd() {
        super();
    }
}
