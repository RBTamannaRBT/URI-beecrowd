import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean tham=false;
    while(!tham)
    {
      double sum=0;
      for(int i=1; i<=2; )
      {
        double n=rbt.nextDouble();
        if(n>=0 && n<=10)
        {
          sum+=n;
          i++;
        }
        else
        {
          System.out.println("nota invalida");
        }
      }
      double a=sum/2;
      System.out.printf("media = %.2f\n",a);
      for(int i=0; i<1; i++)
      {
        System.out.println("novo calculo (1-sim 2-nao)");
        int x=rbt.nextInt();
        if(x==1)
        {}
        else if(x==2)
        {
        tham=true;
        }
        else
        {
        i--;
        }
      }
    }
  }
}
