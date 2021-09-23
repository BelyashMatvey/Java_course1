import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h=(n/3600)%24;
        n=n%3600;
        int pre_m=n/60;
        String m;
        if(pre_m<10){
            m="0"+ pre_m;
        }
        else{
            m=Integer.toString(pre_m);
        }
        int pre_s=n%60;
        String s;
        if(pre_s<10){
            s="0"+ pre_s;
        }
        else{
            s=Integer.toString(pre_s);
        }
        System.out.println(h+":"+m+":"+s);
    }
}
