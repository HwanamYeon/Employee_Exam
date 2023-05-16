package employeeexam.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUser {

    private String phoneNumber;

    private Date joinDate;

    private Boolean isManager;
}
