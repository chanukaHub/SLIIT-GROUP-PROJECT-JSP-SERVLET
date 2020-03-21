package lk.sliit.project.employeeManagement.dao;

import lk.sliit.project.employeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
public interface EmployeeDAO extends CrudRepository<Employee,String> {

//    @Query(value = "SELECT IF(EXISTS(SELECT name FROM employee WHERE nicNo=?1),'TRUE','FALSE')", nativeQuery = true)
//    boolean isAdmin(int i);

    public Employee findByIdNoAndPassword(String idNo, String password);
}
