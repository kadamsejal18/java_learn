public class IsAliveExample extends Thread {  
    public void run() {  
        try { 
            Thread.sleep(3000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }  
    public static void main(String[] args) {  
        IsAliveExample thread = new IsAliveExample();  
        System.out.println("Thread status before starting: " + thread.isAlive());  
        thread.start();  
        System.out.println("Thread status after starting: " + thread.isAlive());  
        try {  
            thread.join();  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("Thread status after completion: " + thread.isAlive());  
    }  
}  