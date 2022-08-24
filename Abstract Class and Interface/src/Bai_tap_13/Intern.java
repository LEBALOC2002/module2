package Bai_tap_13;

import java.util.List;

public class Intern extends Employee {
    private int Semester;
    private String Majors;
    private String University_name;

    public Intern() {

    }
    public Intern (int id, String fullName, String Birthday, int phone, String Email ,int employee_type,int Semester, String Majors, String University_name , List<Certificate> certificatelist){
        super(id,fullName,Birthday,phone,Email,employee_type,employee_count,certificatelist);
        this.University_name= University_name;
        this.Semester = Semester ;
        this.Majors = Majors ;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String majors) {
        Majors = majors;
    }

    public String getUniversity_name() {
        return this.University_name;
    }

    public void setUniversity_name(String university_name) {
        this.University_name = university_name;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "Semester=" + Semester +
                ", Majors='" + Majors + '\'' +
                ", University_name='" + University_name + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Birthday=" + Birthday +
                ", phone=" + phone +
                ", Email='" + Email + '\'' +
                ", employee_type=" + employee_type +
                ", certificatelist=" + certificatelist +
                '}';
    }

    @Override
    public void ShowInfo() {
        System.out.println(this);
    }
}
