public class Constructors {


    public static void main(String[] args) {
        System.out.println("Hello world! Constructors");
        Constructors first = new Constructors("Blue", 3);
        first.displayInfo();
    }

    private String colour;
    private int button;

    public Constructors(String colour, int button){
        this.colour = colour; // Initialize colour
        this.button = button; // Initialize button
      }

    // Method to display shirt information
    public void displayInfo() {
        System.out.println("Shirt Colour: " + colour);
        System.out.println("Number of Buttons: " + button);
    }

    //GETTERS AND SETTER
    public String getColour() {
        return colour; // Return the value of colour
    }
    public void setColour(String colour) {
        this.colour = colour; // Set the value of colour
    }
    // Getter for button
    public int getButton() {
        return button;
    }

    // Setter for button
    public void setButton(int button) {
        this.button = button;
    }
}


