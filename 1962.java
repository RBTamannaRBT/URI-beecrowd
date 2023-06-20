import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    
    for(int i=1; i<=n; i++)
    {
      int t=rbt.nextInt();
      if(t>=2015) System.out.println(t-2014+" A.C.");
      else System.out.println(2015-t+" D.C.");
    }
  }
}