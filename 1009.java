import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    String name=rbt.next();
    float salary=rbt.nextFloat();
    float amount=rbt.nextFloat();
    double total=salary+amount*0.15;
    System.out.printf("TOTAL = R$ %.2f\n", total);
  }
}