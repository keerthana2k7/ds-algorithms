package Threads;

class ThreadClass extends Thread {

    public void run() {
        System.out.println("Thread created using Thread class");
    }

    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        t.start();
    }
}
