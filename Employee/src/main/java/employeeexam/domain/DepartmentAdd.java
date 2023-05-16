package employeeexam.domain;

import employeeexam.domain.*;
import employeeexam.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DepartmentAdd extends AbstractEvent {

    private Long id;
    private String name;

    public DepartmentAdd(Department aggregate) {
        super(aggregate);
    }

    public DepartmentAdd() {
        super();
    }
}
