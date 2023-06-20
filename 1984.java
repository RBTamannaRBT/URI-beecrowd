import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    long n=rbt.nextLong();
    String s=""+n;
    for(int i=s.length()-1; i>=0; i--)
    {
    System.out.print(s.charAt(i));
    }
    System.out.println();
  }
}