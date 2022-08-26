package demo;

public class Demo {

    static class People {
        private int id;
        private String name;
        private int age;

        public People() {
        }

        public People(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "People{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


    public static void main(String[] args) {
//        int a = 5;
//        int b = a;
//
//        a = 10;
//
//        System.out.println(a);
//        System.out.println(b);

//        People nva = new People(1, "NVA", 18);
//        People nvb = nva;
//
//        nvb.setAge(21);
//
//        System.out.println(nva);
//        System.out.println(nvb);
    }
}
