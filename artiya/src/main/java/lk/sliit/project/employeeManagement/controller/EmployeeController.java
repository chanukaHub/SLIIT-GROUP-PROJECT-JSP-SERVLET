package lk.sliit.project.employeeManagement.controller;


import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Controller
public class EmployeeController {

    //Automate Object Creation
    @Autowired
    private EmployeeBO employeeBO;

    //Load All Employees to the Table In the tables_dynamic.jsp
    @RequestMapping("tables_dynamic")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView ( "tables_dynamic" );
        mav.addObject ( "listEmployeesTable", employeeBO.findAllEmployees ( ) );
        return mav;
    }

    //Delete Employee in the Table tables_dynamic.jsp
    @RequestMapping("delete")
    public String deleteUser(@RequestParam String idNo, HttpServletRequest request) {
        employeeBO.deleteUser ( idNo );
        request.setAttribute ( "listEmployeesTable", employeeBO.findAllEmployees ( ) );
        return "tables_dynamic";
    }

    //Update Employee in the Table tables_dynamic.jsp + form_validation
    @RequestMapping("edit-employee")
    public String editUser(@RequestParam String idNo, HttpServletRequest request) {
        request.setAttribute ( "employee", employeeBO.updateUser ( idNo ) );
        request.setAttribute ( "mode", "MODE_UPDATE" );
        return "form_validation";
    }
}
