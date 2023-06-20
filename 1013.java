import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner rbt=new Scanner(System.in);
        int max;
        int a=rbt.nextInt();
        int b=rbt.nextInt();
        int c=rbt.nextInt();
        if(a>b)
        {
            if(a>c)
            {
        max=a;
            }
            else
            {
            max=c;
            }
        }
        else if(b>c)
        {
        max=b;
        }
        else
        {
        max=c;
        }
        System.out.println(max+" eh o maior");
    }
}