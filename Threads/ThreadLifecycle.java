package Threads;

class ThreadLifecycle extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }

    public static void main(String[] args) throws Exception {

        ThreadLifecycle t = new ThreadLifecycle();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        Thread.sleep(500);
        System.out.println("State while sleeping: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
