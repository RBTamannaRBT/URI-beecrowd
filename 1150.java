import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    int sum=0, c=0;
    int z=0;
    boolean stop=false;
    while(!stop){
      z=rbt.nextInt();
      if(z>x){
        stop=true;
      }
    }
    boolean tham=false;
    while(!tham){
      sum+=x;
      x++;
      c++;
      if(sum>z){
        tham=true;
      }
    }
    System.out.println(c);
  }
}