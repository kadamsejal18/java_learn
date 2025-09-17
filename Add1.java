public class Add1{
public static void main(String[] args){
float[] marks={45.30f,63.45f,2.20f,58.6f};
float num = 45.30f;
boolean isInArray= false;
for(float element : marks){
if(num==element){
isInArray = true;
break;
}
}
if(isInArray){
System.out.println("The value is presnted in this");
}
else{
System.out.println("The value is not presented in this");
}
}
}

