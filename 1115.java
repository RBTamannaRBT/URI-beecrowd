import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    while(!stop){
      int x=rbt.nextInt();
      int  y=rbt.nextInt();
      if(x==0 || y==0){
        stop=true;
      }
      else if(x>0 && y>0){
        System.out.println("primeiro");
      }
      else if(x>0 && y<0){
        System.out.println("quarto");
      }
      else if(x<0 && y<0){
        System.out.println("terceiro");
      }
      else if(x<0 && y>0){
        System.out.println("segundo");
      }
    }
  }
}