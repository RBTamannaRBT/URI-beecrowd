import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    double a=rbt.nextDouble();
    double b=rbt.nextDouble();
    System.out.printf("%.2f",((b-a)*100.00/a));
    System.out.println("%");
  }
}