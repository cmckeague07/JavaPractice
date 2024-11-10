import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String [] args){
        /**Queue Interface (part of java.util package): This can be implemented using classes like LinkedList or PriorityQueue.
         First-In-First-Out (FIFO): Elements are added at the end and removed from the front.
         Use Cases: Ideal for scheduling and buffering tasks.
         **/
        Queue<String> printerQueue = new LinkedList<>();
        printerQueue.add("Document1.pdf");
        String nextDoc = printerQueue.remove(); // Removes the first element
        String frontDoc = printerQueue.peek(); // Views the first element

        if (printerQueue.isEmpty()) {
            System.out.println("The printer queue is empty.");
        }

        while (!printerQueue.isEmpty()) {
            String doc = printerQueue.remove();
            System.out.println("Printing: " + doc);
        }

        for (String doc : printerQueue) {
            System.out.println("Document in queue: " + doc);
        }


        LinkedList<String> list = new LinkedList<>();
        list.add("Node1");
        list.add("Node2");
        list.addFirst("Node0");
        list.add(1, "NewNode");
        list.removeFirst();
        list.removeLast();
        String first = list.getFirst();
        String last = list.getLast();
        for (String element : list) {
            System.out.println(element);
        }


    }
}
