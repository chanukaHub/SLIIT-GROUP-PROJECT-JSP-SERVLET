package lk.sliit.project.employeeManagement.controller;

import com.mysql.jdbc.Wrapper;
import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 20-Mar-20
 */
@Controller
public class TablesController {
    @Autowired
    EmployeeBO employeeBO;

    @RequestMapping("tables")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView ( "tables" );
        mav.addObject ( "listEmployeesTable", employeeBO.findAllEmployees ( ) );
        return mav;
    }


}
