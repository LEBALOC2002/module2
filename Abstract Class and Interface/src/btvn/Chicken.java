package btvn;

public class Chicken extends Animal implements  Runable,Flyable , Barkable{
    public Chicken(String name) {
        super(name);
    }

    public Chicken() {

    }

    @Override
    public String makeSound() {
        return super.getName() + " gáy ó ò ó ò ";
    }

    @Override
    public String flyable() {
        return super.getName() + " bay được ";
    }

    @Override
    public String runable() {
        return super.getName()+ " có thể chạy";
    }
}
