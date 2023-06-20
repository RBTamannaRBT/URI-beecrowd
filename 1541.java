import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    boolean f=false;
    while(!f)
    {
      int  a=rbt.nextInt();
      if(a==0)
      {
        f=true;
        break;
      }
      else 
      {
        int  b=rbt.nextInt();
        int  c=rbt.nextInt();
        System.out.println((int)(Math.pow(a*b*100/c,0.5)));
      }
    }
  }
}
