package LineComparision;

import java.util.Scanner;

public class UseCase2 {
    public UseCase2(int x1, int x2) {
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        System.out.println("length of line x1: ");
        int x1 = sc.nextInt();
        System.out.println("length of line y1: ");
        int y1 = sc.nextInt();
        System.out.println("length of line x2: ");
        int x2 = sc.nextInt();
        System.out.println("length of line y2: ");
        int y2 = sc.nextInt();
        UseCase2 d = new UseCase2(x1,x2);
        double l1 = d.length1(x1,x2);
        double l2 = d.length1(y1,y2);
        System.out.println("length of Line1: " +l1);
        System.out.println("length of Line2: " +l2);
        if (l1==l2){
            System.out.println("Lines are Equals");

        }
        else
            System.out.println("Lines are not equal");
    }

    private double length1(int x1, int x2) {
        double length = 0;
        return length;
    }

    public double Line1(int x1,int x2){
        double length1 =	Math.sqrt((x2-x1)*(x2-x1));
        return length1;
    }
    public double Line2(int y1,int y2){
        double length2=	Math.sqrt((y2-y1)*(y2-y1));
        return length2;
    }

}
