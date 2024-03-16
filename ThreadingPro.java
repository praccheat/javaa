class ThreadingPro implements Runnable {
    Thread t;

    ThreadingPro() {
        t = new Thread(this);
        System.out.println("Thread is in new state");
    }

    public void run() {
        System.out.println("Thread is in runnable state");
        
        System.out.println("Thread execution completed");
    }

    public static void main(String[] args) {
        ThreadingPro child = new ThreadingPro();
        child.t.start();
    }
}
