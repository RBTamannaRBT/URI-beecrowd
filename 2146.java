import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    while(rbt.hasNext())
    {
      int n=rbt.nextInt();
      System.out.println(n-1);
    }
  }
}