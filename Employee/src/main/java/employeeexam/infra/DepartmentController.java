package employeeexam.infra;

import employeeexam.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/departments")
@Transactional
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @PutMapping("/departments/search/findByName")
    public Object findByName(@RequestBody DepartmentViewQuery query) {
        return departmentRepository.findByName(query.getName());
    }
}
