import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    int y=rbt.nextInt();
    if(x<y){
      for(int i=1; i<=y; i++){
        if(i%x==0|| i==y){
         System.out.print(i);
        }
        else{
        System.out.print(i+" ");
        }
        if(i%x==0 || i==y){
          System.out.println();
        }
      }
    }
  }
}