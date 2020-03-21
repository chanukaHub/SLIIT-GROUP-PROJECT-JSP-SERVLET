package lk.sliit.project.employeeManagement.controller;

import jdk.nashorn.internal.runtime.PrototypeObject;
import lk.sliit.project.employeeManagement.business.custom.DashboardBO;
import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import lk.sliit.project.employeeManagement.dto.EmployeeDTO;
import lk.sliit.project.employeeManagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Controller
public class FormValidationControl {

    //Automate Object Creation
    @Autowired
    private EmployeeBO employeeBO;
    @Autowired
    private DashboardBO dashboardBO;
    private  String path ="";
    private  File file ;


    //Load Employee add form from form_validation.jsp
    @RequestMapping("/form_validation")
    public String registration(HttpServletRequest request) {
        request.setAttribute ( "mode", "MODE_REGISTER" );
        return "form_validation";
    }

    //Save Employee from form_validation.jsp
    @PostMapping("Dashboards")
    public String registerUser(@ModelAttribute EmployeeDTO employee, HttpServletRequest request, Model model) throws IOException {

        employeeBO.save ( employee );
        path = "C:/Users/User/Desktop/e/" + employee.getPic ();
        file = new File(path);
        BufferedImage cp, img;
        img = ImageIO.read(file);
        cp = deepCopy(img,employee);
        model.addAttribute ( "employeeCountDashBoard", dashboardBO.getAllEmployeeCount ( ) );
//        new Alert(Alert.AlertType.CONFIRMATION, " Success ").showAndWait();
        return "redirect:/Dashboard";
    }

    private BufferedImage deepCopy(BufferedImage bi, EmployeeDTO employee) throws IOException {
        String saveAs =employee.getPic () ;
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        BufferedImage cImg = new BufferedImage(cm, raster, isAlphaPremultiplied, null);
        File saveImage = new File("D:\\JSP SERVlet\\artiya\\src\\main\\webapp\\images\\icons", saveAs);
        ImageIO.write(cImg, "jpg", saveImage);
        ImageIO.write(cImg, "png", saveImage);
        return cImg;
    }


}
