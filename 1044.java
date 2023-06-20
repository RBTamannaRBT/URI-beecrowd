import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int a=rbt.nextInt();
    int b=rbt.nextInt();
    if(b>a){
      if(b%a==0){
        System.out.println("Sao Multiplos");
      }
      else{
        System.out.println("Nao sao Multiplos");
      }
    }
    else{
      if(a%b==0){
        System.out.println("Sao Multiplos");
      }
      else{
        System.out.println("Nao sao Multiplos");
      }
    }
  }
}