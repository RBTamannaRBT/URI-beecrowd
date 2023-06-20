import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++)
    {
      if(i==n)
      {
        System.out.print("Ho!");
      }
      else
      {
        System.out.print("Ho ");
      }
    }
    System.out.println();
  }
}
