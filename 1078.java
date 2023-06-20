import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=10; i++){
      System.out.println(i+" x "+n+" = "+(i*n));
    }   
  }
}