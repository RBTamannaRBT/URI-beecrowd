import java.util.Scanner;
public class Main {
  
  public static void main(String[] args){
    
    Scanner rbt=new Scanner(System.in);
    float a=rbt.nextFloat();
    float b=rbt.nextFloat();
    float C=rbt.nextFloat();
    System.out.printf("MEDIA = %.1f\n", (a*2+b*3+C*5)/(2+3+5));
  }
  
}