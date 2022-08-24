package btvn;

public class Siddeley extends  Machine  implements  Flyable{
    public Siddeley(String name) {
        super(name);
    }

    @Override
    public String flyable() {
        return super.getName() + " - bay được ";
    }
}
