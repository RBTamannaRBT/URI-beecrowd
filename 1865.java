import java.util.Scanner;
public class Main 
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int c=rbt.nextInt();
    for(int i=1; i<=c; i++)
    {
      String s=rbt.next();
      int n=rbt.nextInt();
      if(s.equals("Thor"))
        System.out.println("Y");
      else System.out.println("N");
    }
  }
}