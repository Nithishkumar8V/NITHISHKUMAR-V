import java.util.*;

public class Problem1 {

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        double a=s.nextDouble();

        System.out.print("Enter the value of B: ");
        double b=s.nextDouble();

        System.out.print("Enter the Operation (+,-,*,/,%) : ");
        String op=s.next();

       double result=  calc(a,b,op);
        System.out.println("Result: "+result);
    }
    static double calc(double a, double b,String op)
    {
        switch(op)
        {
            case "+" -> {
                return a+b;
            }

            case "-" -> {
                return a-b;
            }

            case "*" -> {
                return a*b;
            }

            case "/" -> {
                if(b==0)
                {
                    System.out.println("Error: Division by zero");
                }
                return a/b;
            }

            case "%" -> {
                if(b==0)
                {
                    System.out.println("Error: Modulo by zero");
                }
                return a%b;
            }

            default -> { 
                System.out.print("Invalid Operation");
                return 0;
            }
        }
    }
    
}
