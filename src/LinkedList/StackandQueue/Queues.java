package LinkedList.StackandQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {

    /*
    * Kenapa ArrayDeque?
      Lebih cepat dari Stack karena gak pakai Vector (yang synchronized)

      Lebih cepat dari LinkedList karena pakai array dinamis

      Tidak ada kapasitas tetap, auto resize kayak ArrayList

      Tidak boleh menyimpan null
    *
     */

    public static void main(String[] args) {
        Queue<String> str = new ArrayDeque<>();
        str.add("Pertama");
        str.add("Kedua");
        str.add("Ketiga");

        System.out.println(str.toString());
        System.out.println(str.peek()); // see the first element

        str.poll(); // Similar to pop() method in stack except it removes the first element that added in the queue
                    // Remember that queue data structure has a FIFO structure (First In, First Out)

        System.out.println(str.toString());
    }
}
