import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        int t=rbt.nextInt();
        int n1=t/100;
        int r1=t%100;
        int n2=r1/50;
        int r2=r1%50;
        int n3=r2/20;
        int r3=r2%20;
        int n4=r3/10;
        int r4=r3%10;
        int n5=r4/5;
        int r5=r4%5;
        int n6=r5/2;
        int r6=r5%2;
        System.out.println(t);
        System.out.println(n1+" nota(s) de R$ 100,00");
        System.out.println(n2+" nota(s) de R$ 50,00");
        System.out.println(n3+" nota(s) de R$ 20,00");
        System.out.println(n4+" nota(s) de R$ 10,00");
        System.out.println(n5+" nota(s) de R$ 5,00");
        System.out.println(n6+" nota(s) de R$ 2,00");
        System.out.println(r6+" nota(s) de R$ 1,00");
    }
}