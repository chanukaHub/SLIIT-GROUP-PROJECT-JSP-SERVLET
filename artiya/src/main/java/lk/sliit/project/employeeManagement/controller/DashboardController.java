package lk.sliit.project.employeeManagement.controller;

import lk.sliit.project.employeeManagement.business.custom.DashboardBO;
import lk.sliit.project.employeeManagement.business.custom.EmployeeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Id;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.print.Book;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Controller
public class DashboardController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    //Automate Object Creation
    @Autowired
    private DashboardBO dashboardBO;
    @Autowired
    private EmployeeBO employeeBO;

    //Find Total Employee Count For DashBoard
    @RequestMapping("/Dashboard")
    public void dashboard(Model model) {
       DashBoardLoad ( model );
    }
    String DashBoardLoad(Model model){
        int maleCount = Integer.parseInt ( dashboardBO.getMaleCount ( ) );
        int totalCount = Integer.parseInt ( dashboardBO.getAllEmployeeCount ( ) );
        int femaleCount = totalCount - maleCount;

        if (maleCount > 0) model.addAttribute ( "maleCountDashBoard", maleCount );
        else model.addAttribute ( "maleCountDashBoard", 0 );


        if (totalCount > 0) model.addAttribute ( "employeeCountDashBoard", totalCount );
        else model.addAttribute ( "employeeCountDashBoard", 0 );

        if (femaleCount > 0) model.addAttribute ( "femaleCountDashBoard", femaleCount );
        else model.addAttribute ( "femaleCountDashBoard", 0 );
        return "Dashboard";
    }

    @RequestMapping("/contacts")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws ServletException,IllegalStateException, IOException {
        ModelAndView mav = new ModelAndView ( "contacts" );
        mav.addObject ( "countEmployee", employeeBO.findAllEmployees ( ) );
        return mav;
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        int bookId = Integer.parseInt(request.getParameter("id"));
//        BookDAO dao = new BookDAO();
//
//        try {
//            Book book = dao.get(bookId);
//
//            request.setAttribute("book", book);
//
//            String page = "/index.jsp";
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher(page);
//            requestDispatcher.forward(request, response);
//        } catch (SQLException ex) {
//            throw new ServletException (ex);
//        }

   // }
}
