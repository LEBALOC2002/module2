package btvn;

public class Fish extends Animal implements Swimable{
    public Fish(String name) {
        super(name);
    }

    @Override
    public String swimable()  {
        return super.getName() + " bơi được";
    }
}
