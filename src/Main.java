import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        a+=2;
        a-=(a%2);
        System.out.println(a);
    }
}
