import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    while(!stop){
      int x=rbt.nextInt();
      if(x>0){
        for(int i=1; i<=x; i++){
          if(i==x){
            System.out.print(i);
          }
          else{
            System.out.print(i+" ");
          }
        }
        System.out.println();
      }
      else if(x==0){
        stop=true;
      }
    }
  }
}