import java.util.Scanner;

public class print {
    public static boolean check(int num) {
        boolean isprime=true;
        if(num==1) {
            return false;
        }
        else {
            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    isprime=false;
                    break;
                }
            }
            return isprime;

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter starting range");
        int start=s.nextInt();
        System.out.println("Enter ending range");
        int end=s.nextInt();

        for(int i=start;i<=end;i++) {
            if(check(i)) {
                System.out.print(i+",");
            }
        }
    }
}
