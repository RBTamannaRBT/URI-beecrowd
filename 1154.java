import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    boolean stop=false;
    int a, sum=0;
    double c=0;
    while(!stop){
     a=rbt.nextInt();
    if(a<0){
    stop=true;
    }
    else if(a>0){
    sum+=a;
    c++;
    }
    }
    System.out.printf("%.2f\n",(sum/c));
  }
}