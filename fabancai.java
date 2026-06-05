import java.util.Scanner;

public class fabancai 
{
    public static void main(String[] args) 
    {
        int a=0,b=1,i,n,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number you want to print fabanaci upto :- ");
        n=sc.nextInt();

        for (int j = 0; j <n ; j++) 
        {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
    
}
