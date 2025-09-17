import java.io.IOException;
class ThrowsExample {
    static void readFile() throws IOException {  
       throw new IOException("File not found");
    }
    public static void main(String[] args) {
        try{
            readFile();
        } catch (IOException e) {
            
            System.out.println("Caught an IOException: " + e.getMessage());
        }
    }
}
