import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    while(rbt.hasNext())
    {
     double v=rbt.nextDouble();
     double d=rbt.nextDouble();
     double a=3.14*(d/2.0)*(d/2.0);
     System.out.printf("ALTURA = %.2f\n",(v/a));
     System.out.printf("AREA = %.2f\n",a);
    }
  }
}