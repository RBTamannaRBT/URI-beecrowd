import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        int d=rbt.nextInt();
        int n1=d/365;
        int r1=d%365;
        int n2=r1/30;
        int r2=r1%30;
        System.out.println(n1+" ano(s)");
        System.out.println(n2+" mes(es)");
        System.out.println(r2+" dia(s)");
    }
}