import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new  Scanner(System.in);
    int a=rbt.nextInt();
    int b=rbt.nextInt();
    int c=rbt.nextInt();
    if(b<a && c>=b) System.out.println(":)");
    else if(b>a && c<=b) System.out.println(":(");
    else if(b>a && (c-b)<(b-a)) System.out.println(":(");
    else if(b>a && (c-b)>=(b-a)) System.out.println(":)");
    else if(b<a && (b-c)<(a-b)) System.out.println(":)");
    else if(b<a && (b-c)>=(a-b)) System.out.println(":(");
    else if(a==b)
    {
      if(c>b)
      {
        System.out.println(":)");
      }
      else 
      {
        System.out.println(":(");
      }
    }
  }
}