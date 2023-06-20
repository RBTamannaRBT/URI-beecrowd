import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        double d=rbt.nextDouble();
        double f=rbt.nextDouble();
        double c=d/f;
        System.out.printf("%.3f km/l\n", c);
    }
}