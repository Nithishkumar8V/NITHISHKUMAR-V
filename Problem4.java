import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.print("Array Elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
            System.out.print(a[i]+" ");
        }

        Map<Integer,Integer> m=new HashMap<>();
        for(int i=1;i<=9;i++)
        {
            m.put(i,0);
        }
        for(int num:a)
            {
                for(int i=1;i<=9;i++)
                {
                    if(num%i==0)
                    {
                        m.put(i,m.get(i)+1);
                    }
                }
            }           
            System.out.print(m);
        }
    }    

