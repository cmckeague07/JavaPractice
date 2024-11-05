public class Polymorphism {

}


class Bird {
    public void sing(){
        System.out.println("TWEET");
    };
}

class Robin extends Bird {
    public void sing(){
        System.out.println("BOOP");
    }
}

class Pelican extends Bird{
    public void sing(String song){
        System.out.println("I AM A PELICAN");
    }
}