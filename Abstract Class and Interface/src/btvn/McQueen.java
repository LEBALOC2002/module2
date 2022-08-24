package btvn;

public class McQueen extends Machine implements Runable{
    public McQueen(String name) {
        super(name);
    }

    @Override
    public String runable() {
        return super.getName()+ "chạy được ";
    }
}
