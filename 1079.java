import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int n=rbt.nextInt();
    for(int i=1; i<=n; i++){
      float a=rbt.nextFloat();
      float b=rbt.nextFloat();
      float c=rbt.nextFloat();
      System.out.printf("%.1f\n",(a*2+b*3+c*5)/(2+3+5));
    }   
  }
}