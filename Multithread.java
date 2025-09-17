class MultithreadingDemo extends Thread {
public MultithreadingDemo(String name) {
        super(name); 
    }
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
public class Multithread {
    public static void main(String[] args)
    {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultithreadingDemo thread = new MultithreadingDemo("Thread-" + i);
            thread.start();
        }
    }
}