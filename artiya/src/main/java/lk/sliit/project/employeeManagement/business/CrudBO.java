package lk.sliit.project.employeeManagement.business;

import lk.sliit.project.employeeManagement.dto.EmployeeDTO;
import lk.sliit.project.employeeManagement.entity.Employee;
import java.util.List;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 16-Mar-20
 */
public interface CrudBO extends SuperBO {
    void save(EmployeeDTO employee);

    EmployeeDTO updateUser(String user) ;

    void deleteUser(String id) ;

    List<EmployeeDTO> findAllEmployees() ;

    EmployeeDTO findUser(String userCode) ;

}
