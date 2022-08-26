package getter_setter;

public class person {
    private  int age;
    private String name ;
    private  boolean gender ;
    private int person;

    public person (int age , String name , boolean gender ){
         this.age = age;
         this.name = name ;
         this.gender= gender;
    }


    public int getAge() {
        return setAge(person);
    }

    public int setAge(int age) {
        if (age <=0 ){
            System.out.println("invalid age");
            return age;
        }
        this.age = age;
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
