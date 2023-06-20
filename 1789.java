import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    while(rbt.hasNext())
    {
      int l=rbt.nextInt();
      int a=0,b=0,c=0;
      for(int i=1; i<=l; i++)
      {
        int v=rbt.nextInt();
        if(v<10)
        {
          a++;
        }
        else if(v>=10 && v<20)
        {
          b++;
        }
        else if(v>=20)
        {
          c++;
        }
      }
      if(c>0)
      {
        System.out.println(3);
      }
      else if(b>0)
      {
        System.out.println(2);
      }
      else if(a>0)
      {
        System.out.println(1);
      }
    }
  }
}
