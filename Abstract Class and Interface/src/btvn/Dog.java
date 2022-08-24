package btvn;

 public class Dog  extends  Animal implements Barkable,Runable{

     public Dog(String name) {
         super(name);
     }

     @Override
     public String makeSound() {
         return super.getName() + " sủa gâu - gâu";
     }

     @Override
     public String runable() {
         return super.getName() + " chạy được";
     }

 }