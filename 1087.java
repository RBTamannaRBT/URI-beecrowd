import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner rbt = new Scanner(System.in);
    boolean flag=false;
    while(!flag) 
    {
      int x1 = rbt.nextInt();
      int y1 = rbt.nextInt();
      int x2 = rbt.nextInt();
      int y2 = rbt.nextInt();
      if(x1==0 || x2==0 || y1==0 || y2==0 )
      {
        break;
      }
      else if(x2==x1 && y2==y1) 
      {
        System.out.println(0);
      }
      else if(x2==x1 || y2==y1) 
      {
        System.out.println(1);
      }
      else if(x2 - x1 == y2 - y1 || x2 - x1 == -(y2 - y1))
      {
        System.out.println(1);
      }
      else 
      {
        System.out.println(2);
      }
    }
  }
}