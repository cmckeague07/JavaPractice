import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args){

        //List is backed by an array
        List<String> colours = new ArrayList<>();
        colours.add("blue");
        colours.add("purple");
        System.out.println(colours.size());
        System.out.println(colours.contains("orange"));
        System.out.println("purple");
        System.out.println(colours);

        colours.forEach(System.out::println);

        for(String colour : colours){
            System.out.println(colour);
        }


    }
}
