import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    
    while(!stop)
    {
      int x=rbt.nextInt();
      int sum=0;
      if(x==0)
      {
        stop=true;
      }
      else
      {
        if(x%2==0)
        {
          for(int i=1; i<=5; i++)
          {
            sum+=x;
            x=x+2;
          }
          System.out.println(sum);
        }
        else
        {
          x=x+1;
          for(int i=1; i<=5; i++)
          {
            sum+=x;
            x=x+2;
          }
          System.out.println(sum);
        }
      }
    }
  }
}
