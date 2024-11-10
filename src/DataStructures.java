import java.util.Arrays;

public class DataStructures {

    /**This class shows the following:
        1. How to create each data structure
        2. How to add/remove elements for each data structure
        3. How to access and print out your elements in the data structure
     **/
    public static void main(String[] args){

        // Arrays
        // Create array and populate values
        System.out.println("-------------------------------------------");
        System.out.println("ARRAYS:");
        String [] strings = {"1", "2", "3"};
        strings[0] = "Blue";
        System.out.println(Arrays.toString(strings));

        Integer [] myColours = new Integer [5];
        for(int i = 0; i<myColours.length; i++){
            myColours[i] = i;
            System.out.print(myColours[i] + " ");
        }
        System.out.println("");

        //2D Arrays
        System.out.println("-------------------------------------------");
        System.out.println("2D ARRAYS:");
        char[][] tictac = new char[4][4];
        for(int i = 0; i<tictac.length; i++){
            for(int j =0; j< tictac[i].length; j++){
                System.out.print(tictac[i][j] = '+');
            }
            System.out.println();
        }
        //Arrays.deepToString() is used to print the 2D array in a readable format.
        System.out.println(Arrays.deepToString(tictac));

        char[][] tictactwo = new char[][]{
                new char[]{'1','2','3'},
                          {'x','y','z'}
        };
        for (int i = 0; i<tictactwo.length; i++){
            for(int j = 0; j<tictactwo[i].length; j++){
                System.out.print(tictactwo[i][j]);
            }
        }

    }

}
