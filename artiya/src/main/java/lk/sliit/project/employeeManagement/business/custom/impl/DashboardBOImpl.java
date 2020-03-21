package lk.sliit.project.employeeManagement.business.custom.impl;

import lk.sliit.project.employeeManagement.business.custom.DashboardBO;
import lk.sliit.project.employeeManagement.dao.DashboardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 16-Mar-20
 */
@Service
@Transactional
public class DashboardBOImpl implements DashboardBO {

    @Autowired
    private DashboardDAO dashboardDAO;

    //Find Total Count Manual Query Method
    @Override
    public String getAllEmployeeCount() { return dashboardDAO.findUserCount (); }

    @Override
    public String getMaleCount() {
        return dashboardDAO.findMaleCount();
    }
}
