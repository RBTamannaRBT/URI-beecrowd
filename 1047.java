import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner rbt=new Scanner(System.in);
    int sh=rbt.nextInt();
    int sm=rbt.nextInt();
    int eh=rbt.nextInt();
    int em=rbt.nextInt();
    int ss=sh*3600+sm*60;
    int es=eh*3600+em*60;
    int s,m=0,h=0;
    if(ss>es)
    {
      s=es-ss;
      h=(s/3600)+23;
      m=((s%3600)/60)+60;
     
    }
    else if(ss<es)
    {
      s=es-ss;
       h=s/3600;
      m=(s%3600)/60;
    }
    else if(ss==es)
    {
    h=24;
    }
    System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
  }
}