import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    for(int i=1; i<=x; i++){
      if(i%2!=0){
      System.out.println(i);
      }
    }
  }
}
