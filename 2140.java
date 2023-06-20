import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int []a={7,12,22,52,102,15,25,55,105,30,60,110,70,120,150};
    int c=0;
    boolean stop=false;
    while(!stop)
    {
      int n=rbt.nextInt();
      int m=rbt.nextInt();
      if(n==0 && m==0) stop=true;
      else
      {
        c++;
        int f=0;
        for(int i=0; i<a.length; i++)
        {
          if((m-n)==a[i])
          {
            f=1;
            break;
          }
        }
        if(f>0) System.out.println("possible");
        else System.out.println("impossible");
        
      }
    }
  }
}