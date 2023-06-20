import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int x=rbt.nextInt();
    if(x%2==0){
    for(int i=x+1; i<=x+12; i=i+2){
      System.out.println(i);
      }
    }
    else{
    for(int i=x; i<=x+12; i=i+2){
      System.out.println(i);
      }
    }
  }
}
