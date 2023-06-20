import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    double t=rbt.nextDouble();
    double s=rbt.nextDouble();
    double d=s*t;
    double ans=d/12;
    System.out.printf("%.3f\n",ans);
    }
}