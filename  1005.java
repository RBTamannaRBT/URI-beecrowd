import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
 
       Scanner rbt=new Scanner(System.in);
       float a=rbt.nextFloat();
       float b=rbt.nextFloat();
 System.out.printf("MEDIA = %.5f\n", (a*3.5+b*7.5)/(3.5+7.5));
    }
 
}