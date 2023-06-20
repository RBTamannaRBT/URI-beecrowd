import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int a=rbt.nextInt();
    int b=rbt.nextInt();
    int c=rbt.nextInt();
    if(a-b==0) System.out.println("S");
    else if(c-b==0) System.out.println("S");
    else if(c-a==0) System.out.println("S");
    else if((a+c)-b==0) System.out.println("S");
    else if((a+b)-c==0) System.out.println("S");
    else if((b+c)-a==0) System.out.println("S");
    else System.out.println("N");
  }
}