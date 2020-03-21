package lk.sliit.project.employeeManagement.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 19-Mar-20
 */
@Entity
public class Attendance implements SuperEntity {

    @Id
    private int attendanceId;
    @Column(nullable = true)
    private double salary;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Temporal(TemporalType.TIME)
    private Date inTime;
    @Temporal(TemporalType.TIME)
    private Date outTime;
    @Column(nullable = true)
    private double overtimeHours;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "employeeId", referencedColumnName = "idNo", nullable = false)
    private Employee employee;

    Attendance() {}

    public Attendance(int attendanceId, double salary, Date date, Date inTime, Date outTime, double overtimeHours, Employee employee) {
        this.attendanceId = attendanceId;
        this.salary = salary;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.overtimeHours = overtimeHours;
        this.employee = employee;
    }

    public int getPid() {
        return attendanceId;
    }

    public void setPid(int attendanceId) {
        this.attendanceId = attendanceId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceId=" + attendanceId +
                ", salary=" + salary +
                ", date=" + date +
                ", inTime=" + inTime +
                ", outTime=" + outTime +
                ", overtimeHours=" + overtimeHours +
                ", employee=" + employee +
                '}';
    }
}
