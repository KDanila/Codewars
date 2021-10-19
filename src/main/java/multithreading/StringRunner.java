package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class StringRunner implements Runnable {
    private BlockingQueue<String> queue;

    public StringRunner(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    public void run() {
        int iii = 0;
        try {
            while (true) {
                if(iii == 3){

                }
                iii++;
                String string = queue.poll(3, TimeUnit.SECONDS);
                Thread.sleep(1000);
                System.out.println(string);
                System.out.println(Thread.currentThread().isInterrupted());
            }
        } catch (InterruptedException e) {
            // Restore the interrupted status
            Thread.currentThread().interrupt();
        }
    }
}
