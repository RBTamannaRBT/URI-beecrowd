import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    while(!stop){
      int x=rbt.nextInt();
      int  y=rbt.nextInt();
      if(x==y){
        stop=true;
      }
      else if(x>y){
        System.out.println("Decrescente");
      }
      else if(y>x){
        System.out.println("Crescente");
      }
    }
  }
}