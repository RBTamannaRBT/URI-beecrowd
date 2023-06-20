import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      int x=rbt.nextInt();
      int y=rbt.nextInt();
      double d=1;
      if(y==0){
        System.out.println("divisao impossivel");
      }
      else{
        d=(double)x/y;
        System.out.println(d);
      }
    }
  }
}