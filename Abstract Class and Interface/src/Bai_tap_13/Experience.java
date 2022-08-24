package Bai_tap_13;

import java.util.List;

public class Experience extends Employee{
    private int expInYear;
    private String ProSkill ;
    public Experience (){

    }

    public Experience ( int id, String fullName, int Birthday, int phone, String Email , int employee_type, List<Certificate> certificatelist ,int ExpInYear , String ProSkill ) {
        super(id,fullName,Birthday,phone,Email,employee_type, certificatelist) ;
        this.ProSkill= ProSkill;
        this.expInYear = ExpInYear ;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "expInYear=" + expInYear +
                ", ProSkill='" + ProSkill + '\'' +
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
