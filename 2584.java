import java.util.Scanner;
public class Main
{
  public static void main(String[] args) 
  {
    Scanner rbt = new Scanner(System.in);
    int c=rbt.nextInt();
    for(int i=1; i<=c; i++)
    {
       int n=rbt.nextInt();
     System.out.printf("%.3f\n",( (5*Math.pow(n,2))/(4*Math.sqrt(5-2*Math.sqrt(5)))));
    }
  }
}