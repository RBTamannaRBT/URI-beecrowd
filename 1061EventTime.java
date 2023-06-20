import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    rbt.next();
    int sd=rbt.nextInt();
    int sh=rbt.nextInt();
    rbt.next();
    int sm=rbt.nextInt();
    rbt.next();
    int ss=rbt.nextInt();
   rbt.next();
    int ed=rbt.nextInt();
    int eh=rbt.nextInt();
    rbt.next();
    int em=rbt.nextInt();
    rbt.next();
    int es=rbt.nextInt();
    int suru=ss+sm*60+sh*3600+sd*24*3600;
    int ses=es+em*60+eh*3600+ed*24*3600;
    int s=0,m=0,h=0,sec=0,d=0;
    
      s=ses-suru;
      d=s/(24*3600);
      h=(s%(24*3600))/(3600);
      m=(((s%(24*3600))%(3600))/60);
      sec=(((s%(24*3600))%(3600))%60);
    
    System.out.println(d+" dia(s)");
    System.out.println(h+" hora(s)");
    System.out.println(m+" minuto(s)");
    System.out.println(sec+" segundo(s)");
  }
}