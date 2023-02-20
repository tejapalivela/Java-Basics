

import java.util.Scanner;
public class Q8
{
    public static void main(String[] args)
    {
        int a=30;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int b = scanner.nextInt();

        try
        {

            int result = a/b;
            System.out.println("entered number divided by 30 gives: " + result);
            System.out.println("");
        }

        catch (ArithmeticException e)
        {
            // This code will execute an Exception is thrown
            System.out.println("Error: " + e.getMessage());
        }
        //always executes
        finally
        {
            System.out.println("Program complete.");
        }
    }

}