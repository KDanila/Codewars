package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;

public class Multi {


    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingQueue();
        queue.add("1");
        queue.add("2");
        Thread thread1 = new Thread(new StringRunner(queue));
        thread1.run();
        thread1.start();
        FutureTask<String> future = new FutureTask<>(() -> "yep");
    }


}
