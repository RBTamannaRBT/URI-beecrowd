import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        double x1=rbt.nextDouble();
        double y1=rbt.nextDouble();
        double x2=rbt.nextDouble();
        double y2=rbt.nextDouble();
        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("%.4f\n",d);
    }
}