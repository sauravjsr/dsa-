import java.util.Scanner;

public class pythag 
{
    public static void main(String[] args) 
    {

    int a,b,c,max;
    Scanner sc = new Scanner(System.in);

    System.out.println(" Enter a b and c:- ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    max=a;

    if(b>max)
    {
        max=b;
    }
    if(c>max )
    {
        max=c;
    }

    if(a==max && a*a==b*b+c*c || b==max && b*b==a*a+c*c || c==max && c*c==a*a+b*b)
    {
        
        System.out.println("right angle traingle ");
    }
    else
    {
         System.out.println("not a right angle triangle ");
    }
}
    
}
