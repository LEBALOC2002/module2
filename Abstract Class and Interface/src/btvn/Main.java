package btvn;

import animal.Tiger;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("chó");
        Chicken chicken = new Chicken("gà");
        Fish fish = new Fish("cá");
        Siddeley siddeley = new Siddeley("máy bay");
        McQueen mcQueen = new McQueen("siêu xe ");
        Object[] objects = {
                mcQueen,
                chicken,
                fish,
                siddeley,
                dog,
        };
        for (Object object : objects) {
            if (object instanceof Barkable) {
                System.out.println(((Barkable) object).makeSound());
            } if (object instanceof Flyable) {
                System.out.println(((Flyable) object).flyable());
            }
            if (object instanceof  Swimable) {
                System.out.println(((Swimable) object).swimable());
            }
            if (object instanceof Runable){
                System.out.println(((Runable) object).runable());
            }
        }
    }
}

