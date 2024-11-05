public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Polymorphism Test
        Robin b = new Robin();
        b.sing();
        Pelican p = new Pelican();
        p.sing("PELICAN OVERLOAD");
        p.sing();


    }
}

