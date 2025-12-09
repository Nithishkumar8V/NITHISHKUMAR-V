import java.util.*;
public class Problem3
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a=s.nextInt();

        int c=(a%2==0)? (a-1):a; 
        for(int i=1;i<=c;i++)
        {
            int odd=2*i-1;
            System.out.print(odd);
            if(i<c)
            {
                System.out.print(", ");
            }
        }
    }
}