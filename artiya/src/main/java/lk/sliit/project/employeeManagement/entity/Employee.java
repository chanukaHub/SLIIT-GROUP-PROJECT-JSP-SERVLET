package lk.sliit.project.employeeManagement.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Rivindu-Wijayarathna
 * Date: 08-Mar-20
 */
@Entity
public class Employee implements SuperEntity {
    @Id
    private String idNo;
    private String name;
    private int mobileNumber;
    private String email;
    private String address;
    private double salary;
    private String occupation;
    private String password;
    private Date dateOfBirth;
    @Column(nullable = true)
    private String gender;
    private Date date;
    private String Pic;
    private boolean admin;

    @Column(nullable = true)
    private int paymentDueTo;
    @OneToMany(mappedBy = "employee", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    private List <Attendance> attendance = new ArrayList <> ( );


    public Employee() {
    }

    public Employee(String idNo, String name, int mobileNumber, String email, String address, double salary,
                    String occupation, String password, Date dateOfBirth, String gender, Date date,
                    int paymentDueTo,  String Pic,boolean admin) {
        this.idNo = idNo;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.address = address;
        this.salary = salary;
        this.occupation = occupation;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.date = date;
        this.Pic = Pic;
        this.paymentDueTo = paymentDueTo;
        this.admin = admin;

    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String Pic) {
        this.Pic = Pic;
    }

    public int getPaymentDueTo() {
        return paymentDueTo;
    }

    public void setPaymentDueTo(int paymentDueTo) {
        this.paymentDueTo = paymentDueTo;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idNo=" + idNo +
                ", name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", occupation='" + occupation + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", Pic='" + Pic + '\'' +
                ", admin=" + admin +
                ", paymentDueTo=" + paymentDueTo +
                '}';
    }
}
