import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int t=rbt.nextInt();
    for(int i=0; i<t; i++)
    {
      int r1=rbt.nextInt();
      int r2=rbt.nextInt();
      System.out.println(r1+r2);
    }
  }
}
