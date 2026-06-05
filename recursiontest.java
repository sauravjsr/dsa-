import java.util.Scanner;

public class recursiontest 
{
    static void nameprint(int n )
    {
        if(n==6)
        return;
        System.out.print(n+" ");
        nameprint(n+1);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // System.out.println("no of times ");
        // int n=sc.nextInt();
        int n=1;
        nameprint(n);
        
        
    }
    
}
