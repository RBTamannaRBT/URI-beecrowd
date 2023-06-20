import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int qt=rbt.nextInt();
    for(int i=1; i<=qt; i++)
    {
      String p1=rbt.next();
      String c1=rbt.next();
      String p2=rbt.next();
      String c2=rbt.next();
      int n=rbt.nextInt();
      int m=rbt.nextInt();
      if(c1.charAt(0)=='P')
      {
        if((n+m)%2==0) System.out.println(p1);
        else System.out.println(p2);
      }
      else
      {
        if((n+m)%2==0) System.out.println(p2);
        else System.out.println(p1);
      }
    }
  }
}