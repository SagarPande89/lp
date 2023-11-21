import java.util.*;

public class fifo {
    public static void main(String[] args) {
        // Predefined number of frames
        int n = 3;
        // Predefined reference string
        int[] referenceString = {1, 2, 3, 4, 1, 2, 5, 1, 2, 3, 4, 5};
        int f = 0, h = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int page : referenceString) {
            if (!queue.contains(page)) {
                if (queue.size() == n) {
                    queue.poll(); // Remove the least recently used page
                }
                queue.offer(page); // Add the new page to the end of the queue
                f++;
            } else {
                h++;
            }
        }

        double hitRatio = (double) h / (h + f);
        System.out.println("Faults: " + f);
        System.out.println("Hits: " + h);
        System.out.println("Hit Ratio: " + hitRatio);
    }
}
