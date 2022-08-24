package Bai_tap_13;

import java.util.List;

public class Fresher extends Employee {
    private int Graduation_date;
    private String Graduation_rank;

    public Fresher() {

    }

    public Fresher ( int id, String fullName, String Birthday, int phone, String Email ,int employee_type,int Graduation_date, String Graduation_rank  , List<Certificate> certificatelist ) {
        super(id,fullName,Birthday,phone,Email,employee_type,employee_count,certificatelist);
        this.Graduation_rank = Graduation_rank ;
        this.Graduation_date = Graduation_date;
    }

    public int getGraduation_date() {
        return this.Graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        this.Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return this.Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.Graduation_rank = graduation_rank;
    }


    @Override
    public void ShowInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "Graduation_date=" + Graduation_date +
                ", Graduation_rank='" + Graduation_rank + '\'' +
                ", FullName='" + FullName + '\'' +
                ", Birthday=" + Birthday +
                ", phone=" + phone +
                ", Email='" + Email + '\'' +
                ", employee_type=" + employee_type +
                ", certificatelist=" + certificatelist +
                '}';
    }
}
