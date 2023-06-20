import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int r=rbt.nextInt();
    double pi=3.14159;
    double v=(4.0/3)*pi*r*r*r;
    System.out.printf("VOLUME = %.3f\n", v);
  }
}