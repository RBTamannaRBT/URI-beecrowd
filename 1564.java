import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    while(rbt.hasNext())
    {
      int n=rbt.nextInt();
      if(n==0)
      {
        System.out.println("vai ter copa!");
      }
      else if(n>0)
      {
        System.out.println("vai ter duas!");
      }
    }
  }
}
