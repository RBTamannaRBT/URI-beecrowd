import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      int a=rbt.nextInt();
      if(a==0){
        System.out.println("NULL");
      }
      if(a>0 && a%2==0){
        System.out.println("EVEN POSITIVE");
      }
      if(a<0 && a%2==0){
        System.out.println("EVEN NEGATIVE");
      }
      if(a>0 && a%2!=0){
        System.out.println("ODD POSITIVE");
      }
      if(a<0 && a%2!=0){
        System.out.println("ODD NEGATIVE");
      }
    }
  }
}