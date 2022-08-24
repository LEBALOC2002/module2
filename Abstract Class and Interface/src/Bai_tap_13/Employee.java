package Bai_tap_13;

import java.util.List;

public abstract class Employee {
    protected  static int id;
    protected  String FullName;
    protected  String Birthday;
    protected  int phone;
    protected  String Email;
    protected  int employee_type ;
    public static int  employee_count = 0;
    protected List<Certificate> certificatelist ;

    public Employee() {

    }

    public Employee( int id, String fullName, String Birthday, int phone, String Email ,int employee_type,int employee_count,List<Certificate> certificatelist  ) {
        this.id = id;
        this.FullName = fullName;
        this.phone = phone;
        this.Birthday= Birthday ;
        this.Email = Email;
        this.employee_type = employee_type ;
        this.employee_count++;
        this.certificatelist = certificatelist ;
    }

    public Employee(int id, String fullName, int birthday, int phone, String email, int employee_type, List<Certificate> certificatelist) {
    }


    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getEmployee_type() {
        return employee_type;
    }

    public void setEmployee_type(int employee_type) {
        this.employee_type = employee_type;
    }

    public static int getEmployee_count() {
        return employee_count;
    }

    public List<Certificate> getCertificatelist() {
        return certificatelist;
    }

    public void setCertificatelist(List<Certificate> certificatelist) {
        this.certificatelist = certificatelist;
    }

    public abstract void ShowInfo ();

    @Override
    public String toString() {
        return "Employee{" +
                "FullName='" + FullName + '\'' +
                ", Birthday=" + Birthday +
                ", phone=" + phone +
                ", Email='" + Email + '\'' +
                ", employee_type=" + employee_type +
                ", certificatelist=" + certificatelist +
                '}';
    }
}
