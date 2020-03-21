package lk.sliit.project.employeeManagement.business.custom.impl;

import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import lk.sliit.project.employeeManagement.dao.DashboardDAO;
import lk.sliit.project.employeeManagement.dao.EmployeeDAO;
import lk.sliit.project.employeeManagement.dto.EmployeeDTO;
import lk.sliit.project.employeeManagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Service
@Transactional
public class EmployeeBOImpl implements EmployeeBO {

    //Automate Object Creation
    @Autowired
    private EmployeeDAO employeeDAO;

    //Save Method
    @Override
    public void save(EmployeeDTO employee) {
        employeeDAO.save(new Employee (employee.getIdNo (),
                employee.getName (),
                employee.getMobileNumber (),
                employee.getEmail (),
                employee.getAddress (),
                employee.getSalary (),
                employee.getOccupation (),
                employee.getPassword (),
                employee.getDateOfBirth (),
                employee.getGender (),
                employee.getDate (),
                employee.getPaymentDueTo(),
                employee.getPic (),employee.isAdmin ()
        ));
    }

    //Update Method
    @Override
    public EmployeeDTO updateUser(String id) {
        Employee employee = employeeDAO.findOne (id);
        return new EmployeeDTO (employee.getIdNo (),
                employee.getName (),
                employee.getMobileNumber (),
                employee.getEmail (),
                employee.getAddress (),
                employee.getSalary (),
                employee.getOccupation (),
                employee.getPassword (),
                employee.getDateOfBirth (),
                employee.getGender (),
                employee.getDate () ,
                employee.getPaymentDueTo (),
                employee.getPic (),employee.isAdmin ());
    }

    //Delete Method
    @Override
    public void deleteUser(String userCode) { employeeDAO.delete (userCode); }

    //Search All Employees Method
    @Transactional(readOnly = true)
    @Override
    public List<EmployeeDTO> findAllEmployees() {
        Iterable <Employee> allItems = employeeDAO.findAll();
        List <EmployeeDTO> dtos = new ArrayList <> ();
        for (Employee employee : allItems) {
            dtos.add(new EmployeeDTO (
                    employee.getIdNo (),
                    employee.getName (),
                    employee.getMobileNumber (),
                    employee.getEmail (),
                    employee.getAddress (),
                    employee.getSalary (),
                    employee.getOccupation (),
                    employee.getPassword (),
                    employee.getDateOfBirth (),
                    employee.getGender (),
                    employee.getDate (),
                    employee.getPaymentDueTo ()
                     ,employee.getPic (),employee.isAdmin ()
            ));
        }
        return dtos;
    }

    //Find Single User
    @Override
    public EmployeeDTO findUser(String itemCode) {
        return null;
    }

    //Get Last Employee Method
    @Override
    public String getLastUserCode() {
        return null;
    }

    @Override
    public boolean exists(String i) {
        if ( employeeDAO.exists (  ( i ) )) {
            return true;
        }
        return false;
    }
    @Override
    public Employee findByIdNoAndPassword(String idNo, String password) {
        return employeeDAO.findByIdNoAndPassword(idNo, password);
    }

}