public class Main {
    public static void main(String[] args) {

        Birds b = new Birds("Parrot", 5);
        b.sound();
        System.out.println("Name : "+ b.getName());
        System.out.println("Age : "+ b.getAge());

        Mammals m = new Mammals("Human  ",20,12);
        m.life();
        System.out.println("Name : "+ m.getName());
        System.out.println("Age : "+ m.getAge());

        Reptiles r = new Reptiles("crocodile", 10);
        r.life();
        System.out.println("Name : "+ r.getName());
        System.out.println("Age : "+ r.getAge());

    }
}