import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    int a=rbt.nextInt();
    int b=rbt.nextInt();
    if(a>b) System.out.println(a);
    else System.out.println(b);
  }
}