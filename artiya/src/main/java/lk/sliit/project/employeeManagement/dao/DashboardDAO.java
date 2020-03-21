package lk.sliit.project.employeeManagement.dao;

import lk.sliit.project.employeeManagement.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 16-Mar-20
 */
public interface DashboardDAO extends CrudRepository <Employee, Integer> {

    @Query(value = "SELECT COUNT(idNo) FROM employee", nativeQuery = true)
    String findUserCount();

    @Query(value = "SELECT COUNT(gender) FROM employee where gender = 'male' ", nativeQuery = true)
    String findMaleCount();
}
