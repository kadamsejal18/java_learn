public class SingleThreadedExample {

    public static void main(String[] args) {
        SingleThreadedExample example = new SingleThreadedExample();
        example.performOperation();
        System.out.println("Program execution finished.");
    }
    public void performOperation() {
        System.out.println("Performing an operation...");
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operation completed.");
    }
}
