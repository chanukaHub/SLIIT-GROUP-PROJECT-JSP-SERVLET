package lk.sliit.project.employeeManagement.controller;

import lk.sliit.project.employeeManagement.business.custom.DashboardBO;
import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import lk.sliit.project.employeeManagement.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Controller
public class IndexController {
    @Autowired
    EmployeeBO employeeBO;
    @Autowired
    DashboardBO dashboardBO;

    //Initial Load Page http://localhost:8091
    @RequestMapping("/login")
    public String index(HttpServletRequest request) {
        request.setAttribute("mode", "MODE_LOGIN");
        return "index";
    }


    @PostMapping("Dashboard")
    public String registerUser(@ModelAttribute EmployeeDTO employee, HttpServletRequest request, Model model) throws IOException {
        if (employeeBO.findByIdNoAndPassword ( employee.getIdNo ( ), employee.getPassword ( ) ) != null) {
            int maleCount = Integer.parseInt ( dashboardBO.getMaleCount ( ) );
            int totalCount = Integer.parseInt ( dashboardBO.getAllEmployeeCount ( ) );
            int femaleCount = totalCount - maleCount;

            if (maleCount > 0) model.addAttribute ( "maleCountDashBoard", maleCount );
            else model.addAttribute ( "maleCountDashBoard", 0 );


            if (totalCount > 0) model.addAttribute ( "employeeCountDashBoard", totalCount );
            else model.addAttribute ( "employeeCountDashBoard", 0 );

            if (femaleCount > 0) model.addAttribute ( "femaleCountDashBoard", femaleCount );
            else model.addAttribute ( "femaleCountDashBoard", 0 );
            return "/Dashboard";
        } else {
            return "redirect:/login";
        }
    }
}
