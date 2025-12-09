import java.util.*;
public class Problem2

{
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter value of A: ");
            int a=s.nextInt();

            for(int i=1;i<=a;i++)
            {
                int odd= 2*i-1;
                System.out.print(odd);

                if(i<a)
                {
                    System.out.print(", ");
                }
            }

        }    
}
