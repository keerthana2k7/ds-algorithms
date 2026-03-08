package Threads;

class RunnableInterface implements Runnable {

    public void run() {
        System.out.println("Thread created using Runnable interface");
    }

    public static void main(String[] args) {
        RunnableInterface obj = new RunnableInterface();
        Thread t = new Thread(obj);
        t.start();
    }
}
