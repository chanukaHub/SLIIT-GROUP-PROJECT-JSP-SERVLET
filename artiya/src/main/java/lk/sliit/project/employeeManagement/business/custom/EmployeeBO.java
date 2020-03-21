package lk.sliit.project.employeeManagement.business.custom;

import lk.sliit.project.employeeManagement.business.CrudBO;
import lk.sliit.project.employeeManagement.business.SuperBO;
import lk.sliit.project.employeeManagement.dto.EmployeeDTO;
import lk.sliit.project.employeeManagement.entity.Employee;
import java.util.List;
/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
public interface EmployeeBO extends CrudBO {
    String getLastUserCode() ;
    boolean exists(String i);

    public Employee findByIdNoAndPassword(String idNo, String password);
}
