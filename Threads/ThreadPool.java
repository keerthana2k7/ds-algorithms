package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            int task = i;

            executor.execute(() -> {
                System.out.println("Executing Task " + task);
            });
        }

        executor.shutdown();
    }
}
