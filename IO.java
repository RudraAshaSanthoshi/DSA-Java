import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();              // consume leftover newline

        String c = sc.nextLine();   // full line
        String s = sc.next();       // single word
        char d = sc.next().charAt(0); // single character

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = [" + c + "]");
        System.out.println("s = " + s);
        System.out.println("d = " + d);
    }
}
