import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int c=0;
    double sum=0;
    for(int i=1; i<=6; i++){
      float a=rbt.nextFloat();
      if(a>0){
        sum=sum+a;
        c++;
      }
    }
    System.out.println(c+" valores positivos");
    System.out.printf("%.1f\n",sum/c);
  }
}
