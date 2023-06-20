import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    int a=1;
    if(0<n && n<13){
      for(int i=0; i<n; i++){
        a*=(n-i);
      }
      System.out.println(a);
    }
  }
}