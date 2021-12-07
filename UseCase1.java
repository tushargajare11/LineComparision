package LineComparision;
import java.util.Scanner;

public class UseCase1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        System.out.println("length of line x1: ");
        int x1=  sc.nextInt();
        System.out.println("length of line y1: ");
        int y1= sc.nextInt();
        System.out.println("length of line x2: ");
        int x2= sc.nextInt();
        System.out.println("length of line y2: ");
        int y2= sc.nextInt();
        double length =	Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("length of line : "+length);

    }

}
