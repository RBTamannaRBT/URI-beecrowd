import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        int t=rbt.nextInt();
        int n1=t/3600;
        int r1=t%3600;
        int n2=r1/60;
        int r2=r1%60;
        System.out.println(n1+":"+n2+":"+r2);
    }
}