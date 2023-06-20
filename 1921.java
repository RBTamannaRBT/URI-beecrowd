import java.util.Scanner;
public class Main
{
  public static void main(String[]args)
  {
    Scanner rbt=new Scanner(System.in);
    
    long n=rbt.nextLong();
    System.out.println(n*(n-3)/2);
    
  }
}