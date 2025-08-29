import java.util.Scanner;

public class FirstJava1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three coefficients: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discrim = (b * b) - (4 * a * c);
        if (discrim > 0){
            System.out.println("There are two roots for the quadratic equation with these coefficients. ");
            double r1 = (-b + Math.sqrt(discrim)) / (2 * a);
            System.out.print(r1);
            double r2 = (-b - Math.sqrt(discrim)) / (2 * a);
            System.out.print(r2);

        } else if (discrim == 0){
            System.out.print("There is one root for the quadratic equation with these coefficients. ");
            // if the discriminant is zero, it doesn't need to be included
            double root = -b / (2 * a);
            System.out.print(root);
        } else {
            System.out.println("There are no roots for the quadratic equation with these coefficients. ");
        }
    }
}