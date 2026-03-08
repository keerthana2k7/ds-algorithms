package Threads;

class MultiThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }

    public static void main(String[] args) {

        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();

        t1.start(); 
        t2.start();

        System.out.println("Main thread running...");
    }
}