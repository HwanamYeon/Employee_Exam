package employeeexam.infra;

import employeeexam.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "employeeViews",
    path = "employeeViews"
)
public interface EmployeeViewRepository
    extends PagingAndSortingRepository<EmployeeView, Long> {}
