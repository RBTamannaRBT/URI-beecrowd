import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int c=0;
    for(int i=1; i<=6; i++){
      float a=rbt.nextFloat();
      if(a>0){
        c++;
      }
    }
    System.out.println(c+" valores positivos");
  }
}
