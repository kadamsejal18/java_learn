public class Add{
public static void main(String[] args){
Float[] marks = {20.3f,50.6f,98.5f,65.7f,56.6f};
Float sum = 0.0f;
for(Float element : marks){
sum += element;
}
System.out.println("the value is :"  +sum);
}
}