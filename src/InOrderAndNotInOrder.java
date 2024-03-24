import java.util.Scanner;
public class InOrderAndNotInOrder {
    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        System.out.println("Enter third number: ");
        num3 = input.nextDouble();
        if ((num1 <= num2  && num2 < num3) || (num1 < num2 && num2 <= num3) || (num1 > num2 && num2 >= num3) || (num1 >= num2 && num2 > num3))
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }
    }
}
